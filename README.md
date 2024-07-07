# API REST para Finanz365

Esta API REST está diseñada para gestionar la información de estudiantes y coordinadores académicos en el entorno educativo de Finanz365. La API permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los datos de los usuarios.

### Tecnologías Utilizadas
- **Java**
- **Spring Boot**
- **PostgreSQL**
- **Docker**
- **Maven**

### Requisitos Previos
- Java 8 o superior
- Maven 3.6.0 o superior
- Docker
- PostgreSQL

### Configuración del Entorno
1. **Clonar el Repositorio**
```
   git clone https://github.com/AngelgarciaJ/api_rest.git
   cd api_rest
``` 
### 2. Configurar la Base de Datos

- Crear una base de datos PostgreSQL.
- Actualizar el archivo application.properties con las credenciales de la base de datos.
```
spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

### 3. Construir y Ejecutar la Aplicación
```
mvn clean install
mvn spring-boot:run
```

## Endpoints de la API
Estudiantes
```
GET /estudiantes: Obtener todos los estudiantes.
GET /estudiantes/{id}: Obtener un estudiante por ID.
POST /estudiantes: Crear un nuevo estudiante.
PUT /estudiantes/{id}: Actualizar un estudiante existente.
DELETE /estudiantes/{id}: Eliminar un estudiante.
```
Coordinadores
```
GET /coordinadores: Obtener todos los coordinadores.
GET /coordinadores/{id}: Obtener un coordinador por ID.
POST /coordinadores: Crear un nuevo coordinador.
PUT /coordinadores/{id}: Actualizar un coordinador existente.
DELETE /coordinadores/{id}: Eliminar un coordinador.
```
### Ejemplos de Uso
Crear un Estudiante

```
curl -X POST "http://localhost:8080/estudiantes" -H "Content-Type: application/json" -d '{
  "nombre": "Juan Perez",
  "correo": "juan.perez@example.com",
  "telefono": "123456789"
}'
```
Obtener todos los Estudiantes
```
curl -X GET "http://localhost:8080/estudiantes" -H "Accept: application/json"
```
### Contribuciones
Las contribuciones son bienvenidas. Por favor, realiza un fork del repositorio y crea un pull request para revisarlo.
