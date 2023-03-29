import java.util.Scanner;
public class UcgenAlan {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double area,u;
        System.out.print("İlk kenarı giriniz:");
        a=input.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        b=input.nextInt();
        System.out.print("Ucuncu kenarı giriniz:");
        c=input.nextInt();
        System.out.println("Ucgenin cevresi:"+(a+b+c)+" br");
        u=(a+b+c)/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin alani:"+area+" br");


    }
}
