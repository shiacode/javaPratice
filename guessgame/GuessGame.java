public class GuessGame {
	Player p1,p2,p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1_is_right = false;
		boolean p2_is_right = false;
		boolean p3_is_right = false;

		int target_num = (int) (Math.random() * 10);
		System.out.println("I'm think of a number between 0 ~ 9...");

		while (true) {
			System.out.println("Number to guess is " + target_num);

			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Player One guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player Two guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player Three guessed " + guessp3);


			if (guessp1 == target_num) {
				p1_is_right = true;
			}
			if (guessp2 == target_num) {
				p2_is_right = true;
			}
			if (guessp3 == target_num) {
				p3_is_right = true;
			}

			if (p1_is_right || p2_is_right || p3_is_right) {
				System.out.println("We have a winner!");
				System.out.println("Player One got is right? " + p1_is_right);
				System.out.println("Player Two got is right? " + p2_is_right);
				System.out.println("Player Three got is right? " + p3_is_right);
				System.out.println("Game is Over!");
				break;

			} else {
				System.out.println("Players will have to try again.");
			}
		}

	}

}


