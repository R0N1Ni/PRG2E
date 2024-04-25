package OOP;

public class Match {
    String hostTeam, homeTeam;
    private int hostScore, homeScore;

    public String getHostTeam() {
        return hostTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    void getResult(){
        if (homeScore > hostScore){
            System.out.println("Vyhrali domaci");

        } else if (hostScore > homeScore) {
            System.out.println("Vyhrali hoste");
        }
        else {
            System.out.println("Remiza");
        }
    }
}
