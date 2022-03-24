public class Fakultaet {
    public static void main(String[] args) {
        int kandidat = 20;
        System.out.println(fact(kandidat));
        System.out.println(factFor(kandidat));
        System.out.println(factRec(kandidat));

    }

    public static long factFor(long number) {
        long ergebnis = 1;
        for (long j = 1; j <= number ; j++) {
            ergebnis = ergebnis * j;
        }
        return ergebnis;
    }

    public static long fact (long number) {
        long ergebnis  = 1;
        int i = 1;
        while (i <= number) {
            ergebnis = ergebnis * i;
            i++;
        }
        return ergebnis;
    }

    public static long factRec(long number) {
        long result = 1;

        if (number <= 1) {
            result = 1;
        } else {
             result =number * factRec(number -1);
        }
        return result;
    }
}
