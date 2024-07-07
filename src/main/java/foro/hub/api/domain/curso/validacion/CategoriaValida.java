package foro.hub.api.domain.curso.validacion;

import foro.hub.api.domain.curso.DatosCrearCurso;
import foro.hub.api.infra.errores.ValidacionDeIntegridad;
import org.springframework.stereotype.Component;

@Component
public class CategoriaValida implements ValidadorCurso
{
    @Override
    public void validar(DatosCrearCurso datos)
    {
        if (datos.categoria() == null) {
            throw new ValidacionDeIntegridad("Debe asignarle una categoria al curso");
        }
        //Validar Enum
    }
}
