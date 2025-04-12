package Enum;

enum hunterRank {
    B_RANK(100),
    A_RANK(500),
    S_RANK(10000),
    SSS_RANK(999999);
    
    int hp;
    
    hunterRank(int hp) {
        this.hp = hp;
    }
}