package microsoftapplication;

public class MicrosftApp {
public static void main(String[] args) {
	MicrosoftWord w1 = new MicrosoftWord();
	MicrosoftWord w2 = new MicrosoftWord();
	MicrosoftWord w3 = new MicrosoftWord();

	w1.setName("TYPE");
	w2.setName("SPELL");
	w3.setName("SAVE");
	
	w1.start();
	w2.start();
	w3.start();
}
}
