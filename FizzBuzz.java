package kenzan.java8.solution;

import java.util.Scanner;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;

public class FizzBuzz {


	public static void main(String[] a) {
		
		System.out.println("Enter FizzBuzz upper boundry:");
		
		Scanner scanner = new Scanner(System.in);
			
			int input = scanner.nextInt();

			StringBuilder fizzbuzz = new StringBuilder("fizzbuzz:");
			StringBuilder fizz = new StringBuilder("fizz:");
			StringBuilder buzz = new StringBuilder("buzz:");
			StringBuilder others = new StringBuilder();

			IntStream.rangeClosed(1, input).parallel()
			.mapToObj(i -> i % (5 * 3) == 0 ? fizzbuzz.append(i + ",")
					: i % 3 == 0 ? fizz.append(i + ",")
							: i % 5 == 0 ? buzz.append(i + ",") : others.append(i + ","))
			.collect(joining(System.lineSeparator()));
			System.out.println("FizzBuzz Results");
			System.out.println("==============================");
			
			System.out.println(fizz + "\n" + buzz + "\n" + fizzbuzz);
			
			
		} 
	}

	
	

