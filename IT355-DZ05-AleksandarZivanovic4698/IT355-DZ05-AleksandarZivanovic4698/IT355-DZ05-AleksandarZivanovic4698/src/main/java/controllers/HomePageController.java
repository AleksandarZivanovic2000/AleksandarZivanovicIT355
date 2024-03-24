package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.AutomobilServiceImpl;
import services.AutomobilServices;

@Controller
@RequestMapping
public class HomePageController {

    @Autowired
    private AutomobilServices automobilServices;

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("automobili", automobilServices.getAll());
        modelAndView.setViewName("homepage");
        return modelAndView;
    }

    public String filter (@RequestParam(defaultValue = "", name = "ime")String ime, Model model){
        model.addAttribute("automobili", automobilServices.filter(ime));
        model.addAttribute("ime", ime);
        return "homepage";
    }
}
