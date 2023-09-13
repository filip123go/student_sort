package org.filippidis.service;

import org.filippidis.model.Student;

import java.util.Comparator;

public class CustomComparator {
    public static Comparator<? super Student> customComparator() {
        Comparator<Student> customComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() == s2.getCgpa()) {
                    if (s1.getFname().equals(s2.getFname())) {
                        return s2.getId() - s1.getId();
                    } else {
                        return s2.getFname().compareTo(s1.getFname());
                    }
                } else {
                    return Double.compare(s1.getCgpa(), s2.getCgpa());
                }
            }
        };
        return customComparator;
    }
}