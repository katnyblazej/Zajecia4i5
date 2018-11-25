

public class ProgramGlowny {

    public static boolean czyTrojkat(Punkt2D p1, Punkt2D p2, Punkt2D p3){
        double temp;
        double tab[]=new double[3];
        tab[0]=p1.odl(p2);
        tab[1]=p2.odl(p3);
        tab[2]=p3.odl(p1);

        for (int i = 0; i < 3; i++)
            for (int j = i + 1; j < 3; j++)
                if (tab[i] > tab[j])
                {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }

        System.out.println(tab[0]+" "+tab[1]+" "+tab[2]);
        if(tab[0]+tab[1]>=tab[2]) return true;

        else return false;
    }



    public static void main(String [] args) {


        //ZAD1
        System.out.println("Zadanie 1");
        Samochod sam1 = new Samochod(450, 178, 90);
        sam1.setDlugosc(480);
        Samochod sam2 = new Samochod(305, 137, 30);
        System.out.println("Dlugosc sam2: "+sam2.getDlugosc());
        System.out.println("Szerokosc sam2: "+sam2.getSzerokosc());
        sam2.setSzerokosc(145);
        System.out.println("Szerokosc sam2: "+sam2.getSzerokosc());
        System.out.println("Predkosc sam2: "+sam2.getPredkoscJazdy());
        sam2.setPredkoscJazdy(101);
        System.out.println("Predkosc sam2: "+sam2.getPredkoscJazdy());




        //ZAD2_3 DO POPRAWIENIA
        System.out.println("Zadanie 2 oraz 3");
        Punkt2D pkt1 = new Punkt2D(3, 4);
        System.out.println(pkt1.toString());
        Punkt2D pkt2 = new Punkt2D(9, 3);
        System.out.println(pkt2.toString());
        Punkt2D pkt3 = new Punkt2D(0, 0);
        System.out.println(pkt3.toString());

        //ZAD4
        System.out.println("Zadanie 4");

        Prostokat prost1 = new Prostokat();
        prost1.wczytajDane();
        prost1.przetworzDane();
        prost1.wyswietlWynik();

        //ZAD5
        System.out.println("Zadanie 5");
        Punkt3D pkt4 =new Punkt3D(5,6,1);
        System.out.println(pkt4.toString());



        //ZAD7
        System.out.println("Zadanie 7");
        System.out.println("Dlugosci bokow potencjalnego trojkata: ");
        boolean czy = czyTrojkat(pkt1, pkt2, pkt3);
        if (czy == true) System.out.println("Trojkat moze powstac");
        else System.out.println("Trojkat nie moze powstac");


    }

}
