public class TamagotchiStateHappy implements TamagotchiState {
    @Override
    public TamagotchiState play() {
        System.out.println("Tamagotchi está feliz y juega contigo.");
        return this;
    }

    @Override
    public TamagotchiState getFood() {
        System.out.println("Tamagotchi comió, está feliz, pero esta cansado.");
        return new TamagotchiStateTired();
    }

    @Override
    public TamagotchiState goToSleep() {
        System.out.println("Tamagotchi durmió bien, está feliz, pero tiene hambre.");
        return new TamagotchiStateHungry();
    }
}