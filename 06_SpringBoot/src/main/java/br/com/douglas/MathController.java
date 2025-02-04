package br.com.douglas;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglas.NumberConverter.NumberConverter;
import br.com.douglas.exception.UnsupportedMathOperationException;

@RestController
public class MathController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
	@PathVariable(value = "numberTwo") String numberTwo)
	throws Exception {
		
		if (NumberConverter.isNumeric(numberOne) || NumberConverter.isNumeric(numberTwo)) {
				throw new UnsupportedMathOperationException("Please set a numeric value");
		}		
	
		return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);	
			
	}
	
	
	
}
