package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Laptop L1=new Laptop();
        Student s1=new Student(102,"Ram",L1);
        s1.doAssignment();
    }
}
