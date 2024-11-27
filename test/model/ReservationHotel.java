package model;

public class ReservationHotel extends Reservation {
    private int nbLitSimple;
    private int nbLitDouble;
    private int numeroChambre;

    public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
        super(jour, mois);
        this.nbLitSimple = nbLitSimple;
        this.nbLitDouble = nbLitDouble;
        this.numeroChambre = numeroChambre;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le ").append(jour).append("/").append(mois)
        .append("Chambre n°").append(numeroChambre).append(" avec ")
        .append(nbLitSimple).append(" lit(s) simple(s) et ")
        .append(nbLitDouble).append(" lit(s) double(s).");
        return sb.toString();
    }

}
