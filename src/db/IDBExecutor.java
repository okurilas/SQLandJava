package db;

import java.sql.ResultSet;

public interface IDBExecutor {
    ResultSet execute(String sqlRequest);
    void close();
}
