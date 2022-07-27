package homework2;

public class Main {
    public static void main(String[] args) {
        Cat brownCat = new Cat("Пушок", 1, false, false);
        Cat blackCat = new Cat("Мурзилка", 11, true, true);

        brownCat.callCat();
        brownCat.playWithCat();
        brownCat.feedCat();
        brownCat.petCat();

        blackCat.callCat();
        blackCat.feedCat();
        brownCat.petCat();
        blackCat.playWithCat();
    }
}
