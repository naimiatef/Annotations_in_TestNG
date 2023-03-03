# Annotations_in_TestNG
- La définition de la priorité dans les méthodes de test TestNG ne peut être que la @Test méthodes.
- Réduire le numéro de priorité; Plus élevée est la priorité de la méthode du cas de test.
- La priorité dans TestNG ne contient que la valeur entière. La valeur peut être négative, nulle ou positive.
- Si un testeur définit une priorité en décimal dans TestNG, il doit d’abord convertir en entier (via la typographie).
- Une méthode n’est autorisée à avoir qu’une seule priorité dans TestNG.
- La priorité ne peut pas passer par les fichiers XML.
-  si deux méthodes ou plus ont les mêmes priorités dans TestNG, leur séquence de test en cours d’exécution est alphabétique
- Nous pouvons attribuer des priorités négatives à une méthode.
- Avec une méthode sans priorité, la priorité est définie sur 0 par défaut.

Comment sauter des tests dans TestNG en utilisant des paramètres ?
	- Souvent, nous devons simplement sauter une méthode de cas de test et effectuer des tests. Il saute, et nous le transmettons via
	 le paramètre « enabled ».

![TestNGAnnotationsHeirarchy](https://user-images.githubusercontent.com/7100940/222734600-40f53545-cf7c-46ae-953e-38a71c726d63.jpg)
