DELETE FROM `forohub_api`.`topicos`;

INSERT INTO  `forohub_api`.`topicos` (titulo, mensaje, fecha_creacion, status, autor_topico_id, curso_id)
VALUES
  ('Duda sobre implementación de JWT', 'Tengo problemas para implementar la seguridad con JWT en mi aplicación Spring', '2023-04-15 10:30:00', 1, 1, 2),
  ('Creación de endpoint de autenticación', '¿Cuáles son los pasos para crear un endpoint de autenticación en mi API REST?', '2023-04-16 14:45:00', 1, 2, 2),
  ('Consulta sobre paginación en Spring', 'Cómo puedo implementar la paginación en mi API REST construida con Spring Boot', '2023-04-17 09:20:00', 1, 3, 2),
  ('Duda sobre manejo de excepciones', 'Tengo problemas para manejar las excepciones en mi aplicación Spring', '2023-04-18 16:10:00', 1, 4, 2),
  ('Optimización de consultas SQL', 'Cómo puedo optimizar las consultas SQL en mi aplicación Spring', '2023-04-19 11:40:00', 1, 5, 2);
