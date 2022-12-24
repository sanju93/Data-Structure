package LinkedList;

import java.util.Scanner;

public class Linked_List_Main {
	


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		List<Integer> N = new List<Integer>();
		
		N.root = null;
		
		System.out.println("enter the data: ");
		
		int data = s.nextInt();
		
		
		
	    while(data != -1) {
	    	
	    	
	    	N.create(data);
	    	
	     data = s.nextInt();
	    
	    }
	    System.out.println("Before deletion the Node:-");
	    N.print();
	    
	    System.out.println("Deleted Node "+ N.delete());
	    System.out.println("After deletion the Node");
	    N.print();
	    
	    System.out.println("Enter the postion:-");
	    
	    int pos = s.nextInt();
	    
	    
	    
	    System.out.println("Delete at a position "+N.deleteP(pos));
	    
	    N.print();
	    
	    
	    
	    s.close();
		
		
		
		
	
	
	}

}
