package packAula;

public class Passeio extends Carro{
    public Passeio(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Passeio() {
    }

    @Override
    public void acelera() {
        System.out.println("VRummnmnn vrunmm");
    }

    @Override
    public void buzina() {
        System.out.println("BÉEEEEEEEM");
    }
}
