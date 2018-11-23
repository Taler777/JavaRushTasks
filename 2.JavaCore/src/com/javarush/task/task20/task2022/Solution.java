package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    // 1. Поле stream должно быть объявлено с модификатором transient.
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        // 2. В методе writeObject(ObjectOutputStream out) не должен быть вызван метод close у потока
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

        // 3. В методе readObject(ObjectInputStream in) не должен быть вызван метод close у потока полученного в качестве параметра.
        // in.close();

        // 4. В методе readObject(ObjectInputStream in) поле stream должно быть инициализировано
        // новым объектом типа FileOutputStream с параметрами(fileName, true).
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 1) создать экземпляр класса Solution
        Solution solution = new Solution("g:/1.txt");
        // 2) записать в него данные - writeObject
        solution.writeObject("Any data");
        // 3) сериализовать класс Solution - writeObject(ObjectOutputStream out)
        FileOutputStream out = new FileOutputStream("g:/1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(out);
        outputStream.writeObject(solution);
        // solution.writeObject(outputStream);
        // 4) десериализовать, получаем новый объект
        FileInputStream in = new FileInputStream("g:/1.txt");
        ObjectInputStream inputStream = new ObjectInputStream(in);
        Solution newSolution = (Solution) inputStream.readObject();
        // 5) записать в новый объект данные - writeObject
        solution.writeObject("Any data 2");

        inputStream.close();
        outputStream.close();
    }
}
