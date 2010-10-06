package models.creatures;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * Classe de gestion d'un mouton noir.
 * 
 * @author Aurélien Da Campo
 * @version 1.0 | 27 novemenbre 2009
 * @since jdk1.6.0_16
 * @see Creature
 */
public class MoutonNoir extends Creature
{
	private static final long serialVersionUID = 1L;
	private static final Image IMAGE;
	
	static
	{
		IMAGE = Toolkit.getDefaultToolkit().getImage("img/creatures/moutonNoir.png");
	}
	
	/**
	 * Constructeur de base.
	 * 
	 * @param santeMax la sante max de cette creature
	 * @param nbPiecesDOr le nombre de pieces d'or de cette creature
	 * @param vitesse vitesse de la creature
	 */
	public MoutonNoir(long santeMax, int nbPiecesDOr, double vitesse)
	{
		this(0, 0, santeMax, nbPiecesDOr,vitesse);
	}

	/**
	 * Constructeur avec position initiale.
	 * 
	 * @param x la position sur l'axe X de la creature
	 * @param y la position sur l'axe Y de la creature
	 * @param santeMax la sante max de cette creature
	 * @param nbPiecesDOr le nombre de pieces d'or de cette creature
	 * @param vitesse vitesse de la creature
	 */
	public MoutonNoir(int x, int y, long santeMax, int nbPiecesDOr, double vitesse)
	{
		super(x, y, IMAGE.getWidth(null), IMAGE.getHeight(null), santeMax, nbPiecesDOr, vitesse,
		        Creature.TYPE_TERRIENNE, IMAGE, "Mouton");
	}

	/**
	 * Permet de copier la creature
	 */
	public Creature copier()
	{
		return new MoutonNoir(x,y,getSanteMax(),getNbPiecesDOr(),getVitesseNormale());
	}
}