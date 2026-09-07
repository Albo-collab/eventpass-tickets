# EventPass - Microservicio de Tickets

Microservicio encargado de generar y validar los códigos de acceso.

## Funcionalidades
- Generar código de acceso
- Consultar ticket por código
- Validar ticket (marcar como usado)
- Evitar que un código se use más de una vez

## Tecnologías
- Java + Spring Boot
- Base de datos (JPA)

## Endpoints principales
- POST /api/tickets
- GET /api/tickets/{codigo}
- PUT /api/tickets/{codigo}/validar
