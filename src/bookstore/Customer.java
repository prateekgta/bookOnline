package bookstore;

public class Customer {
	private int id;
	private Books bk;
	private String email, name;
	private double subAmt;

	public Customer(int id, String email, String name, double subAmt) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.subAmt = subAmt;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + "email=" + email + "name= "+ name +", subAmt=" + subAmt + "]";
	}

	public double getSubAmt() {
		return subAmt;
	}

	public void setSubAmt(double subAmt) {
		this.subAmt = subAmt;
	}
	
	@Override
	public boolean equals(Object o)
	{
		//id & email based equality
		System.out.println("in equals");
		if (o  instanceof Customer)  {
			Customer c=(Customer) o;
			return id == c.id ;
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		return 29*id;
	}

	

}
