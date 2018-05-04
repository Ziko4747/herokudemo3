package kz.kaznitu.herokudemo3.controllers;

import kz.kaznitu.herokudemo3.models.Server;
import kz.kaznitu.herokudemo3.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ServerController {

    @Autowired
    ServerRepository serverRepository;

    @RequestMapping(value = "/servers", method = RequestMethod.GET)
    public String serverList(Model model) {
        model.addAttribute("servers", serverRepository.findAll());
        model.addAttribute("server", new Server());
        return "servers";
    }

    @RequestMapping(value =" /saveserver", method = RequestMethod.POST)
    public String saveServer(@ModelAttribute Server server) {
        serverRepository.save(server);
        return "redirect:/servers";
    }
}
