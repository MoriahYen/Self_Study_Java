import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        //String sql = "insert into student values (5,'John', 48)";
        //String sql = "update student set sname = 'Max' where sid = 5";
        String sql = "delete from student where sid = 5";


        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
        Statement st= con.createStatement();
        //boolean status =
        st.execute(sql);
        // 看敘述，的確是return F
        // Returns: true if the first result is a ResultSet object;
        // false if it is an update count or there are no results
        //System.out.println(status);

        con.close();
        System.out.println("Connection Closed");
    }
}