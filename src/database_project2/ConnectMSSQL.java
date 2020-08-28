/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

/**
 *
 * @author SARK
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectMSSQL {
    
    public Connection connection;
            
    public String checkLogin(String userName,String password) {
        
        String id = "";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT username,password,EmployeeId FROM Admin");
            
            //System.out.println("parameter "+userName+" "+password);
            while (resultSet.next()) {
                String tempuser,temppass;
                tempuser = resultSet.getString("username").toString();
                temppass = resultSet.getString("password").toString();
               
                //System.out.println(tempuser+" "+temppass);
               
                
                if(tempuser.compareTo(userName)==0 && temppass.compareTo(password)==0)
                {
                    //System.out.println("paisi");
                    return resultSet.getString("EmployeeId");
                }
                
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
        
    }
    public ArrayList<MemberInfo> getMemberInfo(String query)
    {
        ArrayList<MemberInfo> database = new ArrayList();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM MEMBER "+query);
            
            
            while (resultSet.next()) {
                /*System.out.println(database.size());
                for(int i=0;i<database.size();i++)
                {
                   // System.out.println(database.get(i).getMemberId()+" "+database.get(i).getName()+" "+database.get(i).getContactNo()+" "+database.get(i).getBloodGroup()+" "+database.get(i).getSeatNo()+" "+database.get(i).getMealType());
                }*/
                MemberInfo temp = new MemberInfo();
                temp.setName(resultSet.getString("Name").toString());
                temp.setMemberId(resultSet.getString("MemberId").toString());
                temp.setFathersName(resultSet.getString("FathersName").toString());
                temp.setMothersName(resultSet.getString("MothersName").toString());
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setContactNo(resultSet.getString("ContactNo").toString());
                temp.setDateOfBirth(resultSet.getString("DateOfBirth").toString());
                temp.setBloodGroup(resultSet.getString("BloodGroup").toString());
                temp.setAddress(resultSet.getString("Address").toString());
                temp.setProfession(resultSet.getString("Profession").toString());
                temp.setGuardianContactNo(resultSet.getString("GuardianContactNo").toString());
                temp.setSeatNo(resultSet.getString("SeatNo").toString());
                temp.setMealType(resultSet.getString("MealType").toString());
                temp.setDue(resultSet.getInt("Due"));
                temp.setImage(resultSet.getBytes("Picture"));
                
                //System.out.println(resultSet.getString("Name").toString()+" "+ temp.getName());
                database.add(temp);
                
                
                /*for(int i=0;i<database.size();i++)
                {
                    System.out.println(database.get(i).getMemberId()+" "+database.get(i).getName()+" "+database.get(i).getContactNo()+" "+database.get(i).getBloodGroup()+" "+database.get(i).getSeatNo()+" "+database.get(i).getMealType());
                }*/
               
              
                
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //System.out.println(database.size());
        return database;
    }
    
    public ArrayList<RoomInfo> getRoomInfo(String query)
    {
        ArrayList<RoomInfo> database = new ArrayList();
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Room "+query);
            
            
            while (resultSet.next()) {
                
                RoomInfo temp = new RoomInfo();
                temp.setRoomId(resultSet.getString("RoomId").toString());
                temp.setBuildingNo(resultSet.getString("BuildingNo").toString());
                temp.setFloor(resultSet.getString("Floor").toString());
                temp.setType(resultSet.getString("Type").toString());
                temp.setTotalBed(resultSet.getInt("TotalBed"));
                temp.setEmptyBed(resultSet.getInt("EmptyBed"));
                
               
                database.add(temp);
              
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    
    }
    
    public ArrayList<PaymentInfo> getPaymentInfo(String query)
    {
        ArrayList<PaymentInfo> database = new ArrayList();
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Payment "+query);
            
            
            while (resultSet.next()) {
                
                PaymentInfo temp = new PaymentInfo();
                temp.setPaymentId(resultSet.getString("PaymentId").toString());
                temp.setMemberId(resultSet.getString("MemberId").toString());
                temp.setName(resultSet.getString("Name").toString());
                temp.setDateAndTime(resultSet.getString("DateAndTime").toString());
                temp.setAdminId(resultSet.getString("AdminId"));
                temp.setAmount(resultSet.getInt("Amount"));
                
               
                database.add(temp);
              
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    
    }
    
    public void addSeat(SeatInfo seat)
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            statement.executeUpdate("Insert into Seat (SeatId,RoomId,isEmpty,MemberId) values ('"+seat.getSeatId()+"','"+seat.getRoomId()+"',"+seat.getIsEmpty()+",'"+seat.getMemberId()+"')");
            
            
            
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addPayment(PaymentInfo pay) throws Exception
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            statement.executeUpdate("Insert into Payment (PaymentId,MemberId,Name,DateAndTime,AdminId,Amount) values ('"+pay.getPaymentId()+"','"+pay.getMemberId()+"','"+pay.getName()+"','"+pay.getDateAndTime()+"','"+pay.getAdminId()+"',"+pay.getAmount()+")");
            
            
            
           
            
        } catch (Exception e) {
            throw new Exception();
        }
    }
    public void addRoom(RoomInfo room)
    {
        
        for(int i=0;i<room.getTotalBed();i++)
        {
            SeatInfo s  =new SeatInfo();
            s.setIsEmpty(1);
            s.setMemberId("");
            s.setRoomId(room.getRoomId());
            s.setSeatId(room.getRoomId()+(char)(65+i));
            this.addSeat(s);
            
            
        }
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            statement.executeUpdate("Insert into Room (RoomId,BuildingNo,Floor,Type,TotalBed,EmptyBed) values ('"+room.getRoomId()+"','"+room.getBuildingNo()+"','"+room.getFloor()+"','"+room.getType()+"',"+room.getTotalBed()+","+room.getEmptyBed()+")");
            
            
            
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addMember(MemberInfo user) throws Exception
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            PreparedStatement st = connection.prepareStatement("Insert into Member(MemberId,Name,FathersName,MothersName,Email,ContactNo,DateOfBirth,BloodGroup,Address,Profession,GuardianContactNo,SeatNo,MealType,Picture,Due) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");  
            
            st.setString(1, user.getMemberId());
            st.setString(2,user.getName());
            st.setString(3,user.getFathersName());
            st.setString(4, user.getMothersName());
            st.setString(5, user.getEmail());
            st.setString(6, user.getContactNo());
            st.setString(7, user.getDateOfBirth());
            st.setString(8, user.getBloodGroup());
            st.setString(9, user.getAddress());
            st.setString(10, user.getProfession());
            st.setString(11, user.getGuardianContactNo());
            st.setString(12, user.getSeatNo());
            st.setString(13, user.getMealType());
            st.setBytes(14, user.getImage());
            st.setInt(15, user.getDue());
            st.execute();
            
        }
        catch(Exception e)
        {
            
            throw new Exception(e);
        }
    }
    
    public ArrayList<SeatInfo> getSeatInfo(String query)
    {
        ArrayList<SeatInfo> database = new ArrayList();
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Seat "+query);
            
            
            while (resultSet.next()) {
                
                SeatInfo temp = new SeatInfo();
                temp.setSeatId(resultSet.getString("SeatId").toString());
                temp.setRoomId(resultSet.getString("RoomId").toString());
                temp.setIsEmpty(resultSet.getInt("IsEmpty"));
                temp.setMemberId(resultSet.getString("MemberId").toString());
                
                
               
                database.add(temp);
              
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    
    }
    
    public void update(String dbName,String query)
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            statement.executeUpdate("Update "+dbName+" Set "+query);
            
            
            
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(String dbName,String query) throws Exception
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            statement.execute("Delete from "+dbName+" "+query);
            
            
            
           
            
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    
    public String getSerial(String query)
    {
        int serial=  0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM SerialNo ");
            
            
            while (resultSet.next()) {
                
                
                serial  = resultSet.getInt(query);
                
              
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Integer.toString(serial);
    }
    public void updateMember(MemberInfo user) throws Exception
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Hostel_Management_System;selectMethod=cursor", "sa", "123456");

            PreparedStatement st = connection.prepareStatement("Update Member Set Name = ? ,FathersName = ? ,MothersName = ?,Email = ?,ContactNo = ?,DateOfBirth = ?,BloodGroup = ?,Address = ?,Profession = ?,GuardianContactNo = ?,SeatNo = ?,MealType = ?,Picture = ?,Due = ? where MemberId  = ?");
            
            
            st.setString(1,user.getName());
            st.setString(2,user.getFathersName());
            st.setString(3, user.getMothersName());
            st.setString(4, user.getEmail());
            st.setString(5, user.getContactNo());
            st.setString(6, user.getDateOfBirth());
            st.setString(7, user.getBloodGroup());
            st.setString(8, user.getAddress());
            st.setString(9, user.getProfession());
            st.setString(10, user.getGuardianContactNo());
            st.setString(11, user.getSeatNo());
            st.setString(12, user.getMealType());
            st.setBytes(13, user.getImage());
            st.setInt(14, user.getDue());
            st.setString(15, user.getMemberId());
            st.executeUpdate();
            
        }
        catch(Exception e)
        {
            throw new Exception(e);
        }
    }
    public static void main(String[] args) {
        
    }
    
}