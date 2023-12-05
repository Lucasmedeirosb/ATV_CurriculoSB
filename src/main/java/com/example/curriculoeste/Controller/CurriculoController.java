package com.example.curriculoeste.Controller;

import com.example.curriculoeste.Repository.CurriculoRepository;
import com.example.curriculoeste.model.Curriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoRepository curriculoRepository;

    @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Curriculo getCurriculoById(@PathVariable Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Curriculo createCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    @PutMapping("/{id}")
    public Curriculo updateCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        curriculo.setId(id);
        return curriculoRepository.save(curriculo);
    }

    @DeleteMapping("/{id}")
    public void deleteCurriculo(@PathVariable Long id) {
        curriculoRepository.deleteById(id);
    }
}
