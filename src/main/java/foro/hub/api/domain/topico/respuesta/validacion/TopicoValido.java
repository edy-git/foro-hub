package foro.hub.api.domain.topico.respuesta.validacion;

import foro.hub.api.domain.topico.TopicoRepository;
import foro.hub.api.domain.topico.respuesta.DatosCrearRespuesta;
import foro.hub.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoValido implements ValidadorRespuesta
{
    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idTopico() == null || !topicoRepository.existsById(datos.idTopico())) {
            throw new ValidacionDeIntegridad("Topico no encontrado");
        }
    }
}
