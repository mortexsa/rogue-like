# rogue-like
##Manuel Utilisateur
Bonjour, Ce jeu est un jeu rogue-like ou le joueur devra traverser 4 niveaux afin de gagner et a chaque niveau il devrai tuer tout les dragons afin de passer au prochain niveau. Il aura comme arme par defaut un Baton tandis q'une autre arme sera a ca disposition sur la carte de jeu.
####Commandes de lancement du jeu:
* mvn package
* java -jar target/rogue_like-0.0.1-SNAPSHOT.jar

####Voici les differentes representations sur la carte:
* @ representera le joueur avec 20 points de vie et 20 points de magie
* D les dragons qui font 1 de dommage au joueur au corp a corp
* G les bordures
* 0 la porte dans laquelle il faudra qu'il passe afin d'aller a un autre niveau
* | representera un baton qui fait 1 de dommage
* ! representera une epais qui fait 2 de dommage
* ? representera une hache qui fait 3 de dommage

####Maintenant, voici les commandes que l'utilisateur doit taper afin de controler le jeu
* **deplacer haut** pour aller en haut
* **deplacer bas** pour aller en bas
* **deplacer droite** pour aller ver sa droite
* **deplacer gauche** pour aller vers la gauche
* **sauvegarder partie** pour sauvegarder
* **taper baton** pour taper avec le baton
* **taper epais** pour taper avec l'epais
* **taper hache** pour taper avec la hache
* **ramasser ame** pour ramasser l'arme qui est sur la carte
* **exit** pour quitter le jeu
###Et maintenant vous n'avez plus qu'a jouer


