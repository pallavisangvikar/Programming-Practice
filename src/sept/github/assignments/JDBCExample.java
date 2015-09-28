package sept.github.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {
	/*f. Write a program to make use of JDBC and 
	 * insert/update/select values in the database.
	 */
	
	public static void main(String[] args) {
			
		/*try {

			insertRecordIntoTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}*/
		
		/*try {

			deleteRecordFromTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}*/
		
		/*try {

			updateRecordToTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}*/
		
		try {

			selectRecordsFromTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
		
		
	}


	private static Integer findMaxEmployeeID()throws SQLException{
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		
		String maxEmployeeID = "select MAX(Employee_ID) as EMPID from TEST_EMPLOYEES";
		
		 try {
			 dbConnection = getDBConnection();
				preparedStatement = dbConnection.prepareStatement(maxEmployeeID);
			ResultSet rs = preparedStatement.executeQuery();
			 if (rs.next()){

			    int w = rs.getInt("EMPID");
			    System.out.println("Maximum Employee ID is : " +w);
			    return w;
			 }
			                                
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}
		}
		return null; 
		
	}
		 
		 
	private static void insertRecordIntoTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		
		String insertTableSQL = "INSERT INTO TEST_EMPLOYEES"
				+ "(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID) VALUES"
				+ "(?,?,?,?,?,?)";
		
		
		

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
			
			int max_id = findMaxEmployeeID();

			preparedStatement.setInt(1, max_id+1);
			preparedStatement.setString(2, "Pallavi");
			preparedStatement.setString(3, "Sangvikar");
			preparedStatement.setString(4, "psangvikar@gmail.com");
			preparedStatement.setTimestamp(5, getCurrentTimeStamp());
			preparedStatement.setString(6,"IT_PROG");

			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Record is inserted into TEST_EMPLOYEES table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

			}
		

	}
	
	
	
	private static void deleteRecordFromTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String deleteSQL = "DELETE TEST_EMPLOYEES WHERE EMPLOYEE_ID = ?  AND FIRST_NAME = ?";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(deleteSQL);
			preparedStatement.setInt(1, 207);
			preparedStatement.setString(2, "Pallavi");

			// execute delete SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is deleted!");
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	
	private static void updateRecordToTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE TEST_EMPLOYEES SET LAST_NAME = ? "
				                  + " WHERE EMPLOYEE_ID = ?";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, "Gardas");
			preparedStatement.setInt(2, 207);

			// execute update SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is updated to TEST_EMPLOYEES table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
	
	
	private static void selectRecordsFromTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM TEST_EMPLOYEES WHERE EMPLOYEE_ID = ?";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, 207);

			// execute select SQL stetement
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				String emp_id = rs.getString("EMPLOYEE_ID");
				String first_name = rs.getString("FIRST_NAME");
				String last_name = rs.getString("LAST_NAME");


				System.out.println("EMPLOYEE_ID : " + emp_id);
				System.out.println("FIRST_NAME : " + first_name);
				System.out.println("LAST_NAME : " + last_name);


			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}


	private static Connection getDBConnection() {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			//return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr",
					"whiteboxqa");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			//return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		return connection;

	}

	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}
	
	
}
	


