public abstract class Character {
    private String name;
    private int hp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    // 戦う
    public abstract void attack(Matango m); 
    
}
