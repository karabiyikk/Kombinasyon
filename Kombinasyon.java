import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, fark, i, nFaktoriyel = 1, rFaktoriyel = 1, farkFaktoriyel = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Küme elemanını giriniz : ");
        n = input.nextInt();

        System.out.print("Kaç elemanlı grup oluşturulsun : ");
        r = input.nextInt();

        fark = n - r;

        for (i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        for (i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }
        for (i = 1; i <= fark; i++) {
            farkFaktoriyel *= i;
        }
        System.out.print("C(n,r) = " + (nFaktoriyel) / (rFaktoriyel * farkFaktoriyel));
    }
}
