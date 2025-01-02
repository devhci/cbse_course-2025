package generics;
import java.util.Arrays;
import java.util.List;


/*
Wildcards in Generics
	1.	Unbounded Wildcard: <?>
	•	Can represent any type.
	•	Example: List<?>

	2.	Upper Bounded Wildcard: <? extends Type>
	•	Represents a type that is a subtype of Type.
	•	Example: List<? extends Number>


	3.	Lower Bounded Wildcard: <? super Type>
	•	Represents a type that is a supertype of Type.
	•	Example: List<? super Integer>

 */

public class WildcardExample {
    // A method to print a list of numbers using an upper-bounded wildcard
    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer list
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        printNumbers(intList);

        // Double list
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        printNumbers(doubleList);
    }
}
