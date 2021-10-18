package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
        int sumaCifara = 0;
        while(broj != 0) {
            sumaCifara = sumaCifara + (broj % 10);
            broj = broj / 10;
        }
        return sumaCifara;
    }

    public static void main(String[] args) {
        System.out.print("Unesite broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.print("Brojevi u opsegu od 1 do n zaključno koji su djeljivi sa sumom svojih cifara su: ");
        for(int i = 1; i <= n; i++)
            if(i % sumaCifara(i) == 0) System.out.print(i + " ");
    }
}
