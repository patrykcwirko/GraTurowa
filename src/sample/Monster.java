package sample;

public class Monster extends Istota {


    Monster(){
        player_name = "potwór";
        health = 8;
        attack_bonus = 50;
        player_heal = 16;
        player_attack = 10;
        armor = 10;
    }

    public Monster(String name, int Health ,int attackBonus, int playerHeal, int playerAttack, int Armor) {
        player_name = name;
        health = Health;
        attack_bonus = attackBonus;
        player_heal = playerHeal;
        player_attack = playerAttack;
        armor = Armor;
    }

}
