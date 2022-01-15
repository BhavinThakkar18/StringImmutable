package com.company;

public class Main {

    public static void main(String[] args) {
	    String name = "Bhavin";
        String anotherName = "Bhavin";
        String otherName = new String("Bhavin");
        System.out.println("Does name and anotherName referring to same String objects? " + (name==anotherName));
        System.out.println("Does name and otherName referring to same String objects? " + (name==otherName));
    }
    //Example to understand why string is immutable in JAVA.
    public static void addMoney(String accountHolderName,boolean ammount)
    {
        //Validation code
//        {
//
//        }
        System.out.println("Rs "+ ammount+ " has been successfully added in the name of"+ accountHolderName);
    }
    //Benifits
    //Save memory space
    //Atomicity for transactions

}
