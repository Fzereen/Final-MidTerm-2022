package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/


	public static void main(String[] args) throws Exception {
		EmployeeInfo employee = new EmployeeInfo();
		EmployeeInfo employee1 = new EmployeeInfo(7000,23);
		EmployeeInfo employee2 = new EmployeeInfo("Fzereen","Dreamhouse");
		ConnectToSqlDB dt = new ConnectToSqlDB();
//        dt.readDataBase("test","stName");
//        dt.directDatabaseQueryExecute("select* from test","stID");
		//ConnectToSqlDB.readUserProfileFromSqlTable();





		EmployeeInfo employeeInfo = new EmployeeInfo();

		employeeInfo.transportationServices();
		employeeInfo.setName("john");
		employeeInfo.getName();
		employeeInfo.employeeId();
		employeeInfo.calculateEmployeeBonus(3);
		employee.calculateEmployeePension();



	}


}






