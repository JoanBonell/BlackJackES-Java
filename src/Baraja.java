import java.util.ArrayList;


public class Baraja{
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> descarte;

    public Baraja(){
        baraja = new ArrayList<Carta>();
        descarte = new ArrayList<Carta>();
        for(int i = 0; i < 4; i++){
            for(int j = 1; j <= 13; j++){
                baraja.add(new Carta(j));
            }
        }
    }
    public Baraja generarBaraja(){
        Baraja baraja = new Baraja();
        return baraja;
    }
    public void mezclar(){
        ArrayList<Carta> mezcla = new ArrayList<Carta>();
        while(baraja.size() > 0){
            int aleatorio = (int)(Math.random() * baraja.size());
            mezcla.add(baraja.get(aleatorio));
            baraja.remove(aleatorio);
        }
        baraja = mezcla;
    }
    public Carta sacarCarta(){
        Carta carta = baraja.get(0);
        baraja.remove(0);
        descarte.add(carta);
        return carta;
    }
    public Carta getCarta(int index){
        return this.baraja.get(index);
    }

    public String toString() {
        String baraja = "";
        for (int i = 0; i < this.baraja.size(); i++) {
            baraja += this.baraja.get(i).toString() + " ";
        }
        return baraja;
    }

}
