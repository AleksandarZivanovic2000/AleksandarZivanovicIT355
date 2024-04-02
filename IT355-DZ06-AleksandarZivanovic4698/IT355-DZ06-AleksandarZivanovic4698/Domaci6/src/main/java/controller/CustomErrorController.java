package controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        // Logika za prikazivanje prilagođene stranice za grešku
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }
}
