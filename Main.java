import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int deger;
        int sayi;
        int min=0,max=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç değer gireceksiniz: ");
        deger = inp.nextInt();

        for (int i= 1; i<=deger; i++){
            System.out.print(i + ".sayıyı giriniz: ");
            sayi = inp.nextInt();
           while (i==1){
               min = sayi;
               max = sayi;
               break;
           }if (sayi>max){
               max = sayi;
            }else if(sayi<min){
               min = sayi;
            }
        }
        System.out.println("En Küçük Sayı: " + min);
        System.out.println("En Büyük Sayı: " + max);
    }
}
