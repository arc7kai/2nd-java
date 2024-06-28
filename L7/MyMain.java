package com.school.Main;
// to run this program open cmd and type * java com.school.Main.MyMain *
import com.school.Student.Student;
import com.school.StudentDetails.StudentDetails;
import com.school.Teacher.Teacher;
import com.school.TeacherDetails.TeacherDetails;

public class MyMain {
    public static void main(String[] args) {
        System.err.println("I am Main");

        Student st = new Student();
        st.print();

        StudentDetails sd = new StudentDetails();
        sd.print();

        Teacher t = new Teacher();
        t.print();

        TeacherDetails tt = new TeacherDetails();
        tt.print();
    }
}
