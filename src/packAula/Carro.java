package packAula;

public abstract class Carro extends Veiculo implements IVeiculo{

    public Carro(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Carro() {
    }
}
