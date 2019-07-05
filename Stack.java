public class Stack extends LinkedList {
	void push(int key) {
		insertfirst(key);
	}
	int pop() {
		if(isempty()) return Integer.MAX_VALUE;
		else {
			int x = head.data;
			deletefirst();
			return x;
		}
	}
	int peek() {
		if(head == null) {
			System.out.println("stack empty");
			return Integer.MAX_VALUE;
		}
		else return head.data;
		
	}
	boolean isempty() {
		if(head == null) return true;
		else return false;
	}
}

 