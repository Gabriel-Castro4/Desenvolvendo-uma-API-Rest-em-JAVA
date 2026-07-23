package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedicos;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 18, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
