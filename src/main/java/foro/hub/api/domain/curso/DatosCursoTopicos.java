package foro.hub.api.domain.curso;

import foro.hub.api.domain.topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(
        DatosCurso curso,
        Page<DatosTopico> topicos
) {
}
