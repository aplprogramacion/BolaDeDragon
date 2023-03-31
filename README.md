# BolaDeDragon
App donde podemos leer la historia de el protagonista de dragon ball y conocer sus distintas tecnicas de combate
![This is an image](https://github.com/aplprogramacion/BolaDeDragon/blob/master/bola%20de%20dragon.png)

#App creada con jetpack Compose

Para crear esta aplicación primero le introduci las imagenes en drawable,
despues creamos las strings que vamos a utilizar en la app,
creamos una función donde ira la vista de los textos y las imagenes, utilizando Column para
generar una vista vertical de los componentes.
creamos varias ID para que estas vayan cambiando en funcion de la pantalla en la que nos encontremos,
añadimos un evento para que al pulsar en las imagenes nos cambie a la siguiente pantalla.

Para los cambios de imagenes y textos creamos otra función,
donde creamos dos variables para el manejo de eventos y
utilizamos when como condicion para el evento de cambio de pantallas creando una logica lineal entre estas.
