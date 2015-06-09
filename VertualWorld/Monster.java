public abstract class Monster {
    int hp;
    int mp;

    public abstract void  attack();
    public void run() {
        System.out.println("モンスターは逃げ出した。");
    }
}
