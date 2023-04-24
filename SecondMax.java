package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMax {
	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(1,4,2,5,6,7,8);
		Integer ans = x.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(ans);
	}

}
