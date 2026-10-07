package latihanForQuiz;

public class latihanLirik {
    public static void ketik(String teks, int delay)throws
InterruptedException {
    for (int i=0; i<teks.length(); i++){
        System.out.print(teks.charAt(i));
        Thread.sleep(delay);
    }
System.out.println();
}
public static void main(String[] args)throws InterruptedException{
        System.out.print("[9/23, 12:00AM] w : ");

        ketik("ah, sorry", 50);
        Thread.sleep(1500);

        System.out.print("[9/23, 12:00AM] w : ");

        ketik("i was taking a sip of my root beer", 40);
        Thread.sleep(80);

        System.out.print("[9/21, 12:00AM] w : ");

        ketik("hihihihihi.", 100);
        Thread.sleep(50);

        ketik("cause love is pain but i need this shit", 50);
        Thread.sleep(100);

        ketik("we fuck too good when the bean kicks in", 50);
        Thread.sleep(100 );

        ketik("like fortnite, Ima need your skin", 45);
        Thread.sleep(100);

        ketik("dont give a fuck where the penis been", 50);
        Thread.sleep(100);

        ketik("boy, you're the one, you're the only man", 45);
        Thread.sleep(100);

        ketik("me and you on my ONLYFANS", 70);
        Thread.sleep(190);

        ketik("holy cow, you're the holy trin", 50);
        Thread.sleep(100);

        ketik("hold me down, when a hole need dick", 50);
        Thread.sleep(100);
}
}

