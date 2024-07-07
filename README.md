<h1 align="center"> FORO HUB - JAVA + SPRING BOOT</h1>

![Imagende portada Java](https://solace.com/wp-content/uploads/2018/12/spring-boot-java.jpg)

## Descripcion
Foro-Hub es una plataforma creada a nivel back-end donde se replica la idea de un foro en donde todos los integrantes registrados pueden hacer preguntas, expresar sus dudas, y mandar quejas sobre determinados tópicos estudiados y analizados; todo dentro de un orden y relación previsto por cada usuario registrado.
Aunque es cierto que podemos tener idea de como funciona un foro digital a nivel general, el propósito de este proyecto es saber cómo funciona detrás del foco a primera vista, es decir ¿cómo se tratan los datos?, ¿cómo se relacionan los datos de usuarios con los tópicos y respuestas?, ¿dónde se almacenan esa información? y ¿qué seguridad se puede implementar con este tipo de datos sensibles en una API REST?.
Este este proyecto llamado Foro-Hub: vamos a replicar este proceso a nivel de back-end y para eso crearemos una API REST usando Spring.

## Estado del proyecto
- El proyecto se encuentra en su versión 1.0.

## Caracteristicas de la aplicacion
El proyecto se centrará en los tópicos, respuestas, cursos y debe permitir a los usuarios:

- Crear un nuevo tópico / respuesta / usuario.
- Listar todos los tópicos / respuestas / usuarios creados.
- Mostrar un tópico específico.
- Actualizar un tópico / respuesta / usuario.
- Eliminar un tópico / respuesta / usuario.

Como resultado de las anteriores caracteristicas se formara el famoso CRUD (CREATE, READ, UPDATE, DELETE).
En resumen, el objetivo de este proyecto es implementar una API REST con las siguientes funcionalidades:

- API con rutas implementadas siguiendo las mejores prácticas del modelo REST.
- Validaciones realizadas según las reglas de negocio.
- Implementación de una base de datos relacional para la persistencia de la información.
- Servicio de autenticación/autorización para restringir el acceso a la información.

## Requisitos del sistema
>[!WARNING]
>- Windows 10 (8u51 y superiores).
>- Java 8 o superior.
>- Conexión a Internet.
>- MySQL Server.
>- IDE de Java preferido(ejemplo: IntelliJ IDEA )

## Instalación
1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de Java preferido.
3. Compila y ejecuta el archivo principal  de java para iniciar la aplicación.

##Configuración al crear el proyecto con Spring Initializr
1. Java (versión 17 en adelante)
2. Maven (Initializr utiliza la versión 4)
3. Spring Boot
4. Proyecto en formato JAR

>[!NOTE]
>No se te olvide implementar las siguientes dependencias en tu archivo pom.xml si hiciera falta:
>- Lombok.
>- Spring Web.
>- Spring Boot DevTools.
>- Spring Data JPA.
>- Flyway Migration.
>- MySQL Driver.
>- Validation.
>- Spring Security.

## Uso de la aplicacion
- Antes que nada es importante que debas crear tu base de datos local preferiblemente en Mysql, pues es el entorno de base de datos que se uso en este proyecto,  el nombre de la base de datos sera: "forohub_api".

- Verifique los siguientes datos en el archivo .propierties: spring.datasource.username=${USUARIO_DE_SU_DB}, pring.datasource.password=${CONTRASEÑA_DE_SU_DB}, así como la ruta de su base de datos spring.datasource.url=jdbc:postgresql://${SU_RUTA}/${NOMBRE_DE_SU_DB} y api.security.secret=${JWT_SECRET:(123456 por defecto}, despues de esto debera iniciar el servicio.

- Una vez creado tu base de datos local y verificado las propiedades podras hacer correr el programa en tu IDE preferido, la aplicacion creara automaticamente las tablas y el tipo de relacion en tu base de datos, y gracias a las migraciones ya previstas en el proyecto se insertaran datos que ya se proporcioanan en dichas migraciones, para que puedas hacer las consultas facilmente.

- Ya que se implemento el uso del cifrado de encriptacion de [Bcrypt][1] (Bcrypt es una función de hash de contraseñas y derivación de claves para contraseñas basada en el cifrado Blowfish) es necesario que vayas a su pagina web, escribas una contraseña de uno de los usuarios de la tabla "usuarios" (ejemplo: password123) lo encriptes y lo reemplaces en la propiedad que dice "contrasenia", esto hara posible que solamente los usuarios con esa contraseña Bcrypt puedan autenticarse a travez de  [Insomnia][2] (es un cliente REST multiplataforma, con una interfaz clara y sencilla) o tambien mediante [Swagger][3] (Swagger es un conjunto de herramientas de software de código abierto para diseñar, construir, documentar, y utilizar servicios web RESTful.)

- Una vez modificado la propiedad "cantrasenia" de la tabla "usuarios", de uno de los usuarios en la base de datos, podras autenticarte en Insomnia y generar un token que te permitira hacer las demas consultas CRUD, la cabecera y el Body de autenticacion de tipo JSON en Insomnia se debera ver de la siquiente forma:
- Requests
  `POST http://localhost:8080/login`

- Body JSON
  `{

  "email": "eddy.rodriguez@example.com",
  "contrasenia": "password123"

  }`

- De esta forma obtendras el Token autogenerado de autenticacion, luego podras hacer las demas consultas, copia ese token de autenticacion para cada requests.
  Por ejemplo para listar los topicos  crea un requests en Insomnia que se vera asi:
- Requests
  ` GET http://localhost:8080/topicos`

- Dirigete a la cabecera de ese requests que dice "Auth", escoge "Bearer Token" y pega el token que auto generaste para que puedas hacer la consulta de listar los topicos.

- Para realizar las demas consultas del CRUD en Insomnia deberas copiar el mismo token de autenticacion que tiene una duracion de 2 horas, copiaras el token en cada Requests luego buscas la cabecera Auth y en Bearer Token pegaras ese token.

## Demostracion de la aplicacion
### Funciones de la Api Rest desde Swagger
#### 1.  Inicio de la Api Rest.
![Swagger-Inicio]()
#### 2. Funciones de los topicos
![topicos]()
#### 3. Funciones de las respuestas
![respuestas]()
#### 4. Funciones de los cursos
![cursos]()
#### 5. Funcion de Autenticacion/ login
![login]()
#### 7. Diagrama de la Base de Datos
![diagrama]()
#### 8. Control de Errores, Excepciones y Seguridad de los datos
1. Control de Errores y Excepciones
- En esta aplicacion se ha prestado atención al manejo de errores, para garantizar un comportamiento robusto y una experiencia de usuario fluida, ademas se ah implementando bloques try-catch que previene errores comunes de configuracion y conexion con los datos.

2. Seguridad de los Datos
- La Api Rest utiliza Spring Security (Spring Security aporta un conjunto de clases que permite que esta autenticación se realice mediante nombre de usuario y contraseña. Para ello, utiliza la autenticación que proporciona el contenedor o utiliza un servicio de identificación basado en Single Sign On (sólo se identifica una vez) para manejar la autenticación y autorización.

- Los endpoints protegidos requieren un token JWT (JSON Based Token, https://jwt.io/) es un estándar de código abierto basado en JSON para crear tokens de acceso que nos permiten securizar las comunicaciones entre cliente y servidor) válido, estos tiempo limite en el header, para si dar una autorización y acceso a las funciones de la Api Rest.

## Tecnologías utilizadas
- Intellij IDEA.
- JDK de Java.
- Framework Spring Boot.
- MySQL Server.

## Contribuir
¡Siéntete libre de contribuir al proyecto! Si tienes ideas para nuevas características, mejoras en el código o correcciones de errores, abre un pull request y estaré encantado de revisarlo.

## Autor
Este proyecto fue creado por: Eduardo Argana Rodriguez.

>[!IMPORTANT]
> ¡Siéntete libre de contactarme si tienes alguna pregunta o sugerencia!
>- [LinkedIn][4]

## End
[1]: https://www.browserling.com/tools/bcrypt/ "Bcrypt"
[2]: https://insomnia.rest/ "Insomnia"
[3]: https://swagger.io/tools/swagger-ui/ "Swagger"
[4]: https://www.linkedin.com/in/eduardo-argana-igs/ "LinkedIn"