package local.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/owners")
public class OwnerController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOfOwners(Model model) {

        return "owners/index";
    }

}