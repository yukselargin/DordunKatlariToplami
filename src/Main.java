import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i,total=0;
        Scanner enter=new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            i= enter.nextInt();
            if(i%4==0){
                total+=i;
            }
        }while(i%2==0);

        System.out.print("Toplam = "+total);
    }
}