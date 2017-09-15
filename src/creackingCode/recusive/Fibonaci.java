package creackingCode.recusive;

import java.util.LinkedList;
import java.util.List;


/**
 *
 *khaitq on 15 sept. 2017
 */

public class Fibonaci {

	public static void main(String[] args) {

		System.out.println(fin(10));
		
		System.out.println(finLink(10));
	}
	
	public static int fin(int n){
		
		int r = 0;
		
		if (n == 1) return 1;
		if (n == 2) return 1;
		
		r = fin(n-1) + fin (n-2);
		
		return r;
	}
	
	public static int finLink(int n) {
		
		List<Integer> list = new LinkedList<Integer>();
				
		for (int i = 0; i  < n; i ++) {
			
			if (i == 0) list.add(1);
			if (i == 1) list.add(1); 
			
			if (i  > 1) {
				list.add(list.get(i-1) + list.get(i-2));
			}
		}
		
		return list.get(n-1);
	}

}


