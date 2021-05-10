package hw1.Lessons42Interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("MySql eklendi");
		
	}

}
