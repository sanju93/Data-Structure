package LinkedList;

public class List<T> {
	
	Node<Integer> root;
	
	
	public int length() {
		
		Node<Integer> temp = root;
		int length = 0;
		while(temp != null) {
			
			length++;
			temp = temp.next;
			
		}
		return length;
		
	}
	
	public void create(int data){
		
		Node<Integer> node = new Node<Integer>(data);
	  
		
		if (root == null) {
			root = node;
			return;
		}
		else {
			
			Node<Integer> temp = root;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = node;
			
			return;
			
			
			
		}
		
	}
	
	public int delete() {
		
		if (root == null) {
			return -1;
		}
		
		Node<Integer> temp = root;		
		int data = temp.data;
		temp = temp.next;
		root = temp;
		return data;
		
		
		
	}
	
	public int deleteP(int pos) {
		
		if (pos >= length()) {
			
			return -1;
			
		}
		
		Node<Integer> temp = root;
		int i = 1;
		
		while(i < pos - 1) {
			
			temp = temp.next;
			i++;
		}
		
		
		Node<Integer> temp_1 = temp;
		temp = temp.next;
	    int data = temp.data;
	    temp_1.next = temp.next;
	    
	    return data;
		
		
		
	}
	
	public void print() {
		
		Node<Integer> temp = root;
		while(temp != null) 
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	
	
	
	

}
