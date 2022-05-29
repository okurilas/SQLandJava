package dbo;

public class Curator {


    public final static String tableName="tblCurator";

    public Curator(int id, String fioCurator){
        this.id=id;
        this.fioCurator=fioCurator;
    }
    private int id;
    private String fioCurator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFioCurator() {
        return fioCurator;
    }

    public void setFioCurator(String fioCurator) {
        this.fioCurator = fioCurator;
    }
}
