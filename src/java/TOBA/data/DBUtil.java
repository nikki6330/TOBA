package TOBA.data;

import java.sql.SQLException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

public class DBUtil {
    public static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("UsersPU");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    
    }
    
    public static void closeStatement(Statement s) {
        try{
            if (s != null){
                s.close();
            }
        }        
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}   
