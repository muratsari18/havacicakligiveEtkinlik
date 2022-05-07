/*Hava Sıcaklığına Göre Etkinlik Önerme.
  Heat < 5 ise Kayak
  Heat 5 ve 15 Arasında ise Sinema
  Heat 10 ve 25 Arasında ise Piknik
  Heat 25 ten büyük ise yüzme
*/
import java.util.Scanner;
public class havasicakligi {
    public static void main(String[]args){
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sicakligi Giriniz :");
        heat=inp.nextInt();
        
        if (heat<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if ( heat<=25) {
                if (heat<=15)        //Burada Else if yerine 'IF' kullanıldı
                                     // çünkü o değerler varsa etkinliği yap yoksa bir şey yapma.
                    System.out.println("Sinemaya Gidebilir");
                if(heat>=10)
                    System.out.println("Piknige gidebilirsiniz");
        }
        else
            System.out.println("Yüzmeye gidebilirsiniz");


    }
}
