/**
 * 
 */
package Entreprise.bean;

/**
 * @author Windows 10
 * 
 */
public class Entreprise {
	private String nomEntreprise, Adresse, telephone, Email, Horaire;

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHoraire() {
		return Horaire;
	}

	public void setHoraire(String horaire) {
		Horaire = horaire;
	}

<<<<<<< HEAD
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
=======
public void setNomEntreprise(String nomEntreprise) {
	this.nomEntreprise = nomEntreprise;
}
public Entreprise() {
	
}
public Entreprise(String nomEntreprise,String Adresse,String telephone, String Email,String Horaire) {
	this.nomEntreprise=nomEntreprise;
	this.Adresse=Adresse;
	this.Email=Email;
	this.telephone=telephone;
	this.Horaire=Horaire;
}
>>>>>>> f677d6dff1a984fe87ad78543bb6be9f80a8b3ba
}
