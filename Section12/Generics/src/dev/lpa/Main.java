package dev.lpa;
interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1= new BaseballTeam("Houston astros");
        scoreResult(phillies1, 12, astros1, 12);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2= new SportsTeam("Houston astros");
        scoreResult(phillies2, 12, astros2, 12);

        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer, Affiliation> astros= new Team<>("Houston astros");
        scoreResult(phillies, 12, astros, 12);

        var harper= new BaseballPlayer("B Harper", "Right Fielder");
        var marsh= new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);

        phillies.listTeamMembers();

        SportsTeam afc1= new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, Affiliation> afc= new Team<>("Adelaide Crows");
        var tex=new FootballPlayer("Tex Walkser", "CF");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

        Team<Player, Affiliation> myTeam=new Team<>("Prosto");
        myTeam.addTeamMember(harper);
        myTeam.addTeamMember(tex);
        myTeam.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);

        System.out.printf("%s %s %s %n",team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);

        System.out.printf("%s %s %s %n",team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);

        System.out.printf("%s %s %s %n",team1, message, team2);
    }
}
