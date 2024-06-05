package OOP.game;

import java.util.Scanner;

public class Character {
    public String name;
    public int strength;
    public int agility;
    public int vitality;
    public int currentVitality;
    boolean hasRightHandWeapon;
    boolean hasLeftHandWeapon;
    private Weapon weaponR;
    private Weapon weaponL;
    int x,y;



    public Character(String name, int strength, int agility, int vitality, int x, int y) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
        this.currentVitality = vitality;
        this.x = x;
        this.y = y;

    }
    String readMove(){
        System.out.println("Vyber si smer");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch (input){
            case "a": y--; break;
            case "w": x--; break;
            case "s": x++; break;
            case "d": y++; break;
            case "r": takeWeapon(Hand.RIGHT,null );  break;
            case "l": takeWeapon(Hand.LEFT,null ); break;
            default:
                System.out.println("Spatny input");
                return "X";
        }
        return input;
    }

    public boolean takeWeapon (Hand hand, Weapon weapon){
        switch (hand) {
            case LEFT -> {
                if (hasLeftHandWeapon){ // true
                    return false;
                } else { // false
                    hasLeftHandWeapon = true;
                    weaponL = weapon;
                    return true;
                }
            }

            case RIGHT -> {
                if (hasRightHandWeapon) { // true
                    return false;
                } else { // false
                    hasRightHandWeapon = true;
                    weaponR = weapon;
                    return true;
                }
            }
            default -> {
                return false;
            }
        }
    }

    public int getDefense(){
        int totalDefense = strength; // + weaponR.getDefense() + weaponL.getDefense();

        if (weaponR != null){
            totalDefense += weaponR.getDefense();
        }
        if (weaponL != null){
            totalDefense += weaponL.getDefense();
        }
        return totalDefense;
    }

    public int defend (int damage){


        int totalDefense = strength; // + weaponR.getDefense() + weaponL.getDefense();

        if (weaponR != null){
            totalDefense += weaponR.getDefense();
        }
        if (weaponL != null){
            totalDefense += weaponL.getDefense();
        }

        if (totalDefense >= damage){
            return 0;
        }
        else {
            // 100 = 100 - (20)
            currentVitality = currentVitality - (damage - totalDefense);
            return damage - totalDefense;
        }
    }
    public int getAttack(){
        int totalAttack = strength;

        if (weaponR != null){
            totalAttack += weaponR.getDamage();
        }
        if (weaponL != null){
            totalAttack += weaponL.getDamage();
        }

        return totalAttack;
    }
    public boolean isAlive(){
        return currentVitality > 0;
    }
    public String toString(){
        return name + " [" + currentVitality + "/" + vitality + "] " + "(" + getAttack() + "/" + getDefense() + ")";
    }




}

