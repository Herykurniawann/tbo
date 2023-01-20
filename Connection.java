import java.sql.DriverManager;

public class Connection {
    public  static  Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sewa_kamera", "root", "");
        } catch (Exception e) {
            System.out.println(e);

        }
}
}

