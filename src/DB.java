
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {

    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/";
    final private String encode = "?useUnicode=true&characterEncoding=utf-8";

    private String dbName = "susatis";
    private String userName = "root";
    private String userPass = "";

    private Connection con = null;
    private Statement st = null;
    private PreparedStatement pst = null;

    public DB() {
    }

    public DB(String dbName, String userName, String userPass) {
        this.dbName = dbName;
        this.userName = userName;
        this.userPass = userPass;
    }

    // baðlan methodu
    public Statement connect() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + dbName + encode, userName, userPass);
            st = con.createStatement();
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error : " + e);
        }
        return st;
    }

    // prepared statement
    public PreparedStatement pConnect(String query) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url + dbName + encode, userName, userPass);
            pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.err.println("Connection Error : " + e);
        }
        return pst;
    }

}
