package com.receitas;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.receitas.Model.*;
import com.receitas.Repositories.ReceitaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/api/receita")
@CrossOrigin("*")
public class ReceitaController {
    private final ReceitaRepository rp;

    public ReceitaController(ReceitaRepository rp){
        this.rp = rp;
    }

    @GetMapping
    public List<Receita> buscarReceitas(){
        return this.rp.findAll();
    }

    




}
