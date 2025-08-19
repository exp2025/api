package med.voll.api.controller;

import med.voll.api.dto.DatosAutenticacion;
import med.voll.api.model.Usuario;
import med.voll.api.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping
    public ResponseEntity<String> autenticar(@RequestBody DatosAutenticacion datos) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(datos.getUsername(), datos.getPassword());
        Authentication auth = authenticationManager.authenticate(authToken);

        String jwt = jwtService.generarToken((Usuario) auth.getPrincipal());

        return ResponseEntity.ok(jwt);
    }
}
