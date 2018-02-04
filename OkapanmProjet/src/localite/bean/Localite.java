/**
 * 
 */
package localite.bean;

/**
 * @author Windows 10
 * 
 */
public class Localite {
<<<<<<< HEAD
	private String NomLocalite;
	private int latitude, longitude;

	public String getNomLocalite() {
		return NomLocalite;
	}

	public void setNomLocalite(String nomLocalite) {
		NomLocalite = nomLocalite;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
=======
private String NomLocalite;
private double latitude,longitude;
public String getNomLocalite() {
	return NomLocalite;
}
public void setNomLocalite(String nomLocalite) {
	NomLocalite = nomLocalite;
}


public Localite() {
	
}
public Localite(String NomLocalite,double latitude,double longitude) {
	this.latitude=latitude;
	this.longitude=longitude;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
>>>>>>> f677d6dff1a984fe87ad78543bb6be9f80a8b3ba
}
