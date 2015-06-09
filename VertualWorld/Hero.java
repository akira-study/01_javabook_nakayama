public class Hero {
    private String name; 
    private int hp; 
    private static int money;
    private Sword sword;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullです。処理を中断します。");
        }

        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎます。処理を中断します。");
        }

        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎます。処理を中断します。");
        }
        
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Sword getSword() {
        return this.sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
    
    public void bye() {
        System.out.println("勇者は別れを告げた");
    }

    private void die() {
        System.out.println(this.getName() + "は死んでしまった！");
        System.out.println("GAMEOVER");
    }

    // 戦う
    public void attack(Matango m) {
        System.out.println(this.getName() + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }

    // 逃げる
    public void run() {
        System.out.println(this.getName() + "は、逃げだした！");
    }

    // 座る
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.getName() + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    // 転ぶ
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.getName() + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    // 眠る
    public void sleep() {
        this.hp = 100;
        System.out.println(this.getName() + "は、眠って回復した！" );
    }

    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }

    public static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }

}
