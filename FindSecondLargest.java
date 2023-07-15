package SetAssessment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import weekend.day1.Array;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		
		//Create a empty Set Using TreeSet
		Set<Integer> setobj = new TreeSet<Integer>();

		int len = data.length;

		
		//Declare for loop iterator from 0 to data.length and add into Set 
		for (int i = 0; i < len; i++) {
			
			setobj.add(data[i]);
			

		}
		
		//converted Set into List 	
		
		ArrayList<Integer> Arr = new ArrayList<Integer>(setobj);
		System.out.println(Arr);
		
		//Print the second last element from List
		if (Arr.size() != 0)
		{
		 int last=Arr.get(Arr.size()-2);
		 System.out.println(last);
		}
		
	}

}
