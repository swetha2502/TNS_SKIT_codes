package tns_trainings;
class BankAccount{
	private String bankAccNo;
	private String Password;
	private int idNo;
	public String getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getidNo() {
		return idNo;
	}
	public void setidNo(int idNo) {
		this.idNo = idNo;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ob=new BankAccount();
		ob.setBankAccNo("123A45B");
		System.out.println(" "+ob.getBankAccNo());
		ob.setPassword("@13#45$");
		System.out.println(" "+ob.getPassword());
		ob.setidNo(2);
		System.out.println(" "+ob.getidNo());

	}

}
