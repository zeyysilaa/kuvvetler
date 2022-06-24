import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i=0 , sayi;
        sayi = girdi.nextInt();


        while(i <= sayi){
            if (i % 4 == 0){
                System.out.println("4ün kuvvetleri : " +i);
            }
            if (i % 5 == 0){
                System.out.println("5in kuvvetleri : " +i);
            }
            if (i % 20 == 0){
                System.out.println("Ortak kuvvetler : " +i);
            }
            i++;
        }

    }
}
