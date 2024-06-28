package com.school.Teacher;
// to run this code frist open cmd compile * javac -d . Teacher.java *  and run type * java com.school.Teacher.Teacher *
public class Teacher {
  public void print() {
      System.out.println("I am Teacher");
  }

  public static void main(String[] args) {
      Teacher teacher = new Teacher();
      teacher.print();
  }
}