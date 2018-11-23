package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {

        if (this == n) return true;
        if (n == null) return false;
        if (!(n instanceof Solution)) return false;
        Solution other = (Solution) n;

        if (first != null ? !first.equals(other.first) : other.first != null) return false;
        if (last != null ? !last.equals(other.last) : other.last != null) return false;


        return true;
    }

    public int hashCode() {
        return 31 * (first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
