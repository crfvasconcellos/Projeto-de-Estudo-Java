package Application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Inserindo {
    static void main() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("INSERT INTO seller (Name,Email,BirthDate,BaseSalary,Departmentid) VALUES (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);

            ps.setString(1,"Malu");
            ps.setString(2,"malu@mail.com");
            ps.setDate(3,new java.sql.Date(sdf.parse("07/07/2006").getTime()));
            ps.setDouble(4,5000);
            ps.setInt(5,3);

             int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0 ){
                ResultSet rs = ps.getGeneratedKeys();

                while (rs.next()){
                    int id  = rs.getInt(1);
                    System.out.println("Pronto, o ID é " + id);
                }



            }
            else {
                System.out.println("Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();

        }

    }
}
