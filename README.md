# BolaDeDragon
# Descripción general de la App
Es una aplicacion simple donde vamos cambiando entre pantallas para conocer la historia del protagonista de dragon ball.
# Funcionamiento de la App
En la pantalla de inicio nos aparecera un titulo con una imagen y la historia del personaje,
solo debemos hacer click en la imagen para ir cambiando entre pantallas y conocer las distintas técnicas de lucha de este.
# Imagenes de la App
![This is an image](https://github.com/aplprogramacion/BolaDeDragon/blob/master/bola%20de%20dragon.png)

# App creada con jetpack Compose

Para crear esta aplicación primero le introduje las imágenes en drawable, después creamos las strings que vamos a utilizar en la app, creamos una función donde irá la vista de los textos y las imágenes, utilizando Column para generar una vista vertical de los componentes. Creamos varios ID para que estas vayan cambiando en función de la pantalla en la que nos encontremos, añadimos un evento para que al pulsar en las imágenes nos cambie a la siguiente pantalla.

Para los cambios de imágenes y textos creamos otra función, donde creamos dos variables para el manejo de eventos y utilizamos when como condición para el evento de cambio de pantallas, creando una lógica lineal entre estas.

# Requisitos previos
Poder crear un diseño simple de la IU en Compose con elementos de imagen y texto que admiten composición
Poder compilar una app interactiva que responda a un clic en un botón
Tener conocimientos básicos de composición y recomposición
Conocer los conceptos básicos del lenguaje de programación Kotlin, incluidas funciones, variables, condicionales y lambdas
