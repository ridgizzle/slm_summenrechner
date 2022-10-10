package fhtw.bic.slm_summenrechner2;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummenrechnerController {

    private Summenrechner rechner = new Summenrechner();

    @GetMapping("/api/summenrechner") //so schickt das Programm weg
    public long addNumbers(@RequestParam(name="numberOne") int numberOne, @RequestParam(name="numberTwo") int numberTwo){
        return rechner.add(numberOne,numberTwo);
}

}
