# Aluraforo

Esta es una API para un foro construida con Spring Boot. Permite a los usuarios registrarse, iniciar sesión y crear tópicos.

## Tecnologías Utilizadas

- Java 8+
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (Json Web Token)
- H2 Database (puede cambiarse a otra base de datos de su elección)

## Requisitos Previos

- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org/install.html)

## Configuración del Proyecto

### Clonar el Repositorio

```bash
git clone https://github.com/Sammerblade/Aluraforo.git
cd Aluraforo
Construir el Proyecto
mvn clean install
Ejecutar la Aplicación
mvn spring-boot:run
Uso de la API
Registro de Usuario
URL: /auth/register
Método: POST
Cuerpo
Ejemplo
{
    "nombre": "Juan Perez",
    "email": "juan.perez@example.com",
    "password": "password123"
}
Inicio de Sesión
URL: /auth/login

Método: POST

Cuerpo:
Ejemplooo
{
    "email": "juan.perez@example.com",
    "password": "password123"
}
Respuesta:
{
    "token": "eyJhbGciOiJIUzI1NiJ9..."
}
