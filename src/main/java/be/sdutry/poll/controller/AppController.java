package be.sdutry.poll.controller;

import be.sdutry.poll.model.db.Person;
import be.sdutry.poll.model.db.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Spring MVC Java Configuration Example");

        return "index";
    }

    @RequestMapping(value="/test/", method = RequestMethod.GET)
    public String test(ModelMap model) {
        model.addAttribute("message", "testing DB");
        Person person = new Person();

        person.setFirstName("Stefaan");
        person.setLastName("Dutry");
        person.setEmail("stefaan.dutry@gmail.com");

        return "index";
    }

}

