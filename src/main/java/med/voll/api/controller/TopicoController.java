package med.voll.api.controller;

import med.voll.api.dto.DatosDetalleTopico;
import med.voll.api.dto.DatosRegistroTopico;
import med.voll.api.model.Topico;
import med.voll.api.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosDetalleTopico> crearTopico(@RequestBody DatosRegistroTopico datos) {
        Topico topico = new Topico(datos.titulo(), datos.mensaje(), datos.curso());
        topicoRepository.save(topico);
        return ResponseEntity.status(201).body(new DatosDetalleTopico(topico));
    }

    @GetMapping
    public ResponseEntity<List<DatosDetalleTopico>> listarTopicos() {
        var topicos = topicoRepository.findAll().stream().map(DatosDetalleTopico::new).toList();
        return ResponseEntity.ok(topicos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        topicoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
