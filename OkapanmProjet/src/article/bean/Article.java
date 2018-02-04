/**
 * 
 */
package article.bean;

/**
 * @author Windows 10
 * 
 */
public class Article {
<<<<<<< HEAD
	private double quantite, prix;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix){
		this.prix = prix;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	private String nomArticle, description;
=======
private String nomArticle,description;
private double quantite, prix;
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getQuantite() {
	return quantite;
}
public void setQuantite(double quantite) {
	this.quantite = quantite;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getNomArticle() {
	return nomArticle;
}
public void setNomArticle(String nomArticle) {
	this.nomArticle = nomArticle;
}
public Article()
{
	
}
public Article(String nomArticle,String description,double quantite, double prix) {
this.nomArticle=nomArticle;
this.description=description;
this.prix=prix;
this.quantite=quantite;
}

>>>>>>> f677d6dff1a984fe87ad78543bb6be9f80a8b3ba
}
