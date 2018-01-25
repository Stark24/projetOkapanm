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
private int latitude,longitude;
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
}
