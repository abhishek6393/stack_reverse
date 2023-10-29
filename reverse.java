package recursion;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		rev(s);
		System.out.println(s);

	}
	public static void rev(Stack<Integer> s) {
		if(s.empty()) {
			return;
		}
		
		int x=s.pop();
		
		rev(s);
		insert(x,s);
		
		
		
	}
	public static void insert(int item,Stack<Integer>s) {
		if(s.size()==0) {
			s.push(item);
			return;
		}
		
		
		int x=s.pop();
		insert(item,s);
		s.push(x);
		
	}

}
