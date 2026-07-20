package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping        //esse @RequestBody serve para puxar o json do corpo da requisição
    public void cadastar(@RequestBody String json) {
        System.out.println(json);

    }
}
