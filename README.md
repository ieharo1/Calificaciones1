# Calificaciones1 - Nginx Load Balancer + Node replicas

Configuracion orientada a alta disponibilidad con balanceo entre dos instancias de app.

## Arquitectura

- `app-a` y `app-b`: replicas Node.
- `nginx-lb`: balanceador `least_conn`.

## Levantar

```bash
docker compose up -d --build
```

Abrir: `http://localhost:8089/health`

Haz varias peticiones para ver cambios de `instance`.

## Variables

- `NGINX_PORT`: puerto del balanceador.

## Valor para perfil

- Patron clasico de escalamiento horizontal.
- Nginx como capa de distribucion de trafico.

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
