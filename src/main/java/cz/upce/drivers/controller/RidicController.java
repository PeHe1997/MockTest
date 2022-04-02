package cz.upce.drivers.controller;

import cz.upce.drivers.repository.dto.PridatUpravitRidiceDto;
import cz.upce.drivers.entity.Ridic;
import cz.upce.drivers.repository.RidicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class RidicController {

    @Autowired
    private RidicRepository ridicRepository;

    @GetMapping("/")
    public String ukazRidice(Model model) {
        model.addAttribute("ridicList", ridicRepository.findAll());
        return "ridic-list";
    }

    @GetMapping("/ridic-detaily/{id}")
    public String ukazDetailyRidice(@PathVariable(required = false) Long id, Model model) {
        model.addAttribute("ridic", ridicRepository.findById(id).get());
        return "ridic-detaily";
    }

    @GetMapping("/pridaniRidiceForm")
    public String showRidicForm(Ridic ridic) {
        return "pridat-ridice";
    }

    @PostMapping("/pridatRidice")
    public String pridatRidiceProces(Ridic ridic, BindingResult result) {
        if(result.hasErrors()) {
            return "pridat-ridice";
        }

        ridicRepository.save(ridic);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Ridic ridic = ridicRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id" + id));

        model.addAttribute("ridic", ridic);
        return "update-ridic";
    }

    @PostMapping("/update/{id}")
    public String updateRidic(@PathVariable("id") long id, Ridic ridic, BindingResult result, Model model) {
        if (result.hasErrors()) {
            ridic.setId(id);
            return "update-ridic";
        }
        ridicRepository.save(ridic);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String vymazatRidice(@PathVariable("id") long id, Model model) {
        Ridic ridic = ridicRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id" + id));
        ridicRepository.delete(ridic);
        return "redirect:/";
    }

}
