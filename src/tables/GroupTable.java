package tables;

import dbo.Group;
import dbo.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupTable extends TableAbs<Group>{

    private Group group;

    public GroupTable(String dbType){
        super(dbType);
    }

    @Override
    public List<Group> list() {
        ResultSet resultSet=this.dbExecutor.execute(String.format("select * from %s", Group.tableName));

        List<Group> groups = new ArrayList<>();

        try {
            while (resultSet.next()) {
                groups.add(new Group(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3)
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            this.dbExecutor.close();
        }

        return groups;
    }
}
