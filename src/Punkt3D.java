public class Punkt3D extends Punkt2D {
    private int z;
    public Punkt3D(int x,int y, int z){
        super(x,y);
        this.z=z;
        liczbaWsporzednych++;
    }
    public int getZ(){
        return z;
    }

    @Override
    protected int getLiczbaWsporzednych() {
        return super.getLiczbaWsporzednych();
    }

    public void setZ(int z){
        this.z=z;
    }
    @Override
    protected double odlegloscOdZera() {
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
    }

    public String toString(){
        return "\nWspolrzedna x punktu : "+x+"\nWspolrzedna y punktu : "+y+"\nWspolrzedna y punktu : "+z+"\nOdleglosc punktu od poczatku ukladu : "+odlegloscOdZera()+"\nStworzonych punktow: "+liczbaPunktow;
    }
}
