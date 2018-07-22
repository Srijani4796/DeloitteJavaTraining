package dao;

public interface MobileDAOLayer {

	boolean checkvalidity(long mob, String pass);

	int paymentdetails();

	int makepayment(int amount);

}
