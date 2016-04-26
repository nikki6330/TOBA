package TOBA.data;

import java.sql.*;
import TOBA.business.Account;

public class AccountDB {
    public static int insertChecking(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO Account (AccountTypeID, StartingBalance) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setDouble(1, 1);
            ps.setDouble(2, account.getChecking());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static int insertSavings(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO Account (StartingBalance) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setDouble(1, 1);
            ps.setDouble(2, account.getSavings());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
