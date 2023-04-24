package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateAndSort {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,2,3,3,0,0,4,4,5,5,8,8,6,6,7);
		List<Integer> result = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(result);
	}

}
