package homework2;

public class Cat {
    private String name;
    private int age;
    private boolean isHungry;
    private boolean isPetted;

    public Cat(String name, int age, boolean isHungry, boolean isPetted) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
        this.isPetted = isPetted;
    }

    public void feedCat() {
        if (isHungry) {
            System.out.println("Спасибо за еду! Кот доволен. Мяу");
            isHungry = false;
        } else {
            System.out.println("Я еще не голоден");
        }
    }

    public void petCat() {
        if (!isPetted) {
            System.out.println("Меня погладили! Кот доволен. Мур");
            isPetted = true;
        } else {
            System.out.println("Не трогай кота!");
        }
    }

    public void callCat() {
        System.out.println(name + ", кскс!");
    }

    public void playWithCat() {
        if (age <= 1) {
            System.out.println("Со мной играют! Ура!");
        } else if (age > 10) {
            System.out.println("Я уже слишком стар для игр");
        } else if (!isPetted && isHungry) {
            System.out.println("Сначала позаботься обо мне");
        } else {
            System.out.println("Ок, давай поиграем");
        }
    }
}
