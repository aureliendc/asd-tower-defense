/*
  Copyright (C) 2010 Aurelien Da Campo

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*/

package models.jeu;

import models.animations.Animation;
import models.creatures.Creature;
import models.creatures.VagueDeCreatures;
import models.joueurs.Equipe;
import models.joueurs.Joueur;
import models.tours.Tour;

/**
 * Interface permettant de s'abonner au jeu pour recevoir des notifications 
 * lorsque le jeu change d'état.
 * 
 * @author Aurelien Da Campo
 * @version 1.0 | mai 2010
 * @since jdk1.6.0_16
 * @see Jeu
 */
public interface EcouteurDeJeu
{
    
    // ETAT DU JEU
    
    /**
     * Permet d'informer l'écouteur que la partie à été initialisée
     */
    public void partieInitialisee();
    
    /**
     * Permet d'informer l'écouteur que la partie a démarrée
     */
    public void partieDemarree();
    
    /**
     * Permet d'informer l'écouteur que la partie est terminee
     */
    public void partieTerminee(ResultatJeu resultatJeu);
    
    /**
     * Permet d'informer l'écouteur que le joueur a gagné une étoile
     */
    public void etoileGagnee();
    
    /**
     * Permet d'informer l'écouteur que la vitesse du jeu à été modifiée
     */
    public void coeffVitesseModifie(double coeffVitesse);
    
    // JOUEURS
    
    /**
     * Permet d'informer l'écouteur qu'un joueur a rejoint la partie
     */
    public void joueurAjoute(Joueur joueur);
    
    /**
     * Permet d'informer l'écouteur qu'un joueur a été mis à jour
     */
    public void joueurMisAJour(Joueur joueur);
    
    /**
     * Permet d'informer l'écouteur qu'une equipe a perdue
     */
    public void equipeAPerdue(Equipe equipe);
    
    
    // TOURS
    
    /**
     * Permet d'informer l'écouteur qu'une tour à été posée
     */
    public void tourPosee(Tour tour);
    
    /**
     * Permet d'informer l'écouteur qu'une tour à été vendue
     */
    public void tourVendue(Tour tour);
    
    /**
     * Permet d'informer l'écouteur qu'une tour à été améliorée
     */
    public void tourAmelioree(Tour tour);
    
    
    // VAGUES
    
    /**
     * Permet d'informer l'écouteur du lancement de vague termine
     */
    public void vagueEntierementLancee(VagueDeCreatures vague);

    
    // CREATURES
    
    /**
     * Permet d'informer l'écouteur qu'une créature à été blessée
     */
    public void creatureAjoutee(Creature creature);
    
    
    /**
     * Permet d'informer l'écouteur qu'une créature à été blessée
     */
    public void creatureBlessee(Creature creature);

    /**
     * Permet d'informer l'écouteur de la mort d'une créature
     */
    public void creatureTuee(Creature creature,Joueur tueur);
    
    /**
     * Permet d'informer l'écouteur l'arrivée d'une créature
     */
    public void creatureArriveeEnZoneArrivee(Creature creature);
    
    
    // ANIMATIONS
    
    /**
     * Permet d'informer l'écouteur qu'une animation à été ajoutée
     */
    public void animationAjoutee(Animation animation);
    
    /**
     * Permet d'informer l'écouteur qu'une animation à été terminée
     */
    public void animationTerminee(Animation animation);

}
