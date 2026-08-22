package Application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Atualizando {
    static void main() {

        Connection con = null;
        PreparedStatement st =  null;

        try{
            con = DB.getConnection();
            st = con.prepareStatement("UPDATE seller " + "SET BaseSalary = BaseSalary + ? " + "WHERE (DepartmentId = ?) ");

            st.setDouble(1,200);
            st.setInt(2,2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Pronto! , Linhas afetadas: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }


    }
}
