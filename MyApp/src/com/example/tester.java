package com.example;

public class tester {
	public static void main(String[] args) {
        Person person;
        person=new Person();
        person.personId=122;
        person.personName="Anu";
        person.personAge=12;
        person.personGender='M';
        System.out.println("Id:"+person.personId + " Name:"+person.personName + " age:"+person.personAge + " gender:" +person.personGender);

}

}
