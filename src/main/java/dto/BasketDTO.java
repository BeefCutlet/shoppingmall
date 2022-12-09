package dto;

public class BasketDTO {

	private int basketNo;
	private int productNo;
	private String productName;
	private int amount;
	
	public int getBasketNo() {
		return basketNo;
	}
	
	public void setBasketNo(int basketNo) {
		this.basketNo = basketNo;
	}
	
	public int getProductNo() {
		return productNo;
	}
	
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
