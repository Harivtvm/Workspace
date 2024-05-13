package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Violet");
		color.add("Green");
		color.add("Blue");
		System.out.println(color);
		color.add(0,"Orange");
		color.set(0,"Violet");
		System.out.println(color);
		System.out.println(color.get(1));
		color.remove("Violet");
		Collections.sort(color);
		System.out.println(color);
		/*System.out.println(color.getindex("Violet"));
		System.out.println(color.lastIndex("Violet"));
		System.out.println(color.isEmpty);*/
		ArrayList non=new ArrayList();
		non.add(2);
		non.add("Carrot");
		System.out.println(non);
		color.addAll(non);
		System.out.println(color);
		color.removeAll(non);
		System.out.println(color);
		for(String a:color) {
			System.out.println(a);}
		System.out.println();
		Iterator<String> i=color.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		}
		
	}


