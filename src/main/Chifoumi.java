package main;

import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String[] chifoumi = {"Pierre", "Feuille", "Ciseaux"};
		
		//System.out.print(random);
		//System.out.print(chifoumi[random]);
		int scoreP1 = 0;
		int scoreP2 = 0;
		
		
	
		//System.out.println("Choix : " + choix + " versus random : " + chifoumi[random]);
		
		do {
			
			int random = (int)(Math.random() * 3) + 0;
			String randomChoix = chifoumi[random];
			System.out.println("Veuillez choisir entre Pierre, Feuille Ciseaux : ");
			String choix = scan.nextLine();
			String upperCase = choix.toUpperCase();
			
			// CHOIX POUR PIERRE
			if(upperCase.equals("PIERRE") && randomChoix.equals("Ciseaux")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				scoreP1++;
				System.out.println("Vous remportez la manche.");
			} else if(upperCase.equals("PIERRE") && randomChoix.equals("Pierre")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Egalité.");
			}else if(upperCase.equals("PIERRE") && randomChoix.equals("Feuille")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Le bot remporte la manche.");
				scoreP2++;
			}
			// CHOIX POUR FEUILLE
			else if(upperCase.equals("FEUILLE") && randomChoix.equals("Pierre")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Vous remportez la manche.");
				scoreP1++;
			} else if(upperCase.equals("FEUILLE") && randomChoix.equals("Feuille")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Egalité.");
			} else if(upperCase.equals("FEUILLE") && randomChoix.equals("Ciseaux")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Le bot remporte la manche.");
				scoreP2++;
			}
			// CHOIX POUR CISEAUX
			else if(upperCase.equals("CISEAUX") && randomChoix.equals("Feuille")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Vous remportez la manche.");
				scoreP1++;
			} else if(upperCase.equals("CISEAUX") && randomChoix.equals("Ciseaux")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Egalité.");
			}else if(upperCase.equals("CISEAUX") && randomChoix.equals("Pierre")) {
				System.out.println("Vous : " + choix);
				System.out.println("Bot : " + randomChoix);
				System.out.println("Le bot remporte la manche.");
				scoreP2++;
			}
			
			System.out.println("Score 1 : " + scoreP1);
			System.out.println("Score 2 : " + scoreP2 + "\n");
			//System.out.println(chifoumi[random]);
		
			
		} while(scoreP2 < 3 && scoreP1 < 3);
		if(scoreP1 == 3) {
			System.out.println("Vous avez Gagné !");
		} else {
			System.out.println("Vous avez Perdu !");
		}
	}

}
