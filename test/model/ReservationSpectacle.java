package model;

public class ReservationSpectacle extends Reservation {
    private int numeroZone;
    private int numeroChaise;

    public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
        super(jour, mois);
        this.numeroZone = numeroZone;
        this.numeroChaise = numeroChaise;
    }
  
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le ").append(jour).append("/").append(mois)
        .append("Place dans la zone n°").append(numeroZone).append(", chaise n°").append(numeroChaise).append(".");
        return sb.toString();
    }

    
}
