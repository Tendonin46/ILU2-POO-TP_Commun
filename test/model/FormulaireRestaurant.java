package model;

public class FormulaireRestaurant extends Formulaire {
    private int nombrePersonnes;
    private int numeroService;

    public FormulaireRestaurant(int jour, int mois,  int nombrePersonnes,int numeroTable) {
        super(jour, mois, numeroTable);
        this.nombrePersonnes = nombrePersonnes;
 
    }

	public int getNombrePersonnes() {
        return nombrePersonnes;
    }


	public int getIdentificationEntite() {
		return numeroEntite;
	}

	public void setIdentificationEntite(int numentite) {
		this.numeroEntite=numentite;
		
	}

	public int getNumService() {
		return numeroService;
	}


    

}
