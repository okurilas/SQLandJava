package dbo;

public class Group{
    public final static String tableName="tblGroup";

    public Group(int id, String name, int idCurator){
        this.id=id;
        this.name=name;
        this.idCurator=idCurator;
    }
    private int id;
    private String name;
    private int idCurator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCurator() {
        return idCurator;
    }

    public void setIdCurator(int idCurator) {
        this.idCurator = idCurator;
    }
}
