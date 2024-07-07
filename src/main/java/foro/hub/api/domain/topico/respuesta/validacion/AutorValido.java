package foro.hub.api.domain.topico.respuesta.validacion;

import foro.hub.api.domain.topico.respuesta.DatosCrearRespuesta;
import foro.hub.api.domain.usuario.UsuarioRepository;
import foro.hub.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta
{
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}
