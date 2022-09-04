package com.example.hcihw5191532.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpFromProfessionalController {

    @GetMapping("/helpFromProfessional")
    public String showHelpPage(){
        return "helpfromprofessional";
    }

    @GetMapping("/johnjohnProfessional")
    public String showJohnContactPage() {
        return "johnjohncontact";
    }

    @GetMapping("/smithsmithProfessional")
    public String showSmithContactPage() {
        return "smithsmithcontact";
    }

    @GetMapping("/jesicajesicaProfessional")
    public String showJesicaContactPage() {
        return "jesicajesicacontact";
    }

    @GetMapping("/thankYou")
    public String showThankYouPage() {
        return "thankYouPage";
    }
}
