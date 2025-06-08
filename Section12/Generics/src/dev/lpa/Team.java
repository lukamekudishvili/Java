package dev.lpa;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name + " ("+type + " in " +countryCode + ")";
    }
}

public class Team<T extends Player, S> {
    private String teamName;
    private List<T> teamMembers= new ArrayList<>();
    private int totalWins=0;
    private int totalLosses=0;
    private int totalTies=0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T player){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void addTeamMember(T player, S city){
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
        this.affiliation=city;
    }

    public void listTeamMembers(){
        System.out.println("-".repeat(40));
        System.out.print(teamName + " Roster:");
        System.out.println((affiliation==null?"":"AFFILIATION: "+affiliation));
        for(T player : teamMembers){
            System.out.println(player.name());
        }
        System.out.println("-".repeat(40));
    }

    public int ranking(){
        return(totalLosses*2)+totalTies+1;
    }

    public String setScore(int ourScore, int theirScore){
        String message="lost to";
        if(ourScore>theirScore){
            totalWins++;
            message="defeated";
        }else if(ourScore==theirScore){
            totalTies++;
            message="tied";
        }else{
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked "+ ranking() + ")";
    }
}
