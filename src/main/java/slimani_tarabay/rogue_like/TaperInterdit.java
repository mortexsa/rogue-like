package slimani_tarabay.rogue_like;
/**
 * Exception declancher lorsque le personnage n'a pas le droit de taper l'autre
 * @author marianetarabay
 *
 */
public class TaperInterdit extends Exception{
TaperInterdit(){
	super("Monstre trop loin, Interdit de taper");
}
}
