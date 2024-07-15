/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author semoz
 */
public class dbconnect {

    //CHECK EL USER FE EL DATABASE WALLA LA
    public boolean Validate(Register r) throws SQLException {

        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String SQLquery = "SELECT * FROM USERS WHERE USERNAME = '" + r.getUserName() + "' AND USERPASSWORD = '" + r.getPassword() + "'";

        PreparedStatement ps = con.prepareStatement(SQLquery);
        ResultSet st = ps.executeQuery();

        if (st.next()) {
            return true;
        }
        return false;
    }

    public LinkedList<Report> showReport() throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String SQLquery = "SELECT * FROM REPORT";
        PreparedStatement ps = con.prepareStatement(SQLquery);
        ResultSet st = ps.executeQuery();

        LinkedList<Report> rs = new LinkedList<>();

        while (st.next()) {
            String week = st.getString("WEEK");
            String sales = st.getString("SALES");
            String profit = st.getString("PROFIT");

            Report r = new Report(week, sales, profit);

            rs.add(r);
        }

        return rs;
    }

    public LinkedList<Product> showProduct() throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String SQLquery = "SELECT * FROM PRODUCT";
        PreparedStatement ps = con.prepareStatement(SQLquery);
        ResultSet st = ps.executeQuery();

        LinkedList<Product> rs = new LinkedList<>();

        while (st.next()) {
            String proid = st.getString("PROID");
            String proname = st.getString("PRONAME");
            String procolor = st.getString("PROCOLOR");
            String proprice = st.getString("PROPRICE");

            Product r = new Product(proid, proname, procolor, proprice);

            rs.add(r);
        }

        return rs;
    }

    //insert product price inside database
    public boolean InsertData(Product p) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String SQLquery = "INSERT INTO PRODUCTS (PROID,PRONAME,PROPRICE,PROCOLOR) VALUES (?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(SQLquery);
        ps.setString(1, p.getProdName());
        ps.setString(2, p.getProPrice());
        ps.setString(3, p.getProColor());
        ps.executeUpdate();
        con.close();
        return true;
    }

    //insert product price inside database
    public boolean InsertReport(Report r) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String SQLquery = "INSERT INTO REPORT (WEEK,SALES,PROFIT) VALUES (?,?,?)";

        PreparedStatement ps = con.prepareStatement(SQLquery);
        ps.setString(1, r.getWeek());
        ps.setString(2, r.getSales());
        ps.setString(3, r.getProfit());
        ps.executeUpdate();
        con.close();
        return true;
    }

    public void AddProduct(Product p1) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);
        String SQLQuarey = "Insert Into Product (PROID,PRONAME,PROCOLOR,PROPRICE) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(SQLQuarey);
        ps.setString(1, p1.getProdId() + "");
        ps.setString(2, p1.getProdName());
        ps.setString(3, p1.getProColor());
        ps.setString(4, p1.getProPrice() + "");
        ps.executeUpdate();
        con.close();

    }

    public Employee EmployeeSalary(String id) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String sqlQuery = "Select * from EMPOLYEE where ID ='" + id + "'";
        PreparedStatement pst = con.prepareStatement(sqlQuery);
        ResultSet rs = pst.executeQuery();

        rs.next();
        String eid = rs.getString("ID");
        String name = rs.getString("NAME");
        String salary = rs.getString("SALARY");
        String workingH = rs.getString("WORKING_HOURS");
        String attendance = rs.getString("ATTENDANCE");
        String edate = rs.getString("DATE");
        salary= salary.replaceAll("$", "");
        Employee e = new Employee(Integer.parseInt(eid), name, Integer.parseInt(salary), Integer.parseInt(workingH), attendance.equals("attend"), edate);
        return e;
    }

    public Employee EmployeeAttendace(String date) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";
        Connection con = DriverManager.getConnection(host, dbUser, dbPass);

        String sqlQuery = "Select * from EMPOLYEE where DATE ='" + date + "'";
        PreparedStatement pst = con.prepareStatement(sqlQuery);
        ResultSet rs = pst.executeQuery();

        rs.next();
        String eid = rs.getString("ID");
        String name = rs.getString("NAME");
        String salary = rs.getString("SALARY");
        String workingH = rs.getString("WORKING_HOURS");
        String attendance = rs.getString("ATTENDANCE");
        String edate = rs.getString("DATE");

        Employee e = new Employee(Integer.parseInt(eid), name, Integer.parseInt(salary), Integer.parseInt(workingH), attendance.equals("attend"), edate);
        return e;
    }

    public boolean RemoveProduct(int id) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection conn = DriverManager.getConnection(host, dbUser, dbPass);
        String SQLQuarey = "DELETE FROM PRODUCT where PROID = ?";
        PreparedStatement ps = conn.prepareStatement(SQLQuarey);
        ps.setString(1, id + "");
        //  ResultSet rs= ps.executeQuery();
        ps.executeUpdate();
        conn.close();
        return true;
    }

    public boolean EditProduct(String proId, String proPrice) throws SQLException {
        String host = "jdbc:derby://localhost:1527/project";
        String dbUser = "adminProject";
        String dbPass = "333";

        Connection conn = DriverManager.getConnection(host, dbUser, dbPass);
        String SQLQuarey = "UPDATE PRODUCT SET PROPRICE = ? where PROID = ?";
        PreparedStatement ps = conn.prepareStatement(SQLQuarey);
        ps.setString(1, proPrice);
        ps.setString(2, proId);
        //  ResultSet rs= ps.executeQuery();
        ps.executeUpdate();
        conn.close();
        return true;
    }

    public static void main(String[] args) throws SQLException {
//        Register r1 = new Register("ceo", "333");
//        Register r2 = new Register("ceo", "123");

        dbconnect d = new dbconnect();
//        System.out.println(d.Validate(r1));
//        System.out.println(d.Validate(r2));
//
//        Product p = new Product("cargo pants", "250", "black");
//        System.out.println(d.InsertData(p));

//        LinkedList<Product> p2 = d.showProduct();
//
//        for (int i = 0; i < p2.size(); i++) {
//            System.out.println(p2.get(i).prodId);
//            System.out.println(p2.get(i).prodName);
//            System.out.println(p2.get(i).proColor);
//            System.out.println(p2.get(i).proPrice);
//        }
        d.EditProduct("5", "123");
        LinkedList<Product> p2 = d.showProduct();
        for (int i = 0; i < p2.size(); i++) {
            System.out.println(p2.get(i).prodId);
            System.out.println(p2.get(i).prodName);
            System.out.println(p2.get(i).proColor);
            System.out.println(p2.get(i).proPrice);
        }
    }

}
