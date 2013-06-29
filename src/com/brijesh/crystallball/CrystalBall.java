package com.brijesh.crystallball;

import java.util.Random;

public class CrystalBall {

	//Member variables
	
	public String[] mAnswers ={
			"Fuck yeah",
			"Balls only",
			"Your mom also can't",
			"It is sooo happening",
			"Hmmmmmmmmm",
			"Umm, how do I say this",
			"Get a life",
			"Ask that guy over there",
			"Too hungover",
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
