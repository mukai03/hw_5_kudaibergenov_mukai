package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefenceType("Protection");
        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefenceType());
    }

    public static void createHeroes(){
        Hero hero1 = new Hero(310,50);
        Hero hero2 = new Hero(280,30);
        Hero hero3 = new Hero(250,20);
        String[] heroes = {"Thor", "Warrior", "Kinetik"};
    }
}
