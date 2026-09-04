package local.petclinic.controllers;

import local.petclinic.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/owners")
@AllArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;


    @GetMapping({"", "/", "/index", "/index.html"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}