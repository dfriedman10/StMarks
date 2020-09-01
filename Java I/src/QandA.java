// Question and Answers mini-project by Mr. David
// didn't need any help on this one

public class QandA {

	public static void main(String[] args) {
		
		// didn't comment my code bc it's very self-explanatory
		// don't do this in the future once we move on from print statements!
		
		System.out.println("Where are you from?");
		sleep(500);
		System.out.println("Marion, MA (I didn't go to Tabor, but this is the town Tabor is in)");
		sleep(1000);
		
		System.out.println("What's a hobby of yours?");
		sleep(500);
		System.out.println("I love sports. I'm a competetive runner and also play for a Boston frisbee team."
				+ " But I'll play just about any sport as long as it's not baseball. I watch a lot of football, "
				+ "especially if the Eagles are playing.");
		sleep(1000);
		
		System.out.println("What did you like about teaching in Jordan?");
		sleep(500);
		System.out.println("The wide variety of backgrounds of the students at the school was amazing. "
				+ "I taught a couple of princes and princesses, but also some Palestinian refugees who"
				+ " didn't have a home. My classes had people from everywhere from Jordan to Brazil to Korea, "
				+ "it was really cool to get to know so many cultures.");
		sleep(1000);
		
		System.out.println("Have any siblings?");
		sleep(500);
		System.out.println("I've got 3 - a brother who is just left college, a brother who's a senior in "
				+ "high school, and a sister who is a freshman in high school.");
		sleep(1000);
		
		System.out.println("Favorite musicians? Shows/Movies? Video Games?");
		sleep(500);
		System.out.println("I listen to a rather eclectic mix of music. I listen to a lot of country (Eric Church),"
				+ " alt (The Killers), and classics (The Beatles & Police), but my favorite artist is probably Kid Cudi.");
		System.out.println("I don't watch a lot of tv, but I recently watched Stranger Things and it was awesome."
				+ "Also a big Avengers/Lord of the Rings fan. I also don't play a ton of video games, but my go-tos are usually"
				+ "Borderlands, Fallout, and Age of Empires if I want a throwback.");
		sleep(1000);
		
		System.out.println("Favorite food from your time in Jordan?");
		sleep(500);
		System.out.println("There was always a lot of fresh baked pita, and a lot of different dips"
				+ " to go with it. Probably my favorite was 'muhummara', which is a sweet/spicy crushed red "
				+ "pepper dip.");
		sleep(1000);
		
		System.out.println("Coolest project you've done lately?");
		sleep(500);
		System.out.println("Last year we got a new headmaster at King's Academy, so to get him familiarized with"
				+ " all the students I created an app that quizzed him. It would fetch a random student's face from "
				+ "the school's database, ask him for the name, and mark his guess as correct/incorrect. By the time "
				+ "school started he knew all 600 students by name!");
	}
	
	// makes the program pause for half a second.
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
