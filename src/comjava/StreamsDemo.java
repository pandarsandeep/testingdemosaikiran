package comjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(1,78,3,2,9,22);
	List<Integer> collect = asList.stream().sorted().collect(Collectors.toList());
	System.out.println(collect);
	
	}

}
