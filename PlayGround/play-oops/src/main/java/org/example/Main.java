package org.example;

import org.example.equals_and_hashcode.models.Student;

/**
 * @author Mohammed Sakir
 * @since ${DAY}-${MONTH}-${YEAR}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Equals and hashCode checks!");

        // Object comparison
        Student student1 = new Student();
        student1.id = 1L;
        student1.name = "student1";

        Student student2 = new Student();
        student1.id = 1L;
        student1.name = "student1";

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        // String comparison
        String s1 = "s1";
        String s2 = "s1";
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}