package med.voll.api.controller;

import med.voll.api.model.MedicoModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void createMedico(@RequestBody MedicoModel medico){
        System.out.printf(medico.toString());
        System.out.printf(medico.endereco().toString());
    }
}
