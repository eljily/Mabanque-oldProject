package org.sid.entities;

import java.util.Date;

public class CompteCourant extends Compte{
	private double decouvert ;

	public CompteCourant() {
		super();
	}

	public CompteCourant(String codecompte, Date dateCreation, double solde, Client client, double decouvert) {
		super(codecompte, dateCreation, solde, client);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	} 
	
	

}
