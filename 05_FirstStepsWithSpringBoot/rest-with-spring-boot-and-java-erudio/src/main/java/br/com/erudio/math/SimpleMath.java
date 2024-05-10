package br.com.erudio.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {
		return (numberOne) + (numberTwo);
	}
	
	
	public Double sub(Double numberOne, Double numberTwo) {
		
		return (numberOne) - (numberTwo);
		
	}
	
	public Double mult(Double numberOne, Double numberTwo){
		
		return (numberOne) * (numberTwo);
		
	}
	
	public Double div(Double numberOne, Double numberTwo) {
		
		if ((numberTwo) == 0) {
			throw new ArithmeticException("Divisão por zero!");
		}
		return (numberOne) / (numberTwo);
		
	}
	
	
	public Double mean(Double numberOne, Double numberTwo) {
		
		return (numberOne + numberTwo)/2;
		
	}
	
	public Double sqrt(Double number) {
		
		Double number_dbl = number;
		return Math.sqrt(number_dbl);
		
	}

}
