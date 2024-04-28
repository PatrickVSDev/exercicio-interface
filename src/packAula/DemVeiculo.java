package packAula;

public class DemVeiculo {

    public static void main(String[] args) {
        Moto biz = new Moto(2, 8, 20, 125);
        Esportivo ferrari = new Esportivo(2,92,1);
        Passeio celta = new Passeio(8,30,15);

        System.out.println("A Biz carrega " +biz.getNumPassageiros()
                + " passageiros, tem "+biz.getNumCilindradas()
                + " cilindradas e sua autonomia é de "+biz.calcAutonomia()
                + " km.");
        biz.acelera();
        biz.buzina();
        System.out.println();

        System.out.println("A Ferrari carrega "+ferrari.getNumPassageiros()
                +" passageiros e sua autonomia é de "+ferrari.calcAutonomia()
                +" km");
        ferrari.acelera();
        ferrari.buzina();
        System.out.println();

        System.out.println("O Celta carrega "+celta.getNumPassageiros()
                +" passageiros e sua autonomia é de "+celta.calcAutonomia()
                +" km");
        celta.acelera();
        celta.buzina();
    }
}
