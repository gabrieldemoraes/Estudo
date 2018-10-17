import java.util.HashSet;
import java.util.Vector;

public class Solution {
	public static int solucao(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i = 0 ; i < A.length; i++) {
		     hset.add(A[i]);                     
		 }

		 while (hset.contains(num)) {
		        num++;
		 }

		 return num;
	}
	
	
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>(4);

	      // use add() method to add elements in the vector
	      vec.add(4);
	      vec.add(3);
	      vec.add(2);
	      vec.add(1);
	      
	      if(vec.contains(4)) {
	    	  System.out.println("PINTO DE MACACO");
	      }
	      
	      for(int i=0; i<4; i++) {
	    	  System.out.println(vec.get(i));
	    	  
	      }
	}
}
