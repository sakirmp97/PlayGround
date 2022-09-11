package org.example.equals_and_hashcode.runners;

import org.example.equals_and_hashcode.models.Student;

/**
 * @author Mohammed Sakir
 * @since 11-09-2022
 */

public class EqualsAndHashCodeRunner {
    public static void main(String[] args) {
        System.out.println("Equals and hashCode checks!");

        // Object comparison
        Student student1 = new Student();
        student1.id = 1L;
        student1.name = "student1";

        Student student2 = new Student();
        student2.id = 1L;
        student2.name = "student1";

        System.out.println(student1.equals(student2)); // false
        System.out.println(student1.hashCode()); // 356573597
        System.out.println(student2.hashCode()); // 1735600054

        // String comparison
        String s1 = "s1";
        String s2 = "s1";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.hashCode()); // 3614
        System.out.println(s2.hashCode()); // 3614

    }
}
