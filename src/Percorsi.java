public class Percorsi {


    private String destination;
    private String departure;
    private int departureDate;
    private int arrivalDate;

    public Percorsi(String arrivo, String partenza, int dataPartenza, int dataArrivo) {
        destination = arrivo;
        departure = partenza;
        dataPartenza = departureDate;
        dataArrivo = arrivalDate;
    }


    public String percorso(){
        return "Il percorso va da " + departure + " fino a " + destination + ".";
    }

}
