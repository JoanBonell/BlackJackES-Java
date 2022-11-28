import java.util.ArrayList;
public class Mano {
    private ArrayList<Carta> mano;
    public Mano() {
        mano = new ArrayList<Carta>();
    }
    public void addCarta(Carta carta) {
        mano.add(carta);
    }
    public void removeCarta(Carta carta) {
        mano.remove(carta);
    }
    public Carta getCarta(int index) {
        return mano.get(index);
    }
    public int getValorMano() {
        int valor = 0;
        for (int i = 0; i < mano.size(); i++) {
            valor += mano.get(i).getValor();
        }
        return valor;
    }
    public String toString() {
        String mano = "";
        for (int i = 0; i < this.mano.size(); i++) {
            mano += this.mano.get(i).toString() + " ";
        }
        return mano;
    }
}
