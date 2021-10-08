public class Trasporti {



    public static void main(String[] args) {
        Autocarro autocarro = new Autocarro();
        Percorsi percorso = new Percorsi("Trieste", "Milano", 01102021,04102021);

        String targa = autocarro.getLicensePlate();

        System.out.println(targa);
    }

}
