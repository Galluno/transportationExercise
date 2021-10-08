public class Percorsi {


    private String destination;
    private String departure;
    private int departureDate;
    private int arrivalDate;

    public Percorsi(String arrivo, String partenza, int dataPartenza, int dataArrivo) {
        destination = arrivo;
        departure = partenza;
        departureDate =dataPartenza;
        arrivalDate = dataArrivo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public int getDepartureDate() {
        return departureDate;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public String percorso(){
        return "Il percorso va da " + departure + " fino a " + destination + ".";
    }

}
