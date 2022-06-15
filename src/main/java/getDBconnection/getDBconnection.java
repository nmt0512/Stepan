package getDBconnection;

import java.sql.DriverManager;
import java.sql.Connection;

public class getDBconnection {

    public static Connection getConnection() throws Exception {
        String username = "thieu";
        String pass = "nmtkma0550";
        String connectionURL = "jdbc:sqlserver://localhost:1433;database=qlsvKMA;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(connectionURL, username, pass);
        return con;
    }
}
