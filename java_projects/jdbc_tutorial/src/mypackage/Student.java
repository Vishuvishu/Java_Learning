package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	
	public void createdatabase() {
	 // steps for java dbms connection 1 to 5
    try{
        String url = "jdbc:mysql://localhost:3306/";
        String username ="root";
        //to get port type select @@port;
        // to get username select user(); it gives ->root@localhost than root is user
        // Class.forName("orale.jdbc.driver.OracleDriver");
        String psssword = "Admin@root1"; 
        				//step1+2: driverload + connection establish
        Connection conn = DriverManager.getConnection(url,username,psssword);
        				// step3: statementcreate
        Statement stm = conn.createStatement();
        System.out.println("connection succefull");
                        //step 4:execute query
        String query = "create database db";
        stm.execute(query); //sometime even database create it still give false
        //it gives false even database created 
        //throw execption if already db exists              
            System.out.println("dbms created succesfully");
            			//step 5:connection close
        conn.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    
}
	
	public void createTable(){
        try{
            String url = "jdbc:mysql://localhost:3306/db";//need to add database
            String username ="root";
            String psssword = "Admin@root1"; 
            Connection conn = DriverManager.getConnection(url,username,psssword);//url = url+db in argument and add String db = "db";
            System.out.println("connection succefull");

            Statement stm = conn.createStatement();
            String query = "create table student(sid int(3),sname varchar(200),semail varchar(200))";
            stm.execute(query);     
            System.out.println("tabel created succesfully");

            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
}

public void createData(){
    try{
        String url = "jdbc:mysql://localhost:3306/";
        String db ="db";
        String username ="root";
        String psssword = "Admin@root1"; 
        Connection conn = DriverManager.getConnection(url+db,username,psssword);
        System.out.println("connection succefull");
        
        
        String query = "insert into student (sid,sname,semail) values(?,?,?)"; //bcz outside " " than inside ' '
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1,3 );
        pstm.setString(2,"vishu3");
        pstm.setString(3, "hello@gmail3rf");    
        //String query = "insert into student values(1,'vishu','vishumail')";
        //  Statement stm = conn.statement();
        //  stm.execute();
        pstm.execute();//pstm.executeUpdate(); //both works
        // pstm.executeQuery();//don't work always. it works when query returns like select * ...
        System.out.println("data created succesfully");

        conn.close();

    }catch(Exception e){
        e.printStackTrace();
    }
}

public void readData(){
    try{
        String url = "jdbc:mysql://localhost:3306/";
        String db ="db";
        String username ="root";
        String psssword = "Admin@root1"; 
        Connection conn = DriverManager.getConnection(url+db,username,psssword);
        System.out.println("connection succefull");
        
        
        String query = "select * from student";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            System.out.println("id = "+rs.getInt(1));
            System.out.println("name = "+rs.getString(2));
            System.out.println("email = "+rs.getString(3));
        }
        System.out.println("data read succesfully"+rs);

        conn.close();

    }catch(Exception e){
        e.printStackTrace();
    }
}

public void updateData(){
    try{
        String url = "jdbc:mysql://localhost:3306/";
        String db ="db";
        String username ="root";
        String psssword = "Admin@root1"; 
        Connection conn = DriverManager.getConnection(url+db,username,psssword);
        System.out.println("connection succefull");
        
        
        String query = "update student set sname=? where sid=?"; //bcz outside " " than inside ' '
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(2,2);
        pstm.setString(1,"vishu2");
        
        //String query = "insert into student values(1,'vishu','vishumail')";
        //  Statement stm = conn.statement();
        //  stm.execute();
        pstm.execute();//pstm.executeUpdate(); //both works
        // pstm.executeQuery();//don't work always. it works when query returns like select * ...
        System.out.println("data updated succesfully");

        conn.close();

    }catch(Exception e){
        e.printStackTrace();
    }
}

    public void deleteData() {
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String db ="db";
            String username ="root";
            String psssword = "Admin@root1"; 
            Connection conn = DriverManager.getConnection(url+db,username,psssword);
            System.out.println("connection succefull");
            
            
            String query = "delete from student where sid=?"; //bcz outside " " than inside ' '
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,3);
            // pstm.setString(1,"vishu2");
            
            //String query = "insert into student values(1,'vishu','vishumail')";
            //  Statement stm = conn.statement();
            //  stm.execute();
            pstm.execute();//pstm.executeUpdate(); //both works
            // pstm.executeQuery();//don't work always. it works when query returns like select * ...
            System.out.println("data updated succesfully");
    
            conn.close();
    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
