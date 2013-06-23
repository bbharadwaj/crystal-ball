package com.example.crystallball;

import java.util.Random;

public class CrystalBall {

	//Member variables
	
	public String[] mAnswers ={
			"Fuck yeah",
			"Balls only",
			"Your mom also can't",
			"It is sooo happening",
			"Hmmmmmmmmm",
			"Ummmm, how do I say this",
			"Fuck off, I am sleepy",
			"Ask Arpit",
			"Sone dena bhai",
			"Lets do it!"
			
	};
	
	
	//Methods
	
	public String getAnAnswer(){
		
		String answer;
		
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
			
		answer = mAnswers[randomNumber];
		return answer;
	}
}
