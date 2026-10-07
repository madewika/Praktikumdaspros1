package latihanForQuiz;
public class latihanLirikBackburner {

public static void ketik(String teks, int delay)throws
InterruptedException {
    for (int i=0; i<teks.length(); i++){
        System.out.print(teks.charAt(i));
        Thread.sleep(delay);
    }
System.out.println();
}
public static void main(String[] args)throws InterruptedException{
        System.out.print("[9/20, 07:00AM] wika : ");

        ketik("hey, r u still there?", 50);
        Thread.sleep(10);

        System.out.print("[9/21, 12:00AM] JY : ");

        ketik("...", 600);
        Thread.sleep(100);

        System.out.print("[9/21, 12:00AM] wika : ");

        ketik("good.", 100);
        Thread.sleep(1300);

        ketik("Maybe im just not better than this i haven't tried", 94);
        Thread.sleep(1000);

        ketik("cause maybe u'll finally choose me after you've had more time", 60);
        Thread.sleep(1750 );

        ketik("i thought i was a fast learner", 75);
        Thread.sleep(900);

        ketik("but guess i wont ever mind, guess i wont ever mind", 120);
        Thread.sleep(1000);





}
    
}