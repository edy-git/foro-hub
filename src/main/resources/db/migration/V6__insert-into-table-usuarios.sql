DELETE FROM `forohub_api`.`usuarios`;

INSERT INTO  `forohub_api`.`usuarios` (nombre, email, contrasenia)
VALUES
  ('Eddy Rodriguez', 'eddy.rodriguez@example.com', '$2a$10$SaZIcrYhAtn5q12hSZPNy.pf0GfnlA1UrbUIqgirRND/DEQfNKkMq'),
  ('María Gómez', 'maria.gomez@example.com', 'password456'),
  ('Carlos Rodríguez', 'carlos.rodriguez@example.com', 'password789'),
  ('Ana Sánchez', 'ana.sanchez@example.com', 'passwordabc'),
  ('Luis Fernández', 'luis.fernandez@example.com', 'passworddef');
