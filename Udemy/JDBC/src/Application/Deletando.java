package Application;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deletando {
    static void main() {


    Connection con = null;
    PreparedStatement st = null;

    try{
        con = DB.getConnection();
        st = con.prepareStatement("DELETE FROM department WHERE ID = ?");

        st.setInt(1,2);

        int rowsAffected = st.executeUpdate();
        System.out.println("Linhas afetadas: " + rowsAffected);


    } catch (SQLException e) {
        throw new DbIntegrityException(e.getMessage());
    }
    finally {
        DB.closeStatement(st);
        DB.closeConnection();
    }

    }
}
