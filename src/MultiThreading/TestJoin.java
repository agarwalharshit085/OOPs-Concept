package MultiThreading;

class TeamIndia extends Thread {
    public void run() {
        String[] nameIndia = {"Harshit", "Sparsh", "Sachine", "Dhoni", "Virat"};

        for(String i : nameIndia) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
class TeamPakistan extends Thread
{
    public void run() {
        String[] namePakistan = {"Babur", "Shohaib","Shaheen", "Safaraz","Mustakh"};
        for(String i : namePakistan) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
class TeamAustralia extends Thread
{
    public void run() {
        String[] nameAustralia = {"Alex", "William","Pollard", "Yasin","John"};
        for(String i : nameAustralia) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {

        TeamIndia teamIndia = new TeamIndia();
        TeamPakistan teamPakistan = new TeamPakistan();
        TeamAustralia teamAustralia = new TeamAustralia();

        teamIndia.start();
        teamIndia.join();
        teamPakistan.start();
        teamPakistan.join();
        teamAustralia.start();

    }
}
