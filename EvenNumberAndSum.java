package streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenNumberAndSum {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = num.stream().filter(n->n%2==0).peek(n-> System.out.print(n+" ")).mapToInt(n->n).sum();
		System.out.println("The Sum Of Even Number Is : "+sum);
	}

}
