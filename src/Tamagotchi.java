public class Tamagotchi {


    private String name;
    private TamagotchiState currentState;

    public Tamagotchi(String name) {
        this.name = name;
        currentState = new TamagotchiStateHappy(); // Estado inicial
    }

    public void play() {
        this.currentState = currentState.play();
    }

    public void eat() {
        this.currentState = currentState.getFood();
    }

    public void sleep() {
        this.currentState = currentState.goToSleep();
    }

    public TamagotchiState getCurrentState() {
        return currentState;
    }
}