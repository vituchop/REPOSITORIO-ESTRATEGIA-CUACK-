/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuduck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedHeadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        redhead.display();
        redhead.performFly();
        redhead.performQuack();
        System.out.println();

        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        System.out.println();

        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        System.out.println();

        // Changing behavior at runtime
        System.out.println("Mallard picks up a jetpack...");
        mallard.setFlyBehavior(new FlyWithJetpack());
        mallard.performFly();
    }
}


