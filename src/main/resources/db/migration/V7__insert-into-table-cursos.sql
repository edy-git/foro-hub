DELETE FROM `forohub_api`.`cursos`;

INSERT INTO  `forohub_api`.`cursos` (nombre, categoria, activo)
VALUES
  ('Desarrollo Web con React', 'FRONT_END', 1),
  ('Introducción a Java', 'BACK_END', 1),
  ('Fundamentos de Spring Boot', 'BACK_END', 1),
  ('Análisis de Datos con Python', 'DATA_ANALYTICS', 1),
  ('Introducción a la Inteligencia Artificial', 'IA', 1),
  ('Desarrollo de Aplicaciones Full Stack', 'FULL_STACK', 1);
