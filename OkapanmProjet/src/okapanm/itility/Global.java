/**
 * 
 */
package okapanm.itility;

import java.util.List;

/**
 * @author H. Lincoln COMPERE
 *
 */
public interface Global<T>{
	public void Enregistrer(T obj);
	public void Modifier(T obj);
	public void Supprimer(T obj);
	public List<T> Afficher();
	public List<T> Rechercher(String motif);
}
