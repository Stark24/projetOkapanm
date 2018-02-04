/**
 * 
 */
package localite.bean;

/**
 * @author Windows 10
 * 
 */
public class Localite {

	private String NomLocalite;
	private double latitude, longitude;

	public Localite() {

	}

	public Localite(String NomLocalite, double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getNomLocalite() {
		return NomLocalite;
	}

	public void setNomLocalite(String nomLocalite) {
		NomLocalite = nomLocalite;
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
}
