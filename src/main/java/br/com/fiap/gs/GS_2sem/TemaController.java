// Teste CD - Workflow

package br.com.fiap.gs.GS_2sem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
            "tema", "Soluções gamificadas para motivação em equipes híbridas",
            "membro1", "Enzo Campos - RM 552006",
            "descricao", "API criada para representar iniciativas de gamificação aplicadas ao ambiente corporativo híbrido, fomentando motivação, colaboração e desempenho das equipes."
        );
    }
}

