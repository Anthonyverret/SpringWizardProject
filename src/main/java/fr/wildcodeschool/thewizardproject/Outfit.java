package fr.wildcodeschool.thewizardproject;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements Dress {

	public Outfit() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String dressColor() {
		return "The wizard's dress is blue";
	}

}
