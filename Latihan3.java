import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        
        int jumlahVokal = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char ch = kalimat.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o' ||
                ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'O') {
                jumlahVokal++;
            }
        }
        
        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap: " + jumlahVokal);
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil: " + jumlahVokal);
                break;
        }

        System.out.print("Kalimat terbalik: ");
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i));
        }
        System.out.println();
        
        scanner.close();
    }
}