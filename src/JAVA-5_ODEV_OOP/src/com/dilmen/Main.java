package com.dilmen;

public class Main {

	public static void main(String[] args) {
		Kahraman lycan = new LifeStealer("Lycan", 100, 80);
		Kahraman void0 = new ManaStealer("Void", 80, 100);
		Kahraman rubick = new SpellStealer("Rubick", 90, 90);
		Arena arena = new Arena();

		System.err.println("------------------------------------");
		System.out.println("**********Savaş Başlıyor************");
		System.err.println("------------------------------------");
		System.out.println();
		Main.sleepWhile(1500);
		
		
		arena.savastır(lycan, void0);
		
		lycan = new LifeStealer("Lycan", 100, 80); // re initials
		
		arena.savastır(lycan, rubick);
		void0 = new ManaStealer("Void", 80, 100);
		rubick = new SpellStealer("Rubick", 90, 90);
		arena.savastır(void0, rubick);
		
		

		String winner = lycan.getCan()>void0.getCan()? lycan.getIsim(): void0.getIsim();
		System.out.println("Savaşın kazananı "+ winner);
	}
	
	public static void sleepWhile(int t) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
