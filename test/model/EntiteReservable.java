package model;

public abstract class EntiteReservable {
    protected CalendrierAnnuel calendrier;
    protected int numero;

    public EntiteReservable(int numero) {
        this.calendrier = new CalendrierAnnuel();
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
 
    public abstract boolean estLibre(int jour, int mois);
    
    public abstract boolean compatible(Formulaire formulaire);
    
    public abstract Reservation reserver(Formulaire formulaire);
}