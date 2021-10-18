package com.example.demo.controller;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;

//    Получение списка
    @GetMapping
    public String getPersonPage(Model model) {
        model.addAttribute("persons", personService.findAll());
        model.addAttribute("person", new Person());
        return "person";
    }

//    Отправка запроса
    @PostMapping
    public String addPerson(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/person";
    }

//    Запрос на удаление по id
    @GetMapping("del")
    public String delPerson(@RequestParam int id) {
        personService.delete(personService.findById(id));
        return "redirect:/person";
    }


}
