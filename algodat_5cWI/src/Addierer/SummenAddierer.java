package Addierer;

import java.util.Arrays;
import java.util.Scanner;

public class SummenAddierer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char Zahl1C[] = scanner.nextLine().toCharArray();
        char Zahl2C[] = scanner.nextLine().toCharArray();

        int zahl1Length = Zahl1C.length - 1;
        int zahl2Length = Zahl2C.length - 1;

        int longestZahl;


        if (zahl1Length<=zahl2Length) {
             longestZahl = Zahl2C.length;
        } else {
             longestZahl = Zahl1C.length;
        }

        int Solution[] = new int[longestZahl + 1];


        int rem = 0;

        for (int i = 0; i < Solution.length; i++ ) {
            int num1;
            int num2;

            int x;
            if (zahl1Length < 0) {
                num1 = 0;
            } else {num1 = Character.getNumericValue(Zahl1C[zahl1Length]); }

            if (zahl2Length < 0) {
                num2 = 0;
            } else {num2 = Character.getNumericValue(Zahl2C[zahl2Length]); }

            if (num1 + num2 + rem >=10) {
                x = num1 + num2 + rem - 10;
                rem = 1;
                Solution[i] = x;
            } else {
                x = num2 + num1 +rem;
                rem = 0;
                Solution[i] = x;
            }

            zahl1Length--;
            zahl2Length--;


        }

        System.out.println(zahl1Length);
        System.out.println(Arrays.toString(Solution));

    }
}
