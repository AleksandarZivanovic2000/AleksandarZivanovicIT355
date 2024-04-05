package com.metropolitan.demo.controller;


import com.metropolitan.demo.entity.Restoran;
import com.metropolitan.demo.repository.RestoranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class RestoranController {

    @Autowired
    private  RestoranRepository restoranRepository;

    @GetMapping("/")
    public String getAll(Model model) {
        model.addAttribute("restorani", restoranRepository.findAll());
        return "index";
    }

    @GetMapping("/napraviRestoran")
    public String create(Model model) {
        model.addAttribute("restoran", new Restoran());
        return "napraviRestoran";
    }

    @PostMapping("/sacuvajRestoran")
    public String save(@Validated Restoran restoran) {
        restoranRepository.save(restoran);
        return "redirect:/";
    }

    @GetMapping("/azuriranjeRestorana")
    public String edit(@RequestParam Long id, Model model) {
        Optional<Restoran> restoran = restoranRepository.findById(id);

        if (restoran.isPresent()) {
            model.addAttribute("restoran", restoran.get());
            return "napraviRestoran";
        } else {
            return "redirect:/";
        }
    }

    @DeleteMapping("/brisanjeRestorana")
    public String delete(@RequestParam Long id) {
        restoranRepository.deleteById(id);
        return "redirect:/";
    }
}
