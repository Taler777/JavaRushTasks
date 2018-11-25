package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    public int hashCode() {
        return 31 * users.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Solution otherSolution = (Solution) obj;

        if (users != null ? users.equals(otherSolution.users) : otherSolution != null) return false;

        return true;
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution anotherSolution = new Solution();
        anotherSolution.users.putAll(users);

        return anotherSolution;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return 31 * age + name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;

            User otherUser = (User) obj;
            if (age != otherUser.age) return false;
            if (name != null ? name.equals(otherUser.name) : otherUser.name != null) return false;
            return true;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            User anotherUser = new User(this.age, this.name);
            return anotherUser;
        }
    }
}
