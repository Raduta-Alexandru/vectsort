import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul in litere romane = ");
        String roman = sc.nextLine();
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int num = 0;
        String numeral = "IVXLCDM";
        for (int i = 0; i < s.length()-1; i++) {
            // compara sa vezi daca urmatorul caracter este mai mic decat ata de acum si dupa stii exact ce sa faci
            if() {

            }
        }
        return num;
    }
}
