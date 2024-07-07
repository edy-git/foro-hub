package foro.hub.api.domain.topico.respuesta;

public record DatosCrearRespuesta(
        String mensaje,
        Long idTopico,
        Long idAutor
) {
}
