package streamapi;

import java.util.HashMap;

public class HashMapIterate {
	public static void main(String[] args) {
		HashMap<Integer,String> x = new HashMap<>();
		x.put(1, "AJAY");
		x.put(2, "AJIT");
		x.put(3, "ABHI");
		
		x.entrySet().stream().forEach(e->{
			System.out.println(e.getKey()+" "+e.getValue());
		});
	}

}
