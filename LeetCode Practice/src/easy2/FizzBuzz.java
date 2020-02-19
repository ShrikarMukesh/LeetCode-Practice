package easy2;

import java.util.ArrayList;
import java.util.List;
public class FizzBuzz {
	public static void main(String[] args) {
		int till = 100;
        List<String> result = printFizzBuzz(till);
        System.out.println(result);
	}
	private static List<String> printFizzBuzz(int till) {
		final List<String> list = new ArrayList<>();
		for(int i=1;i<=till;i++) {
			if(i % 3 == 0 && i%5 == 0) {
				list.add("FizzBuzz");
			}else if(i % 3 == 0 ) {
				list.add("Fizz");
			}else if( i%5 == 0) {
				list.add("Buzz");
			}else {
				list.add(Integer.toString(i));
			}
		}
		return list;
		
	}
}
