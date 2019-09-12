import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static int[] number(int i) {
        int[] tab = new int[i - 2];
        for (int j = 3; j <= i; j++) {

            tab[j - 3] = j;

        }
        return tab;
    }

    static int[] returnNumberWithoutEven(int[] tab) {
        int j = 0;
        int[] tab1 = new int[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                tab1 = Arrays.copyOf(tab1, tab1.length + 1);
                tab1[j] = tab[i];
                j++;
            }

        }
        return tab1;
    }

    static int[] returnPrimeNumber(int[] eventab) {
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

        System.out.println(Arrays.toString(returnPrimeNumberWithou0(returnPrimeNumber(returnNumberWithoutEven(number(500000))))));
    }
}
