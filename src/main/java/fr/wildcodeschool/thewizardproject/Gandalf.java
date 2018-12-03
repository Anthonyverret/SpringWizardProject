package fr.wildcodeschool.thewizardproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface{

	
	private Outfit myDress;
	
	@Autowired
	public Gandalf(Outfit theDress) {
		myDress = theDress;
	}
	
	@Override
	public String changeDress() {
		return this.myDress.dressColor();
	}
	
	@Override
	public String giveAdvice(){
        return "I am looking for someone to share in an adventure";
    }

}
