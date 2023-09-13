package org.filippidis;

import org.filippidis.model.Student;
import org.filippidis.service.CustomComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            List<Student> studentList = new ArrayList<Student>();
            for(int i = 1; i <= n; i++) {
                System.out.println("Please provide the " + ordinal(i) + " student:");

                System.out.print("ID: ");
                int id = in.nextInt();

                System.out.print("First Name: ");
                String fname = in.next();

                System.out.print("CGPA: ");
                double cgpa = in.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);
            }
            in.close();



            // Now sort the list using the custom comparator
            studentList.sort(CustomComparator.customComparator().reversed());

            // Print the sorted list
            for (Student st: studentList) {
                System.out.println(st.getFname());
            }

        }

        static String ordinal(int i) {
            int mod100 = i % 100;
            int mod10 = i % 10;
            if(mod100 - mod10 == 10) {
                return i + "th";
            }
            switch (mod10) {
                case 1:
                    return i + "st";
                case 2:
                    return i + "nd";
                case 3:
                    return i + "rd";
                default:
                    return i + "th";
            }
        }
    }
