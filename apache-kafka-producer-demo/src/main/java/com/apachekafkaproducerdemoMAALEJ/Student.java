package com.apachekafkaproducerdemoMAALEJ;

public class Student {
    public String getStudentName() {
        return studentName;
    }

    public String getIsbn() {
        return isbn;
    }

    private String studentName;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String isbn;

    public Student(String studentName, String isbn) {
        this.studentName = studentName;
        this.isbn = isbn;
    }

    public Student() {
    }
}
