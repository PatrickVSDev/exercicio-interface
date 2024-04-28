package packAula;

public class Esportivo extends Carro{

    public Esportivo(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Esportivo() {
    }

    @Override
    public void acelera() {
        System.out.println("SSSSS STUTUU STUTUTU");
    }

    @Override
    public void buzina() {
        System.out.println("BIIIIIIIIIIIIIIIIIIIIiiiiii...");
    }
}
