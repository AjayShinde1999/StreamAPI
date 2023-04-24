package streamapi;

import java.util.Arrays;
import java.util.List;

public class SecondMin {
	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(1,2,3,5,6,8,0);
		Integer ans = x.stream().sorted().skip(1).findFirst().get();
		System.out.println(ans);
	}

}
