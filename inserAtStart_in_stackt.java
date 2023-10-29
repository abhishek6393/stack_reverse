package recursion;

import java.util.Stack;

public class inserAtStart_in_stackt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack();
		Stack p=new Stack();
		p.push("ram");
		p.push(10);
		p.push(12.5);
		System.out.println(p);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println(s);
		insert(-55,s);
		System.out.println(s);

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
