package model;

public class ReservationRestaurant extends Reservation{
	private int numeroTable;
    private int numeroService;

    public ReservationRestaurant(int jour, int mois,int numeroService,int numeroTable) {
        super(jour, mois);
        this.numeroService = numeroService;
        this.numeroTable = numeroTable;
        
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le ").append(jour).append("/").append(mois).append("\\n")
        .append("Table ").append(numeroTable).append(" pour le ");
        if (numeroService == 1) {
            sb.append("premier");
        } else {
            sb.append("deuxième");
        }
        sb.append(" service.");
        return sb.toString();
    }
    
    
    
}
