public class TamagotchiStateHungry implements TamagotchiState {
    @Override
    public TamagotchiState play() {
        System.out.println("Tamagotchi está hambriento y no quiere jugar.");
        return this;
    }

    @Override
    public TamagotchiState getFood() {
        System.out.println("Tamagotchi comió y ahora está feliz.");
        return new TamagotchiStateHappy();
    }

    @Override
    public TamagotchiState goToSleep() {
        System.out.println("Tamagotchi está hambriento y no puede dormir bien.");
        return this;
    }
}