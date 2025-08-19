package med.voll.api.service;

import med.voll.api.dto.DatosAutenticacion;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(DatosAutenticacion datos) {
        // Aquí validas usuario y contraseña
        // Por ejemplo, validación dummy:
        if ("usuario".equals(datos.getUsername()) && "pass".equals(datos.getPassword())) {
            // Generar token JWT o similar (aquí solo un string de ejemplo)
            return "token-falso-de-ejemplo";
        }
        return null; // login fallido
    }
}
