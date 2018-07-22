package dao;

public class MobileDAOLayerImpl implements MobileDAOLayer {
	private final long MOBILE=9234568497L;
	private final String PASSWORD="mobile123";
	private int amount=200;
	@Override
	public boolean checkvalidity(long mob, String pass) {
		if((mob==MOBILE)&&(pass.equals(PASSWORD)))
		 return true;
		else
			return false;
			
	}
	@Override
	public int paymentdetails() {
		return amount;
	}
	@Override
	public int makepayment(int amt) {
		if(amount==0)
			return -1;
		if(amt>amount)
		{
		 System.out.println("Amount to be paid is only Rs "+amount);
		 amount=amt-amount;;
		 System.out.println("Amount refunded : Rs "+amount);
		 amount=0;
		}
		else
			amount-=amt;	
		return amount;
   }
}
