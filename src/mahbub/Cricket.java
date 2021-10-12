package mahbub;

public class Cricket extends Sports{

    int over;
    String matchType;

    Player player;

        Cricket(String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;

    }

    void display(){
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);
        }

}

/**
 Name:  Md. Mahbub Alam
 Id No: 2012020127
 Section: C
 Email: cse_2012020127@lus.ac.bd
 Date: 11.09.2021
 */