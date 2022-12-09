package dto;

import java.sql.Date;

public class BasketDTO {

	private Long id;
	private String name;
	private int amount;
	private Date upload;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Date getUpload() {
		return upload;
	}
	
	public void setUpload(Date upload) {
		this.upload = upload;
	}
	
	
}
