package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedicos;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    //Esse comando faz com oque o próprio Spring Boot estâncie o atributo
    @Autowired
    private MedicoRepository repository;

    @PostMapping        //esse @RequestBody serve para puxar o json do corpo da requisição
    @Transactional
    public void cadastar(@RequestBody @Valid DadosCadastroMedicos dados) {
        repository.save(new Medico(dados));

    }
}
