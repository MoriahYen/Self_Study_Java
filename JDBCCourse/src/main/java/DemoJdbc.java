import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        int sid = 10;
        String sname = "Jasmine";
        int marks = 52;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Peko0622@@";
        String sql = "insert into student values(?,?,?)";

        Connection con = DriverManager.getConnection(url, uname, pass);

        PreparedStatement st= con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();

        con.close();
    }
}