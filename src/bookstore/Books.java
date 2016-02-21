package bookstore;

public class Books {
	private String book;
	private String auther;
	private String desc;
	private double price;
	private int quanty;
	public Books(String book, String auther, String desc, double price,
			int quanty) {
		super();
		this.book = book;
		this.auther = auther;
		this.desc = desc;
		this.price = price;
		this.quanty = quanty;
	}
	@Override
	public String toString() {
		return "Books [book=" + book + ", auther=" + auther + ", desc=" + desc
				+ ", price=" + price + ", quanty=" + quanty + "]";
	}
	
	
	

}
