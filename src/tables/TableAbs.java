package tables;

import db.IDBExecutor;
import db.MySQLDBExecutor;
import dbo.Student;

import java.util.Locale;

public abstract class TableAbs<T> implements ITable<T>{

    protected IDBExecutor dbExecutor = null;

    public  TableAbs(String dbType) {
        switch(dbType.toLowerCase(Locale.ROOT)){
            case "mysql": {
                dbExecutor = new MySQLDBExecutor();
                break;
            }
        }
    }
}
