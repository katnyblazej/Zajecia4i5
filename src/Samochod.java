import java.util.Scanner;

public class Samochod {
    int dlugosc;
    int szerokosc;
    int predkoscJazdy;

    public Samochod(int dlugosc, int szerokosc, int predkoscJazdy) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        while(predkoscJazdy<0||predkoscJazdy>100)
        {
            Scanner podaj=new Scanner(System.in);
            System.out.println("Podaj predkosc od 0 do 100");
            predkoscJazdy=podaj.nextInt();
        }
        this.predkoscJazdy = predkoscJazdy;
    }
    public void setSzerokosc(int szerokosc){
        this.szerokosc=szerokosc;
    }

    public int getDlugosc(){
        return dlugosc;
    }
    public void setDlugosc(int dlugosc){
        this.dlugosc=dlugosc;
    }
    public int getSzerokosc(){
        return szerokosc;
    }

    public int getPredkoscJazdy(){
        return predkoscJazdy;
    }
    public void setPredkoscJazdy(int predkoscJazdy){

        while(predkoscJazdy<0||predkoscJazdy>100)
        {
            Scanner podaj=new Scanner(System.in);
            System.out.println("Podaj predkosc od 0 do 100");
            predkoscJazdy=podaj.nextInt();
        }
        this.predkoscJazdy=predkoscJazdy;
    }

}
