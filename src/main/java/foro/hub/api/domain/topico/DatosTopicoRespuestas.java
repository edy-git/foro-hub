package foro.hub.api.domain.topico;

import foro.hub.api.domain.topico.respuesta.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(
        DatosTopico topico,
        Page<DatosRespuesta> respuestas
) {
}
