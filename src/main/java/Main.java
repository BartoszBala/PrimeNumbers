import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static List<Integer> numberWithoutEven(int i) {
        return IntStream.range(3, i + 1).filter(x -> x % 2 != 0).boxed().collect(Collectors.toList());
    }


    private static int[] returnPrimeNumber(List<Integer> number) {
        int[] eventab = number.stream().mapToInt(i -> i).toArray();
        double d = eventab[eventab.length - 1];
        int i = 0;
        while (i <= Math.sqrt(d)) {
            for (int k = 0; k < eventab.length - 1; ) {
                if ((k + 1) > i)
                    if ((eventab[k + 1] != 0 && eventab[i] != 0) && eventab[k + 1] % eventab[i] == 0) {
                        eventab[k + 1] = 0;

                    }

                k++;
            }

            i++;
        }

        return eventab;
    }

    private static int[] returnPrimeNumberWithou0(int[] tabPrimeWith0) {
        int[] primeNumber = {2};


        int j = 1;
        for (int value : tabPrimeWith0) {
            if (value != 0) {
                primeNumber = Arrays.copyOf(primeNumber, primeNumber.length + 1);
                primeNumber[j] = value;

                j++;
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put max value of potential prime number which would you like to print in array");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(returnPrimeNumberWithou0(returnPrimeNumber(numberWithoutEven(n)))));
    }
}
