/** class abstraite de facon `a donner le
type Victime a l’ensemble de objets
 * @author bardet1u
 */

abstract class Victime{

public abstract int subitFrappe(int coup);
public abstract int subitCharme(int coup);
public abstract boolean mort();
public abstract String getNom();
public abstract void attaque(Victime v);

}