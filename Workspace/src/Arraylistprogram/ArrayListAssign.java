package Arraylistprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssign {

	public static void main(String[] args) {
	ArrayList<String> colors=new ArrayList<String>();                 //generic collection
colors.add("Red");                                                   //add elements to array list
colors.add("Orange");
colors.add("Violet");
colors.add("Green");
System.out.println(colors);
System.out.println("Retrieve element at 2 : "+colors.get(2));        //retrieve an element
Iterator itr=colors.iterator();
while(itr.hasNext()) {                                               //iterate through all elements
	System.out.println(itr.next());}
	colors.remove("Violet");                                          //remove third element
	System.out.println(colors);
	System.out.println(colors.contains("Green"));                    //search an element

	}

}
