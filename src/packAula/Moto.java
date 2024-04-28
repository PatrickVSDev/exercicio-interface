package packAula;

public class Moto extends Veiculo implements IVeiculo{
    private int numCilindradas;

    public Moto(int numPassageiros, int capTanque, int kmL, int numCilindradas) {
        super(numPassageiros, capTanque, kmL);
        this.numCilindradas = numCilindradas;
    }

    public int calcAutonomia() {
        return getCapTanque() * getKmL();
    }

    public Moto() {
        super();
    }

    public int getNumCilindradas() {
        return numCilindradas;
    }

    public void setNumCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }

    @Override
    public void acelera() {
        System.out.println("Xenhenhenhenhem papapapa xenhenhenhem");
    }

    @Override
    public void buzina() {
        System.out.println("bibibibibi");
    }
}
