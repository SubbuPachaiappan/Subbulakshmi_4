package task_interface_20;

public class DatabaseConnectionTester {
	public static void main(String[] args) {

		DatabaseConnector database1 = new OracleDatabase();
		database1.connectToDatabase();
		DatabaseConnector database2 = new MongoDatabase();
		database2.connectToDatabase();
		DatabaseConnector database3 = new SqlServerDatabase();
		database3.connectToDatabase();

	}
}