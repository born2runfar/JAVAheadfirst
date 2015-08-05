package eflashcards;
import java.io.*;

public class QuizCard implements Serializable {
	//private String uniqueID;
	private String question;
	private String answer;
	
	/* 
	//test for QuizCard
	public static void main(String[] args) {
		QuizCard card1 = new QuizCard();
		card1.setQuestion("Is this my first question?");
		card1.setAnswer("Yes it is!");
		System.out.println(card1.getQuestion());
		System.out.println(card1.getAnswer());
	} 
	*/
	
	//constructor for QuizCard
	public QuizCard(String q, String a) {
		question = q;
		answer  = a;
	}
	//public QuizCard() {} //overloaded constructor
	
	//setter methods
	public void setQuestion(String q) {
		question = q;
	}
	public void setAnswer(String a) {
		answer = a;
	}
		
	//getter methods
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
}
