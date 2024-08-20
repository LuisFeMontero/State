public class TamagotchiStateTired implements TamagotchiState {
    @Override
    public TamagotchiState play() {
        System.out.println("Tamagotchi está cansado y no quiere jugar.");
        return this;
    }

    @Override
    public TamagotchiState getFood() {
        System.out.println("Tamagotchi comió pero sigue cansado.");
        return this;
    }

    @Override
    public TamagotchiState goToSleep() {
        System.out.println("Tamagotchi durmió y ahora está feliz.");
        return new TamagotchiStateHappy();
    }
}