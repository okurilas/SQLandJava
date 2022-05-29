package dbo;

public abstract class DboAbs {
    protected static String tableName="";

    public DboAbs(String tableName) {
        this.tableName = tableName;
    }
}
