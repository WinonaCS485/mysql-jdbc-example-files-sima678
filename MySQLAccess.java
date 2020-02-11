/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqlaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;






/**
 *
 * @author Owner
 */
public class MySQLAccess {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        
      public static void main(String[] args) throws Exception {

        MySQLAccess dao = new MySQLAccess();
        //Login insertPwd = new Login();
        //insertPwd.
          //<a  href = "login.html" > < / a>

        //dao.readDataBase();
        //dao.writeResultSet(resultSet);
        //insertPwd.actionPerformed(e);

    }
/**
 * * @author Owner
 */
    //}
    private Connection connect = null;

    private Statement statement = null;

    private ResultSet resultSet = null;



    public void readDataBase() throws Exception {

        try {

            // This will load the MySQL driver, each DB has its own driver

            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the test DataBase - EVERYONE HAS ACCESS, PLEASE BE CAREFUL!!

            // Obviously, if you were distributing this file, you would not include the username and password. There are other ways...

            connect = DriverManager.getConnection("jdbc:mysql://mrbartucz.com/sx6525ir?user=sx6525ir&password=sxx6525ir");   ///CS485?user=sx6525ir&password=sx6525ir");

            

            // if you want to connect to your local machine:

            // connect = DriverManager.getConnection("jdbc:mysql://localhost/MyDatabaseName?user=MyUserName&password=MyPassword");



            // Statements allow to issue SQL queries to the database

            statement = connect.createStatement();

            // Result set get the result of the SQL query

           resultSet = statement.executeQuery("select * from sx6525ir.Sheet1");//CS485.Students");
             
            //statement.executeQuery("insert into CS485.Students where StudentID='1' value('72') ");

            writeResultSet(resultSet);
            insertPwdInfo();


        } catch (Exception e) {

            throw e;

        } finally {

            close();

        }

           

    }



    private void writeResultSet(ResultSet resultSet) throws SQLException {

        // ResultSet is initially before the first data set

        while (resultSet.next()) {

            // It is possible to get the columns via name

            // also possible to get the columns via the column number

            // which starts at 1

            // e.g. resultSet.getSTring(2);

            String studentID = resultSet.getString("StudentID");

            String firstName = resultSet.getString("FirstName");

            String lastName = resultSet.getString("LastName");

            String age = resultSet.getString("Age");
          
              //statement.executeQuery("INSERT INTO CS485.PWD");
              //statement.executeUpdate("INSERT INTO PWD " 
               //       + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield'

            System.out.println("StudentID: " + studentID);

            System.out.println("First Name: " + firstName);

            System.out.println("Last Name: " + lastName);

            System.out.println("Age: " + age);

        }

    }
    
     private void insertPwdInfo() throws SQLException {
           //JPanel JP= null; 
        // ResultSet is initially before the first data set
        //Login pwd = new Login(JP);
  //String password = pwd.Login.JP.JPasswordField;//.textFieldValue;
  //String infopwd =Login.AccessibleJComponent.class.toString();
   //textFieldValue;
          // System.out.println("Infopwd  :" +password);
            //String userName = pwd.getName();
            //String insert = "INSERT INTO PWD VALUES ('" + infopwd + ")";
            //statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfiel
            //statement.executeUpdate(insert);
           
           //System.out.println("User name" );
              //statement.executeQuery("INSERT INTO CS485.PWD");
             //
             //statement.executeUpdate("INSERT INTO PWD " 
               //       + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield'

            

        }

   // }




    // You need to close the resultSet

    private void close() {

        try {

            if (resultSet != null) {

                resultSet.close();

            }



            if (statement != null) {

                statement.close();

            }



            if (connect != null) {

                connect.close();

            }

        } catch (Exception e) {

                System.out.println("Exception");

        }

    }



}


        // TODO code application logic here
   // }
    
//}
