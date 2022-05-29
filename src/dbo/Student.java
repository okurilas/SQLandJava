package dbo;

public class Student{

    public final static String tableName="tblStudent";

    public Student(String fioStudent, String sex, int id, int idGroup) {

        this.fioStudent =fioStudent;
        this.sex=sex;
        this.id=id;
        this.idGroup=idGroup;

    }

    private String fioStudent;
    private String sex;
    private int id;
    private int idGroup;



    public String getFioStudent() {
        return fioStudent;
    }

    public void setFioStudent(String fioStudent) {
        this.fioStudent = fioStudent;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
}
