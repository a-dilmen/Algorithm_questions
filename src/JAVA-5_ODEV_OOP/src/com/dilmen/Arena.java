package com.dilmen;

public class Arena implements ISavas {
	private int zar;

	public int getZar() {
		return zar;
	}

	public void setZar() {
		this.zar = zarAt();
	}

	@Override
	public int zarAt() {
		int zar = (int) (Math.random() * 3) + 1;
		return zar;
	}

	@Override
	public void savasBilgileriniYazdır(Kahraman kahraman1, Kahraman kahraman2) {
		String mesaj1 = kahraman1.getIsim() + " " + getZar() + " yeteneği ile " + kahraman2.getIsim() + " i üzdü ";
		String mesaj11 = kahraman1.getIsim() + " --> kalan can " + kahraman1.getCan() + " kalan mana " + kahraman1.getMana() ;
		String mesaj12 = kahraman2.getIsim() + " --> kalan can " + kahraman2.getCan() + " kalan mana " + kahraman2.getMana() ;
		String mesaj2 = kahraman1.getIsim() + " " + getZar() + " yeteneği ile " + kahraman2.getIsim() + " i hırpaladı ";
		String mesaj21 = kahraman1.getIsim() + " --> kalan can " + kahraman1.getCan() + " kalan mana " + kahraman1.getMana() ;
		String mesaj22 = kahraman2.getIsim() + " --> kalan can " + kahraman2.getCan() + " kalan mana " + kahraman2.getMana() ;
		String mesaj3 = kahraman1.getIsim() + " " + getZar() + " yeteneği ile " + kahraman2.getIsim()+ " i canını yaktı ";
		String mesaj31 = kahraman1.getIsim() + " --> kalan can " + kahraman1.getCan() + " kalan mana " + kahraman1.getMana() ;
		String mesaj32 = kahraman2.getIsim() + " --> kalan can " + kahraman2.getCan() + " kalan mana " + kahraman2.getMana() ;
				
		Arena.sleepWhile(400);
		switch (getZar()) {
		case 1:
			System.out.println(mesaj1);
			Arena.sleepWhile(400);
			kahraman1.canGüncelle();
			kahraman1.manaGüncelle();
			kahraman2.canGüncelle();
			kahraman2.manaGüncelle();
//			System.out.println(mesaj11);
			System.out.println(mesaj12);
			break;
		case 2:
			System.out.println(mesaj2);
			Arena.sleepWhile(400);
			kahraman1.canGüncelle();
			kahraman1.manaGüncelle();
			kahraman2.canGüncelle();
			kahraman2.manaGüncelle();
//			System.out.println(mesaj21);
			System.out.println(mesaj22);
			break;
		case 3:
			System.out.println(mesaj3);
			Arena.sleepWhile(400);
			kahraman1.canGüncelle();
			kahraman1.manaGüncelle();
			kahraman2.canGüncelle();
			kahraman2.manaGüncelle();
//			System.out.println(mesaj31);
			System.out.println(mesaj32);
			break;

		default:
			break;
		}
		
	}
	
	public void savastır(Kahraman kahraman1, Kahraman kahraman2) {
		
		while (kahraman1.getCan() > -1 && kahraman2.getCan() > -1) {
			System.out.println("**************Attack************");
			Main.sleepWhile(400);
			setZar();
			switch (getZar()) {
			case 1:
				kahraman1.birinciYeteneğiKullan(kahraman2);
				savasBilgileriniYazdır(kahraman1, kahraman2);
				break;
			case 2:
				kahraman1.ikinciYeteneğiKullan(kahraman2);
				savasBilgileriniYazdır(kahraman1, kahraman2);
				break;
			case 3:
				kahraman1.finalYeteneğiKullan(kahraman2);
				savasBilgileriniYazdır(kahraman1, kahraman2);
				break;
			default:
				System.out.println("bir hata oluştu");
				break;
			}
			Main.sleepWhile(400);
			System.out.println("**********Counter Attack*********");
			setZar();
			switch (getZar()) {
			case 1:
				kahraman2.birinciYeteneğiKullan(kahraman1);
				savasBilgileriniYazdır(kahraman2, kahraman1);
				break;
			case 2:
				kahraman2.ikinciYeteneğiKullan(kahraman1);
				savasBilgileriniYazdır(kahraman2, kahraman1);
				break;
			case 3:
				kahraman2.finalYeteneğiKullan(kahraman1);
				savasBilgileriniYazdır(kahraman2, kahraman1);
				break;
			default:
				System.out.println("bir hata oluştu");
				break;
			}
			Main.sleepWhile(1000);
			System.out.println("******* Next Round *********");

			System.out.println();
		}
		
		
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
