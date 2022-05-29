import dbo.Student;
import tables.StudentTable;

import java.util.List;

public class MainClass {

    public static void main(String... args) {

        System.out.println("5. Вывести на экран информацию о всех студентах включая название группы и имя куратора");
        List<Student> students = new StudentTable("mysql").list();

        for (Student student:students) {
            System.out.println(student.getFioStudent());
        }
        for (Student student:students) {
            System.out.println(student.getSex());
        }





        System.out.println("6. Вывести количество студентов");
        List<Student> countStudents = new StudentTable("mysql").count();

        for (Student studentNumber:countStudents) {
            System.out.println(studentNumber);
        }


    }
}
