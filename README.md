# BolaDeDragon
# Descripción general de la App
El código es una aplicación Android que muestra información sobre el personaje Goku de la serie Dragon Ball. El archivo contiene dos funciones principales: MainActivity y GokuTextAndImage.

La clase MainActivity es la actividad principal de la aplicación y se encarga de establecer el contenido de la pantalla. La función setContent se utiliza para establecer el contenido de la pantalla en el GokuApp componible, que se encarga de mostrar la información del personaje Goku.

La función GokuTextAndImage es un componible que muestra una imagen y un texto relacionado con el personaje Goku. La imagen se muestra en un marco de imagen redondeado y se puede hacer clic en ella. El texto se muestra en la parte inferior de la imagen y describe la imagen.

El componible GokuApp es la función principal que se llama en setContent. En esta función se declaran dos variables mutables currentGoku y changeImage, que se utilizan para controlar la imagen que se muestra. La función utiliza un when para cambiar entre diferentes imágenes y textos que se muestran utilizando el componible GokuTextAndImage.

En general, la aplicación muestra información sobre el personaje Goku y le permite al usuario interactuar con la imagen haciendo clic en ella.

# Imagenes de la App
![This is an image](https://github.com/aplprogramacion/BolaDeDragon/blob/master/bola%20de%20dragon.png)


# Requisitos previos
Poder crear un diseño simple de la IU en Compose con elementos de imagen y texto que admiten composición
Poder compilar una app interactiva que responda a un clic en un botón
Tener conocimientos básicos de composición y recomposición
Conocer los conceptos básicos del lenguaje de programación Kotlin, incluidas funciones, variables, condicionales y lambdas
