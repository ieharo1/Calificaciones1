# Plataforma Escalable con Balanceador Nginx y Réplicas de Aplicación

Diseño de alta disponibilidad con múltiples instancias backend y distribución de tráfico usando política `least_conn`.

## Descripción

Este servidor demuestra escalamiento horizontal real para servicios web con réplica activa-activa.

## ¿Qué hace este proyecto?

- Levanta dos instancias de aplicación Node (`app-a`, `app-b`).
- Balancea peticiones desde Nginx a la instancia menos cargada.
- Expone un endpoint de salud con identificación de instancia.
- Permite validar comportamiento de distribución bajo carga.

## Características Principales

| Característica | Descripción |
|---|---|
| Alta disponibilidad | Múltiples réplicas de app |
| Load balancing | Política `least_conn` en Nginx |
| Escalamiento horizontal | Base para ampliar instancias |
| Monitoreo básico | Respuesta con nombre de instancia |

## Stack Tecnológico

- Node.js 20
- Nginx
- Docker Compose

## Instalación y Uso

### Levantar entorno

```bash
docker compose up -d --build
```

### Probar

- `http://localhost:8089/health`

Ejecuta varias peticiones para observar alternancia de instancias.

## Variables de Entorno

- `NGINX_PORT`: puerto del balanceador.

## Estructura del Proyecto

```text
.
├── Dockerfile
├── docker-compose.yml
├── .env
├── app/
│   ├── package.json
│   └── server.js
└── nginx/
    └── default.conf
```

## Casos de Uso

- Servicios con necesidad de escalar por concurrencia.
- Bases para despliegues detrás de proxy/lb.
- Entornos de pruebas de distribución de carga.

---

## ‍ Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

-  Email: zackharo1@gmail.com
-  WhatsApp: 098805517
-  GitHub: https://github.com/ieharo1
-  Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

##  Licencia

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
