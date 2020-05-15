package sample;

import java.util.Random;

public class Istota {

    //******Creature stats****************
    String player_name = "Patryk";
    int health = 100;
    int attack_bonus = 5;
    int player_heal = 16;
    int player_attack = 6;
    int hitChance = 12;
    int armor = 10;
    //************************************

    //******Additionals values************
    int armorReduction = 10;

    Istota(){
        player_name = "Patryk";
        health = 100;
        attack_bonus = 5;
        player_heal = 16;
        player_attack = 10;
        hitChance = 12;
    }

    Istota(String name, int Health, int bonus,  int healing,  int attack, int Armor ){
        player_name = name;
        health = Health;
        attack_bonus = bonus;
        player_heal = healing;
        player_attack = attack;
        armor = Armor;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    String getPlayer_name(){
        return player_name;
    }

    // ****************Funkcje dostępowe********************
    void setPlayer_name( String name){
        player_name = name;
    }

    int getHealth(){
        return health;
    }

    void setHealth( int Health ){
        health = Health;
    }

    void setAttack_bonus(int bonus){
        attack_bonus = bonus;
    }

    int getAttack_bonus(){
        return attack_bonus;
    }

    void setPlayer_heal(int healing){
        player_heal = healing;
    }

    int getPlayer_heal(){
        return player_heal;
    }

    void setPlayer_attack(int attack){
        player_attack = attack;
    }

    int getPlayer_attack(){
        return player_attack;
    }

    void setHitChance(int ac){
        hitChance = ac;
    }

    int getHitChance(){
        return hitChance;
    }

    void setArmor( int Armor){
        armor = Armor;
    }

    int getArmor(){
        return armor;
    }

    int getArmorReduction(){
        return armorReduction;
    }
     //******************************************************

    void attack(Istota monster) {
        int hitt = getRandomNumberInRange(0,100);
        int rana;
        System.out.println(hitt);
        if (hitt == 0){
            rana = 2 * getRandomNumberInRange(1,player_attack)- ( monster.getArmor() / monster.getArmorReduction() );
            System.out.println("Krytyk!!! " + rana + " obrażeń");
            monster.setHealth( monster.getHealth() - rana );

        }else if( hitt <= monster.getHitChance() ){
            rana = getRandomNumberInRange(1,player_attack)- ( monster.getArmor() / monster.getArmorReduction() );
            System.out.println("Trafiony!!! " + rana + " obrażeń");
            monster.setHealth( monster.getHealth() - rana );
        }
    }
}
