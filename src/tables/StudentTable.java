package tables;

//import dbo.Group;
import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentTable extends TableAbs<Student>{

    private Student student;
    //Student student = new Student("Gubarev A","M",1,2);

    public StudentTable(String dbType) {
        super(dbType);

    }

    @Override
    public List<Student> list() {
        ResultSet resultSet = this.dbExecutor.execute(String.format("select * from %s", Student.tableName));

        List<Student> students = new ArrayList<>();

        try {
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(1),
                        resultSet.getInt(4)
                ));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            this.dbExecutor.close();
        }
        return  students;
    }

    public List<Student> count() {
        ResultSet resultSetCount = this.dbExecutor.execute(String.format("select COUNT(*) from %s", Student.tableName));

        List<Student> students = new ArrayList<>();

        try {
            while (resultSetCount.next()) {
                students.add(new Student(
                        resultSetCount.getString(2),
                        resultSetCount.getString(3),
                        resultSetCount.getInt(1),
                        resultSetCount.getInt(4)
                ));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            this.dbExecutor.close();
        }
        return  students;
    }
}
