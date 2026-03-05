const express = require("express");
const app = express();
const port = 3000;
const instance = process.env.INSTANCE_NAME || "unknown";

app.get("/health", (_req, res) => {
  res.json({ status: "ok", service: "calificaciones1", instance });
});

app.get("/", (_req, res) => {
  res.send(`App running from ${instance}`);
});

app.listen(port, "0.0.0.0", () => {
  console.log(`Server listening on ${port}`);
});
