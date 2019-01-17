import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class Assignment2{

  public static Connection getConnection() throws Exception{
    try{
      String url = "jdbc:mysql://localhost:3306/sqlandjava?serverTimezone=UTC";
      String username = "user";
      String password = "password";

      Connection conn = DriverManager.getConnection(url, username, password);
      System.out.println("Connected to Database!");
      return conn;
    } catch(Exception e){System.out.println(e);}
    System.out.println("Not Connected to Database!");
    return null;
  }

  public static void main(String[]args) throws Exception{

    Connection conn = getConnection();

    Statement statement = conn.createStatement();

    ResultSet res = statement.executeQuery("Select * from cars");

    while(res.next()){
      System.out.println(res.getString("car_id")+": "+
                         res.getString("brand")+" "+
                         res.getString("color"));
    }
  }
}
