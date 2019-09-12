import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static List<Integer> numberWithoutEven(int i) {
        List<Integer> lista = new ArrayList<Integer>();
        return lista = IntStream.range(3, i).filter(x -> x % 2 != 0).boxed().collect(Collectors.toList());
    }


    static int[] returnPrimeNumber(List<Integer> number) {
        int[] eventab = number.stream().mapToInt(i -> i).toArray();
        Double d = (double) eventab[eventab.length - 1];
        int i = 0;
        while (i < Math.sqrt(d)) {
            for (int k = 0; k <= eventab.length - 2; ) {
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

    static int[] returnPrimeNumberWithou0(int[] tabPrimeWith0) {
        int[] primeNumber = new int[0];


        int j = 0;
        for (int i = 0; i < tabPrimeWith0.length; i++) {
            if (tabPrimeWith0[i] != 0) {
                primeNumber = Arrays.copyOf(primeNumber, primeNumber.length + 1);
                primeNumber[j] = tabPrimeWith0[i];

                j++;
            }
        }
        return primeNumber;
    }

    public static void main(String[] args) {
        Main mn = new Main();

        System.out.println(Arrays.toString(returnPrimeNumberWithou0(returnPrimeNumber(numberWithoutEven(500000)))));
    }
}
