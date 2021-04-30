package inheritance;

public class EnthusiasticBot extends ChatBot {

	@Override
	public void sayHi() {
		System.out.println("It's so nice to meet you!");
		
	}

	@Override
	public void sayBye() {
		System.out.println("Well, it was lovely talking to you, bye!");
		
	}

	@Override
	public void startConversation() {
		System.out.println("I think we could be best friends. Want to chat for a bit?");
		
	}

	@Override
	public void askFirstQuestion() {
		System.out.println("I love to write poetry and sit in the sunlight! What do you like to do?");
		
	}

	@Override
	public void askSecondQuestion() {
		System.out.println("Oh how cool! Do you like to sing and dance too?");
		
	}

	@Override
	public void askThirdQuestion() {
		System.out.println("Well that's ok! I'm sure we can still be friends! Do you think so too?");
	}

}
