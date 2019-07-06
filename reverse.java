import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		stack s = new stack();
		stack st = new stack();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		while(s.peek() != n%10) {
			s.push(n%10);
			n /= 10;
			i++;
		}
		s.pop();
		for(int j=0;j<i-1;j++) {
			st.push(s.pop());
		}
		for(int j=0;j<i-1;j++) {
			System.out.print(st.pop());
		}
	}		
}
