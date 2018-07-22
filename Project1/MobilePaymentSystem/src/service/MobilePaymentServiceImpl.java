package service;

import dao.MobileDAOLayer;
import dao.MobileDAOLayerImpl;
import util.InvalidNumberException;
import util.NegativeNumberException;

public class MobilePaymentServiceImpl implements MobilePaymentService {
    MobileDAOLayer dao;
	public MobilePaymentServiceImpl() {
		dao=new MobileDAOLayerImpl();
	}

	@Override
	public boolean checkvalidity(long mob,String pass) throws InvalidNumberException, NegativeNumberException {
		 return (dao.checkvalidity(mob,pass));
	}

	@Override
	public void paymentdetails(long mobile) {
	  System.out.println("Mobile Number :"+mobile);
	  int pay=dao.paymentdetails();
	  if(pay==0)
		  System.out.println("No payment dues");
	  else
	  System.out.println("Pending Payment: Rs "+pay);
	}

	@Override
	public void makepayment(int amount) throws NegativeNumberException {
		int pay=0;
	   if(amount<0)
		  throw new NegativeNumberException("Amount cannot be negative");
	   else
		    pay=dao.makepayment(amount);
	    if(pay==-1)
	    	System.out.println("No payment dues");
	    else
	    {
	     System.out.println("Payment done successfully");
		  System.out.println("Payment Due : Rs "+pay);
	    }
	  
    }
	

}
