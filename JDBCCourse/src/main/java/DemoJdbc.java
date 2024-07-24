import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "select * from student";

        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery(sql); // executeQuery不會改變DB的東西
//        System.out.println(rs.next());  // 有下一行data就會return T
//        rs.next();  // 不然pointer或指向first row之前
//        String name = rs.getString("sname");
//        System.out.println(name);

        while(rs.next()) {
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("Connection Closed");
    }
}