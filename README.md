# MercadoLibre Challenge

## Descripción
Construye una API en java o go que responda a:
> curl -X GET 'localhost:8080/items/$ITEM_ID'

Debe responder la información unificada consultado las siguientes APIs de Mercadolibre:

**1. API**: https://api.mercadolibre.com/items/$ITEM_ID
  a. Descripción: Información de un ítem
  b. Campos a recuperar: id, title, category_id, price, start_time, stop_time

**2. API**: https://api.mercadolibre.com/items/$ITEM_ID/children
  a. Descripción: Información de los ítems hijos de un ítem (cuando un ítem se republica se dice que tiene un hijo)
  b. Campos a recuperar: id, stop_time 

**Extra**: Agregar un recurso /health que devuelva información de métricas (usar valores randoms).

## Decisiónes 
- Se utilizó Java para implementar el challenge por contar con más conocimientos en Java que en Go.
- Se utilizó Spring Boot debido a que había documentación muy clara y me permitía avanzar rápidamente en el desarrollo de los servicios, considerando de todas formas que no es necesario para un challenge de este nivel.

## Mejoras pendientes
- Manejo de respuestas y errores de los servicios.
- Separar en distintos package items y health.
- Modularización de variables globales como la URL base de la api (https://api.mercadolibre.com/).
- Generación aleatoria de los valores de health.
- Creción de la app dentro de un container de Docker.

## Dificultades
- No haber utilizado previamente Java, únicamente contaba con conocimientos académicos de la sintaxis.
- Preparación y conocimiento del entorno de desarrollo.
- Tiempo disponible para poder investigar.
- No contar con conocimientos en Docker.
