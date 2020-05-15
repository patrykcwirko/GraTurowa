package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

import Classes.*;
import Monster.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        //launch(args);

        ArrayList<Monster> monsters = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Dice dice = new Dice();
        int winer = 0;

        System.out.println("Enter the name: ");
        String name = scan.nextLine();
        System.out.println();
        showClass();
        System.out.println("Choose your class: ");
        int clas = scan.nextInt();
        Player player = new Player(name,chooseClass(clas));
        player.configure();
        System.out.println();

        monsters.add(new Goblin());
        monsters.add(new Goblin());
        monsters.add(new Goblin());
        printStat(player);

        for ( Monster mon : monsters ) {
            while (winer == 0) {
                int monsterDamage = mon.attack(mon.getDiceCount(), mon.getDamage()) - player.getDefense();
                int playerDamage = player.attack();
                if (monsterDamage < 0) {
                    monsterDamage = 0;
                }
                if (mon.getSpeed() > player.getClas().getSpeed()) {
                    player.setHealth( player.getHealth() - monsterDamage);
                    if (player.getHealth() <= 0) {
                        winer = 1;
                        break;
                    }
                    mon.setHealth( mon.getHealth() - playerDamage);
                    if (mon.getHealth() <= 0) {
                        winer = 2;
                        break;
                    }
                } else {
                    mon.setHealth(mon.getHealth() - playerDamage);
                    if (mon.getHealth() <= 0) {
                        winer = 2;
                        break;
                    }
                    player.setHealth(player.getHealth() - monsterDamage );
                    if (player.getHealth() <= 0) {
                        winer = 1;
                        break;
                    }
                }

                System.out.println("Player damage:" + playerDamage + " current "+ mon.getName() +" health: "+ mon.getHealth());
                System.out.println( mon.getName() +" damage:" + monsterDamage + " current player health: "+ player.getHealth());
            }
            if (winer == 1){
                System.out.println();
                System.out.println("YOU DIED");
                winer = 0;
            } else {
                System.out.println();
                System.out.println( mon.getName() + " pokonany");
                player.setExp( player.getExp() + mon.getExp() );
                if(player.getExp() >= player.nextLevel( player.getLevel() )){
                    player.levelUp();
                    printStat(player);
                } else {
                    printShortStat(player);
                }
                winer = 0;
            }
        }
    }

    public static void showClass() {

        System.out.println("1.Warrior");
        System.out.println("2.Mage");
        System.out.println("3.Archer");
        System.out.println("4.Assasin");
    }

    public static Classes chooseClass(int chose) {

        switch (chose)
        {
            case 1: {
                return new Warrior();
            }
            case 2: {
                return new Mage();
            }
            case 3: {
                return new Archer();
            }
            case 4: {
                return new Assassin();
            }
        }
        return null;
    }

    public static void printStat(Player player){
        System.out.println();
        System.out.println("Name: " + player.getName());
        System.out.println("Class: "+ player.getClas().getClassName());
        System.out.println("Level: "+ player.getLevel());
        System.out.println("EXP: "+ player.getExp());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Defense: " + player.getDefense());
        System.out.println("Strenth: "+ player.getClas().getStrenth());
        System.out.println("Dexterity: " + player.getClas().getDexterity());
        System.out.println("Inteligent: " + player.getClas().getInteligent());
        System.out.println("Vitality: " + player.getClas().getVitallyty());
        System.out.println("Speed: " + player.getClas().getSpeed());
        System.out.println("Damage: " + player.getDiceCount()+"d"+player.getDice()+" + " + (player.getClas().getPrimalStat())/2);
        System.out.println();
    }

    public static void printShortStat(Player player){
        System.out.println();
        System.out.println("Name: " + player.getName());
        System.out.println("Class: "+ player.getClas().getClassName());
        System.out.println("Level: "+ player.getLevel());
        System.out.println("EXP: "+ player.getExp());
        System.out.println("To next level: " +player.nextLevel( player.getLevel() ));
        System.out.println("Health: " + player.getHealth());
        System.out.println();
    }
}
