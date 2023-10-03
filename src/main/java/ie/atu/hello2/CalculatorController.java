package ie.atu.hello2;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public calculatorResult calculate(
            @RequestParam("num1") double num1,
            @RequestParam("num2") double num2,
            @RequestParam("operation") String operation
    )
    {
        double Result = 0;

        switch (operation) {
            case "Add":   //Adds received numbers

                Result = num1 + num2;
                break;

            case "Subtract": //Subtracts received Number
                Result = num1 - num2;
                break;

            case "Multiply":
                Result = num1 * num2; //Multiplies received Number
                break;

            case "Divide":   //Divides received Number
                if (num2 != 0) {
                    Result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Cannot Divide By Zero.");  //Prevents user from dividing by 0
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid Action: " + operation); //default error
        }

        return new calculatorResult(operation, Result); //returns JSON
    }
}
