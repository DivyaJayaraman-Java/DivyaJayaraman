import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Problem4 {

    public static HashMap<Integer, Integer> countMultiples(List<Integer> numbers) {
        // Hashmap to store the count of multiples
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // values from 1 to 9
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Iterate all num in list
        for (int number : numbers) {
            // Check if the number is a multiple of 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    // If number is a multiple of i, increment the count
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        // Input list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(9);
        numbers.add(12);
        numbers.add(46);
        numbers.add(76);
        numbers.add(82);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);

        // count of multiples
        HashMap<Integer, Integer> result = countMultiples(numbers);


        System.out.println(result);
    }
}
