DELETE FROM `forohub_api`.`respuestas`;

INSERT INTO  `forohub_api`.`respuestas` (mensaje, topico_id, fecha_creacion, autor_respuesta_id, solucion)
VALUES
  ('Puedes revisar la documentación oficial de Spring Security para implementar JWT', 1, '2023-04-15 11:00:00', 2, 0),
  ('Los pasos principales son crear un endpoint de autenticación, generar el token JWT y validarlo en las demás peticiones', 2, '2023-04-16 15:00:00', 3, 0),
  ('Puedes utilizar la paginación nativa de Spring Data JPA para implementar la paginación en tu API', 3, '2023-04-17 09:45:00', 4, 0),
  ('Puedes crear un manejador de excepciones global en tu aplicación Spring para manejar los errores de manera centralizada', 4, '2023-04-18 16:30:00', 5, 0),
  ('Puedes utilizar técnicas como indexación, consultas optimizadas y caching para mejorar el rendimiento de tus consultas SQL', 5, '2023-04-19 12:00:00', 1, 1);
