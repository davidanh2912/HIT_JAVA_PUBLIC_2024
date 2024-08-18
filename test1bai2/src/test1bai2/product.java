package test1bai2;

public class product {
	private String product_id;
	private String product_name;
	private double product_price;
	private int product_total;

	public product(String product_id, String product_name, double product_price, int product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	public String getProduct_ID() {
		return product_id;
	}

	public String getProduct_Name() {
		return product_name;
	}

	public double getProduct_Price() {
		return product_price;
	}

	public int getProduct_Total() {
		return product_total;
	}

	public void setProduct_ID(String product_id) {
		this.product_id = product_id;
	}

	public void setProduct_Name(String product_name) {

		this.product_name = product_name;
	}

	public void setProduct_Price(double product_price) {

		this.product_price = product_price;
	}

	public void setProduct_Total(int product_total) {

		this.product_total = product_total;
	}
	

}
