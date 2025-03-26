# 📌 Mi App Spring Boot - Ejemplo Básico con GET y POST

Este es un proyecto sencillo de una API REST desarrollada con **Spring Boot** donde se ejemplifica el uso de:
- Archivo `pom.xml` y la gestión de dependencias.
- Propiedades en `application.properties`.
- Métodos HTTP **GET** y **POST**.
- Manejo de datos a través de un modelo (`Usuario.java`).

---

# 🎯 Objetivos del Proyecto
- Comprender el uso del archivo pom.xml y la gestión de dependencias en Maven.
- Utilizar las propiedades de configuración con application.properties.
- Implementar y probar métodos HTTP GET y POST en una API REST sencilla.

---

## 🚀 Tecnologías utilizadas
- Java 17
- Spring Boot 3.1.0
- Maven
- Visual Studio Code

---

## ⚙️ Configuración de la aplicación
En `src/main/resources/application.properties`:

# Puerto del servidor
```server.port=8081```

# Nombre de la aplicación
```spring.application.name=MiAppSpringBoot```

# Mensaje de bienvenida
```app.mensaje.bienvenida=¡Bienvenido a mi API Spring Boot!```

---

## 📌 Endpoints disponibles

| Método        | Endpoint      |  Descripción  |
| ------------- | ------------- | ------------- |
| GET           | /saludo       | Retorna un saludo básico desde el servidor.                     |
| GET           | /bienvenida   | Retorna un mensaje definido en **application.properties**.      |
| POST          | /usuario      | Recibe un JSON con datos de un usuario y responde el contenido. |

---

## 🛠 ¿Cómo ejecutar el proyecto?
- Clona este repositorio:

```
git clone https://github.com/tu-usuario/mi-app-springboot.git
```

- Accede al proyecto:

```
cd mi-app-springboot
```

- Ejecuta la aplicación:

```
mvn spring-boot:run
```

- Accede a los endpoints desde el navegador o Postman en:

```
(http://localhost:8081/)
```
---

# 📌 Autores

- Emmanuel Dávila
- Juan Diego Calle
- Simón Arenas

Proyecto de ejemplo sobre Spring Boot, Maven y APIs REST
