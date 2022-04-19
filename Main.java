import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException{
        DBHelper dbHelper=new DBHelper();
        Connection connection=null;
        PreparedStatement statement=null;
        try{
            connection=dbHelper.getConnection();
            System.out.println("Bağlantı sağlandı");
            String sql="delete from city where id=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4084);
            statement.executeUpdate();
            System.out.println("Silindi");
        }catch (SQLException e){
            dbHelper.showErrorMessage(e);
        }finally {
            statement.close();
            connection.close();
        }
    }
}