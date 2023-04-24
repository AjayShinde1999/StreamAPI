package streamapi;

import java.util.Arrays;
import java.util.List;

public class MinNumber {
	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(0, 3, 2, 1, 5, 7);
		Integer min = x.stream().min(Integer::compareTo).get();
		System.out.println(min);
	}

}
