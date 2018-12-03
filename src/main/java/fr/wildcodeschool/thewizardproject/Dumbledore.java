package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledore")
public class Dumbledore implements WizardInterface {

	
	
	private Outfit myDress;
	
	@Autowired
	public Dumbledore(Outfit theDress) {
		myDress = theDress;
	}
	
	@Override
	public String changeDress() {
		return this.myDress.dressColor();
	}
	
	@Override
	public String giveAdvice(){
	    return "Do not pity the dead, Harry. Pity the living, and, above all those who live without love.";
	}

}
