package streamapi;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {

		List<Integer> x = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 8);

		Integer max = x.stream().max(Integer::compareTo).get();
		System.out.println(max);
	}

}
