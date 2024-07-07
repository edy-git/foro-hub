package foro.hub.api.domain.topico;

import foro.hub.api.domain.topico.respuesta.DatosRespuesta;

public record EstadoTopicoRespuesta(
        DatosTopico topico,
        DatosRespuesta respuesta
) {
}
