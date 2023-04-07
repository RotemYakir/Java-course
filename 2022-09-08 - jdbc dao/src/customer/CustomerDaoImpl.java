package customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CustomerDaoImpl implements CustomerDao {


	@Override
	public void addMoney(Connection con, int customerId, double amout) {
		try {
		String sql = "update customer set balance = balance + ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, amout);
			pstmt.setInt(2, customerId);
			int rows = pstmt.executeUpdate();
			if (rows == 0) {
				throw new CustomerException("addMoney to customer " + customerId + " failed - not found");
			}
		} catch (SQLException e) {
			throw new CustomerException("addMoney to customer " + customerId + " failed", e);
		}

	}

	@Override
	public void takeMoney(Connection con, int customerId, double amout) {
		String sql = "update customer set balance = balance - ? where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDouble(1, amout);
			pstmt.setInt(2, customerId);
			int rows = pstmt.executeUpdate();
			if (rows == 0) {
				throw new CustomerException("takeMoney to customer " + customerId + " failed - not found");
			}
		} catch (SQLException e) {
			throw new CustomerException("takeMoney to customer " + customerId + " failed", e);
		}

	}

}