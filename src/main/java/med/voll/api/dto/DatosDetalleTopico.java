package med.voll.api.dto;

import med.voll.api.model.Topico;

public record DatosDetalleTopico(Long id, String titulo, String mensaje, String curso) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
