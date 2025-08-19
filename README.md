# API REST de Foro 

Este es un proyecto de backend desarrollado con **Java + Spring Boot**, que simula un foro donde los usuarios pueden publicar, listar y eliminar tópicos.

# Tecnologías utilizadas
- Java 17
- Spring Boot
- Spring Security + JWT
- MySQL
- Maven

# Cómo probar
1. Clona el repositorio:

2. Crea una base de datos llamada `foro` en MySQL.

3. Configura el archivo `src/main/resources/application.properties` con tus credenciales.

4. Corre el proyecto desde IntelliJ


5. Usa [Insomnia](https://insomnia.rest) o Postman para probar los endpoints.

## Endpoints
- `POST /login` → Autenticación
- `GET /topicos` → Listar tópicos
- `POST /topicos` → Crear nuevo tópico
- `DELETE /topicos/{id}` → Eliminar tópico

## Estado del proyecto
 Autenticación con JWT  
 Seguridad en endpoints  
 CRUD básico de tópicos  
 Base de datos conectada





