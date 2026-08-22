package Application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transacoes {
    static void main() {

        Connection con  = null;
        Statement st = null;

        try{
            con = DB.getConnection();

            con.setAutoCommit(false);

            st = con.createStatement();

            int rows1 = st.executeUpdate("UPDATE  seller SET BaseSalary = 2090 WHERE DepartmentId = 1");


            System.out.println("Rows 1 = " + rows1);

//            int x = 1;
//            if(x < 2){
//                throw new SQLException("Fake Error");
//            }

            int rows2 = st.executeUpdate("UPDATE  seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            System.out.println("Rows 2 = " + rows2 );

            con.commit();

        }
        catch (SQLException e){
            try {
                con.rollback();
                throw new DbException("A transação rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error no Rollback! Caused By: " + ex.getMessage());
            }
        }
        finally {

        }


    }
}
