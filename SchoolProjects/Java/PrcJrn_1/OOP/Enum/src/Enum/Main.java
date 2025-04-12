package Enum;

public class Main {

    public static void main(String[] args) {
        hunterRank hRank = hunterRank.S_RANK; 
        
        if(hRank == hunterRank.B_RANK) {
            System.out.println("weak");
        } else if(hRank == hunterRank.A_RANK) {
            System.out.println("entry level");
        } else if(hRank == hunterRank.S_RANK) {
            System.out.println("High level");
        } else {
            System.out.println("Star level");
        }
        
        switch(hRank) {
            case B_RANK :
                System.out.println("weak");
            break;
            case A_RANK :
                System.out.println("entry level");
            break;
            case S_RANK :
                System.out.println("high level");
            break;
            case SSS_RANK :
                System.out.println("star level");
            break;
            default :
                System.out.println("no rank");
            break;
        }
        
        System.out.println("\nrank : " + hRank);
        System.out.println("hp : " + String.format("%, d", hRank.hp));
        
        int hp[] = {hunterRank.B_RANK.hp, hunterRank.A_RANK.hp};
        
        for(int h : hp) {
            System.out.println(h);
        }
        
        hunterRank ranks[] = new hunterRank[4];
        ranks[0] = hunterRank.B_RANK;
        ranks[1] = hunterRank.A_RANK;
        ranks[2] = hunterRank.S_RANK;
        ranks[3] = hunterRank.SSS_RANK;
        
        for(hunterRank r : ranks) {
            System.out.println(r);
        }
    }
}