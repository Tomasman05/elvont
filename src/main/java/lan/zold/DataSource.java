package lan.zold;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DataSource {
    public abstract void connectDb();
    public void closeDb(Connection conn) throws SQLException{
        conn.close();
    };
}
