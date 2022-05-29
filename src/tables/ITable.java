package tables;

import dbo.Group;
import dbo.Student;

import java.util.List;

public interface ITable<T> {

    List<T> list();
    //List<Student> list();
    //List<Group> list();
}
