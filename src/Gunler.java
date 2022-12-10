import java.util.Scanner;

public class Gunler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun icindenBir Sayı Giriniz(1-7)");
        int gun = scanner.nextInt();

        switch (gun){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta İci");
            case 6 :
            case 7 :
                System.out.println("Hafta Sonu");



        }





    }
}
