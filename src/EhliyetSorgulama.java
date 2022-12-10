import java.util.Scanner;
public class EhliyetSorgulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yas = scanner.nextInt();
        if(yas >= 18){
            System.out.println("Ehliyet Alabilirsiniz" );

        }else {
            System.out.println("Ehliyet Alamazsınız");
        }

        }

    }

