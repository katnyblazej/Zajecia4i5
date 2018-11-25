import java.util.Scanner;

public class Prostokat {
    private double a,b,pole;
    Scanner podaj=new Scanner(System.in);
    Prostokat(){
        a=0;
        b=0;
    }
    protected void wczytajDane(){

        System.out.println("Podaj a :");
        b=podaj.nextDouble();
        System.out.println("Podaj b :");
        a=podaj.nextDouble();
    }
    protected void przetworzDane(){
        pole=a*b;
    }

    protected void wyswietlWynik(){
        System.out.println("Dlugosc boków a= "+a+", b= "+b);
        System.out.printf("Pole =%.2f ",pole);
        System.out.println();

    }
}
