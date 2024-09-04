package org.example;

public class Student {
    private int Roll;
    private String Name;
    private Laptop  dell;
    public void doAssignment(){
        dell.doCoding();
    }

    public Student() {
    }

    public Student(int roll, String name, Laptop dell) {
        Roll = roll;
        Name = name;
        this.dell = dell;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Laptop getDell() {
        return dell;
    }

    public void setDell(Laptop dell) {
        this.dell = dell;
    }
}