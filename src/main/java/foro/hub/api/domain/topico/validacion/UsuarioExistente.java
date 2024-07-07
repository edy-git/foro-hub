package foro.hub.api.domain.topico.validacion;

import foro.hub.api.domain.topico.DatosCrearTopico;
import foro.hub.api.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioExistente implements ValidadorTopico
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearTopico datos) {
        var usuario = usuarioRepository.existsById(datos.idAutor());

        if (!usuario) {
            new ValidationException("Autor no registrado.");
        }

    }
}
