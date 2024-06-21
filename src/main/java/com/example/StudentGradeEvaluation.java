package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        

        
        System.out.print("Enter your name: ");
        String str = scanner.nextLine();
        System.out.println("Name: "+str);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Age: "+age);

        System.out.println("Enter your exam score");
        int grade = scanner.nextInt();
        System.out.println("Score" +grade);

        String sr=scanner.nextLine();
        System.out.println("Grade: A"+sr);

        
        

       
    }
}
