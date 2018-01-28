/**
 * 
 */
package okapanm.itilite;

import java.util.List;

/**
 * @author Lincoln
 *
 */
public interface Global<T>{
	public void Enregistrer(T obj);
	public void Modifier(T obj);
	public void Supprimer(T obj);
	public List<T> Afficher();
	public List<T> Rechercher(String motif);
}
