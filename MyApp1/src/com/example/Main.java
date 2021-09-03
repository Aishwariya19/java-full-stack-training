package com.example;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		
		Item myItem=new Item();
		myItem.setItemId(UUID.randomUUID().toString());
		myItem.setItemName("Laptop");
		myItem.setItemType(ItemType.CONSUMER_ELECTRONICS);
		System.out.println("Displaying Item details:=====\n");
		System.out.println("ID: "+myItem.getId()+" Item ID: "+myItem.getItemId()+"\nItem Name: "+myItem.getItemName()+"\nItem Type: "+myItem.getItemType().getMessage());
		System.out.println(Item.id);
		Item myItem2=new Item();
		myItem2.setItemId(UUID.randomUUID().toString());
		myItem2.setItemName("Soap");
		myItem2.setItemType(ItemType.HEALTH_CARE);
		System.out.println("Displaying Item details:=====\n");
		System.out.println("ID: "+myItem2.getId()+" Item ID: "+myItem2.getItemId()+"\nItem Name: "+myItem2.getItemName()+"\nItem Type: "+myItem2.getItemType().getMessage());
		System.out.println(Item.id);
		
	}

}
