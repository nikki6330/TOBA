package TOBA.data;

import java.sql.*;
import TOBA.business.Account;

public class AccountDB {
    public static int insert(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO Account (Balance, Checking) "
                + "VALUES (?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setDouble(1, account.getBalance());
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
}
