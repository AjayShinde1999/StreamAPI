package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,4,6,2,3,9,0,8,7,5);
		List<Integer> sort = num.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
	}

}
