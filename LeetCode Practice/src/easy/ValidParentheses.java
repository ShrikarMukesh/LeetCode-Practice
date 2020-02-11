package easy;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
        String s = "()[]{}";
        String s1 = "{[]}";
        String s2 = "([)]";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
	}
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(' || c=='{' || c=='[') {
				stack.push(c);
			}else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
