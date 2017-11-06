package kenzan.java8.solution;

import java.util.Scanner;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;

public class FizzBuzz {

	public static void main(String[] a) {

		String ans = "Yes";
		int input;
		Scanner scanner = null;
	
		do {
			try {
				System.out.println("Enter FizzBuzz upper boundry:");
				scanner = new Scanner(System.in);

				input = Integer.parseInt(scanner.nextLine());

				StringBuilder fizzbuzz = new StringBuilder("fizzbuzz:");
				StringBuilder fizz = new StringBuilder("fizz:");
				StringBuilder buzz = new StringBuilder("buzz:");
				StringBuilder others = new StringBuilder();

				//Logic of FizzBuzz
				IntStream.rangeClosed(1, input).parallel()
						.mapToObj(i -> i % (5 * 3) == 0 ? fizzbuzz.append(i + ",")
								: i % 3 == 0 ? fizz.append(i + ",")
										: i % 5 == 0 ? buzz.append(i + ",") : others.append(i + ","))
						.collect(joining(System.lineSeparator()));
				
				//Print Result
				System.out.println("FizzBuzz Results");
				System.out.println("==============================");

				System.out.println(fizz + "\n" + buzz + "\n" + fizzbuzz);

				System.out.println("Do you want to continue?(Yes/No)");
				ans = scanner.nextLine();

			} catch (Exception e) {
				System.out.println("Invalid input.Upper boundry should be numeric value");
				if (scanner != null) {
					System.out.println("Do you want to continue?(Yes/No)");
					ans = scanner.nextLine();
				}
			}finally{
				if(!ans.equalsIgnoreCase("yes")){
					scanner.close();
				}
			}

		} while (ans.equalsIgnoreCase("yes"));

	}
}
