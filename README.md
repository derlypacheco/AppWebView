
<div style="display: flex;flex-direction: row;justify-content: center" width="100%">
      <img src="https://raw.githubusercontent.com/derlypacheco/AppWebView/master/app/src/main/res/drawable/logo.png"></img>
</div>

## Descripción
Este repositorio contiene el código fuente de una aplicación para Android desarrollada en Java que utiliza un WebView para abrir una aplicación web. 
La aplicación web se muestra dentro de la aplicación móvil y está habilitada para el uso de JavaScript, lo que permite una experiencia de usuario más interactiva y dinámica. 
Además, la aplicación cuenta con la capacidad de seleccionar imágenes del dispositivo local para ser utilizadas dentro de la aplicación web.

La aplicación utiliza la clase WebView de Android para cargar la aplicación web dentro del MainActivity. 
La clase WebView permite mostrar contenido web dentro de una aplicación móvil sin necesidad de abrir un navegador externo. 
Para habilitar el uso de JavaScript, se utiliza el método setJavaScriptEnabled() de la clase WebView.

Para seleccionar imágenes del dispositivo local, la aplicación utiliza un Intent para abrir la galería de imágenes del dispositivo y permitir que el usuario seleccione una imagen. 
La ruta de la imagen seleccionada se pasa a la aplicación web a través de un método JavaScript que se inyecta en la página web cargada en el WebView.

La aplicación es sencilla y fácil de usar, y proporciona una forma conveniente de acceder a una aplicación web dentro de una aplicación móvil. 
Este enfoque puede ser útil para desarrolladores que deseen crear una aplicación móvil para su sitio web sin tener que escribir código nativo complejo.

Para utilizar este repositorio, simplemente clone el repositorio y abra el proyecto en Android Studio. 
La aplicación se puede ejecutar en un dispositivo Android o en un emulador de Android. Asegúrese de tener instalado el SDK de Android y las herramientas de construcción de Android para poder compilar y ejecutar la aplicación.

## Uso 
Para adaptar tu aplicación Web solo ir dentro del proyecto a MainActivity y remplazar la variable **url por el enlace de tu Aplicación Web** Recuerda que para esto la aplicación ya debería estar en línea funcionando, esta plantilla 
se han realizado pruebas consultando datos, haciendo inicios de sesión, manejo de variables de servidor, cargando imágenes, generando reportes a excel.

<img src="https://dderly.com/wp-content/uploads/2024/03/url-acceso.png" />

Si requieres cambiar el icono que se muestra en la pantalla mientras carga la aplicación realiza lo siguiente:

- Carga una nueva imagen dentro de la ruta: res/drawable

<img src="https://dderly.com/wp-content/uploads/2024/03/ruta-logo.png" />
<img src="https://dderly.com/wp-content/uploads/2024/03/image-asset.png" />
<img src="https://dderly.com/wp-content/uploads/2024/03/select-image.png" />

- Abre archivo de activity_main.xml dentro del componente ImagenWiew solo remplaza la ruta de la imagen

<img src="https://dderly.com/wp-content/uploads/2024/03/activitymain-ruta-logo.png" />

## Resultado 

<img src="https://dderly.com/wp-content/uploads/2024/03/app-web.png" />

## Servicios 
Si está buscando servicios de desarrollo web o windows, lo invitamos a visitar nuestra página web en https://dderly.com para obtener más información sobre nuestras ofertas de servicios.

Ofrecemos una amplia gama de servicios, que incluyen desarrollo de sitios web, desarrollo de aplicaciones,
diseño de interfaz de usuario y experiencia de usuario, integración de sistemas y más. 
Trabajamos con una variedad de tecnologías y plataformas, como C#, PHP, Windows Form, Xamarin, JavaScript, HTML, CSS y más.

Nuestro enfoque se centra en la creación de soluciones innovadoras y a medida que satisfagan las necesidades únicas de nuestros clientes. 
Trabajamos en estrecha colaboración con nuestros clientes para comprender sus objetivos y requisitos, y luego desarrollamos soluciones que superen sus expectativas.

Si está interesado en alguno de nuestros servicios de desarrollo, lo invitamos a ponerse en contacto con nosotros a través de nuestra página web. 

Estaremos encantados de responder cualquier pregunta que tenga y proporcionarle más información sobre cómo podemos ayudarlo a lograr sus objetivos de desarrollo. 
