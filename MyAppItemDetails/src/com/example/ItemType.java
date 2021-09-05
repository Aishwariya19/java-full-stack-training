package com.example;

public enum ItemType {
	CONSUMER_ELECTRONICS("This item belongs to consumer electronics"),
	HEALTH_CARE("This item belongs to health care"),
	MOBILE("This Item belongs to mobile devices");

	private String message;
	private ItemType(String message) {
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}
	
	

}