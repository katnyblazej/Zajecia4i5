public class Punkt2D {
    protected int x,y,liczbaWsporzednych=0;
      public static int liczbaPunktow=0;
    Punkt2D(int x,int y){
        this.x=x;
        this.y=y;
        liczbaPunktow++;
    }
    protected int getY()
    {
        return y;
    }
    protected int getX()
    {
        return x;
    }

    protected void setY(int y)
    {
        this.y=y;
        liczbaWsporzednych++;
    }
    protected void setX(int x)
    {
        this.x=x;
        liczbaWsporzednych++;
    }

    protected int getLiczbaWsporzednych(){
        return liczbaWsporzednych;
    }
    protected double odlegloscOdZera(){
       return Math.sqrt((Math.pow((x), 2)+Math.pow((y), 2)));
    }

    protected double odl(Punkt2D a){
        return Math.sqrt((Math.pow(a.getX()-x,2)+Math.pow(a.getY()-y,2)));
    }

    public String toString(){
        return "\nWspolrzedna x punktu : "+x+", Wspolrzedna y punktu : "+y+"\nOdleglosc punktu od poczatku ukladu : "+odlegloscOdZera()+"\nStworzonych punktow: "+liczbaPunktow;
    }


}
