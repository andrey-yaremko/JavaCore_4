public class Aplication {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("Вік тварини =  "+a.getAge() + " років, "+" Назва тварини = "+a.getName()+"," + " Швидкість тварини = "+a.getSpeed() + "км/год");
        System.out.println("--------------------");
        a.setAge(10);
        a.setName("Бик");
        a.setSpeed(40);
        System.out.println("Вік тварини =  "+a.getAge() + " років, "+" Назва тварини = "+a.getName()+"," + " Швидкість тварини = "+a.getSpeed() + "км/год");
    }
}
