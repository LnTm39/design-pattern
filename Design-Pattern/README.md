## Lancer le projet

- `src`: le dossier pour gérer les sources
- `lib`: le dossier pour gérer les dépendances*

Prérequis :

- Installer Java : https://www.java.com/fr/
- Lancer VSCode
- Effectuer un "git clone design-pattern" 
- Ouvrir le dossier "Design-Pattern"
- Aller dans le dossier "src"
- Ouvrir le fichier Main.java
- Lancer la commande cd 'c:\Users\UserName\Desktop\Design-Pattern'; & 'C:\Program Files\Java\jre-version_de_java\bin\java.exe' '-cp' 'C:\Users\UserName\Desktop\Design-Pattern\bin' 'Main' dans un terminal 

## Section Réponse : 

Question 1 : Le Design Pattern de création Factory Method est adapté pour résoudre ce problème car il permet de déléguer la création d'objets (cartes de paiement) aux sous-classes en fonction des besoins spécifiques des clients. Dans cette situation, les clients sont divisés en deux catégories, et chacune a des besoins spécifiques en termes de type de carte de paiement. Le Factory Method permet de définir une interface commune pour la création de cartes de paiement, mais chaque catégorie de client peut avoir sa propre implémentation de cette interface pour créer les cartes appropriées.

Question 2 : (diagramme_factory_method.png)

Question 3 : Voir Main.java pour lancer

Question 4 : Ce code respecte le principe Open/Closed du SOLID car il est ouvert à l'extension (on peut ajouter de nouvelles catégories de cartes ou de nouveaux types de cartes sans modifier le code existant) mais fermé à la modification (le code existant n'est pas modifié pour ajouter de nouvelles fonctionnalités). Pour ajouter ou supprimer une catégorie de client, il suffit de créer ou supprimer une sous-classe de Client avec la nouvelle catégorie, sans modifier le reste du code.

Question 5 : (diagramme_abstract_factory.png)