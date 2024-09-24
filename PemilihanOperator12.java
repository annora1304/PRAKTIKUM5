import java.util.Scanner;

public class PemilihanOperator12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        if (operator == '+') {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (operator == '/') {
            if (angka2 != 0) {
                System.out.println("Hasil: " + (angka1 / angka2));
            } else {
                System.out.println("Error: Pembagian dengan nol!");
            }
        } else {
            System.out.println("Error: Operator tidak dikenal!");
        }

        scanner.close();
    }
}
