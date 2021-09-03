package com.example;

public class Item {
	//class variable
	public static int id;
	private String itemId;
	private String itemName;
	private ItemType itemType;
	public Item() {
		super();
		id++;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		Item.id = id;
	}
	
	

}