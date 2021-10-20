package com.example.demo.controller;

import com.example.demo.domain.SectionToPerson;
import com.example.demo.service.PersonService;
import com.example.demo.service.SectionService;
import com.example.demo.service.SectionToPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/journal")
public class SectionJournalController {
    @Autowired
    SectionService sectionService;
    @Autowired
    PersonService personService;
    @Autowired
    SectionToPersonService sectionToPersonService;

    @GetMapping
    public String getJournal(Model model) {
        model.addAttribute("sections", sectionService.findAll());
        model.addAttribute("persons", personService.findAll());
        model.addAttribute("sectionToPersonList", sectionToPersonService.findAll());
        model.addAttribute("sectionToPerson", new SectionToPerson());
        return "journal";
    }

    @PostMapping
    public String addSectionToPerson(@ModelAttribute SectionToPerson sectionToPerson) {
        sectionToPersonService.addSectionToPerson(sectionToPerson);
        return "redirect:/journal";
    }
}
