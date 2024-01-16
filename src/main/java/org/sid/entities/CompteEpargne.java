package org.sid.entities;

import java.util.Date;

public class CompteEpargne extends Compte {
	private double taux ;
	public CompteEpargne(String codecompte, Date dateCreation, double solde, Client client, double taux) {
		super(codecompte, dateCreation, taux, client);
		this.taux = taux;
	}



	public CompteEpargne() {
		super();
	}



	public double getTaux() {
		return taux;
	}



	public void setTaux(double taux) {
		this.taux = taux;
	}
	

}
