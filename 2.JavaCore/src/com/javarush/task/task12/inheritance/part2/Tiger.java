package com.javarush.task.task12.inheritance.part2;

public class Tiger extends NewCat implements GetHeight, HasWeight{
    @Override
    public void getValue() {

    }

    @Override // изменился тип возвращаемых данных с NewCat на Tiger
    public Tiger getAge(){
        return this;
    }

    public String saySomething(){
        return "Meow";
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.getValue();
        NewCat newTiger = new Tiger();
        // newTiger.saySomething(); не будет работать в таком виде, потому что ссылка типа класса-родителя NewCat
        ((Tiger) newTiger).saySomething(); // поэтому требует сузить тип ссылки до класса-потомка
    }
}
