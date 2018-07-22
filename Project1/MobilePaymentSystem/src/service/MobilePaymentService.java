package service;

import util.InvalidNumberException;
import util.NegativeNumberException;

public interface MobilePaymentService {

	boolean checkvalidity(long mob, String pass) throws InvalidNumberException, NegativeNumberException;

	void paymentdetails(long mobile);

	void makepayment(int amount) throws NegativeNumberException;

}
