package TOBA.data;

import java.sql.*;
import TOBA.business.Account;

public class AccountDB {
    public static int insert(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO Account (Checking, Savings) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setDouble(2, account.getChecking());
            ps.setDouble(3, account.getSavings());
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
