/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CheongSun;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        HotdogRobot hotdogRobot = new HotdogRobot(2, 3);
        HamburgerRobot hamburgerRobot = new HamburgerRobot(4, 5);
        FrenchFriesRobot frenchFriesRobot = new FrenchFriesRobot(6, 7);
        FriedChickenRobot friedChickenRobot = new FriedChickenRobot(8, 9);
        DrinkRobot drinkRobot = new DrinkRobot(10, 11);

        hotdogRobot.move(2, 3);
        hamburgerRobot.move(4, 5);
        frenchFriesRobot.move(6, 7);
        friedChickenRobot.move(8, 9);
        drinkRobot.move(10, 11);

        hotdogRobot.turn();
        hamburgerRobot.turn();
        frenchFriesRobot.turn();
        friedChickenRobot.turn();
        drinkRobot.turn();

        hotdogRobot.detectObstacle();
        hamburgerRobot.detectObstacle();
        frenchFriesRobot.detectObstacle();
        friedChickenRobot.detectObstacle();
        drinkRobot.detectObstacle();

        hotdogRobot.communicate();
        hamburgerRobot.communicate();
        frenchFriesRobot.communicate();
        friedChickenRobot.communicate();
        drinkRobot.communicate();

        // Multi-threading 
        Runnable hotdogTask = new Runnable(){
            public void run(){
                hotdogRobot.makeHotdog();
            }
        };
        Thread hotdogThread = new Thread(hotdogTask);

        Runnable hamburgerTask = new Runnable(){
            public void run(){
                hamburgerRobot.makeHamburger();
            }
        };
        Thread hamburgerThread = new Thread(hamburgerTask);

        Runnable frenchFriesTask = new Runnable(){
            public void run(){
                frenchFriesRobot.makeFrenchFries();
            }
        };
        Thread frenchFriesThread = new Thread(frenchFriesTask);

        Runnable friedChickenTask = new Runnable(){
            public void run(){
                friedChickenRobot.makeFriedChicken();
            }
        };
        Thread friedChickenThread = new Thread(friedChickenTask);

        Runnable drinkTask = new Runnable(){
            public void run(){
                drinkRobot.makeDrink();
            }
        };
        Thread drinkThread = new Thread(drinkTask);

        hotdogThread.start();
        hamburgerThread.start();
        frenchFriesThread.start();
        friedChickenThread.start();
        drinkThread.start();

        // Ordering the packages
        String packageName = "Package A";
        switch(packageName){
            case "Package A":
                hotdogRobot.makeHotdog();
                frenchFriesRobot.makeFrenchFries();
                drinkRobot.makeDrink();
                break;
            case "Package B":
                hamburgerRobot.makeHamburger();
                frenchFriesRobot.makeFrenchFries();
                drinkRobot.makeDrink();
                break;
            case "Package C":
                friedChickenRobot.makeFriedChicken();
                frenchFriesRobot.makeFrenchFries();
                drinkRobot.makeDrink();
                break;
        }
    }
}
