package com.example.demo.controller;

import com.example.demo.domain.Section;
import com.example.demo.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/section")
public class SectionController {

    @Autowired
    SectionService sectionService;

    @GetMapping
    public String sectionsPage(Model model) {
        model.addAttribute("section", new Section());
        model.addAttribute("sections", sectionService.findAll());
        return "section";
    }

    @PostMapping
    public String addSection(@ModelAttribute Section section) {
        sectionService.save(section);
        return "redirect:/section";
    }

    @GetMapping("del")
    public String delete(@RequestParam int id) {
        sectionService.delete(sectionService.findById(id));
        return "redirect:/section";
    }
}
