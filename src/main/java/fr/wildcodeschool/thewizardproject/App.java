package fr.wildcodeschool.thewizardproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface myWizard = context.getBean("gandalf", WizardInterface.class);
        
        context.close();
        System.out.println("-------------------------");
		System.out.println(myWizard.changeDress());
        System.out.println(myWizard.giveAdvice());
        System.out.println("-------------------------");
    }

}
