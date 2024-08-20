//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Tamagotchi tamagotchi = new Tamagotchi("Tamagotchi");

        System.out.println(tamagotchi.getCurrentState());

        tamagotchi.eat();

        System.out.println(tamagotchi.getCurrentState());

    }
}