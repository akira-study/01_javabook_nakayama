public class Wizard extends Character {
    private int mp;
    private Wand wand;

    // コンストラクタ
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public Wizard() {
        super();
        this.mp = 50;
    }
    // getterメソッド
    public int getMp() {
        return this.mp;
    }
    public Wand getWand() {
        return this.wand;
    }
    // setterメソッド
    public void setWand(Wand wand) {
        this.wand = wand;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    // Characterクラスからオーバーライド
    public void attack(Matango m) {
       System.out.println(this.name + "の攻撃！") ;
       System.out.println("敵に3ポイントのダメージ");
       m.hp -= 3;
    }

    // Wizard特有
    public void heal(Hero h) {
        int basePoint = 10; // 基本回復ポイント
        int recoverPoint = (int) (basePoint * this.getWand().getPower()); // 杖による増幅
        h.setHp(h.getHp() + recoverPoint); // 勇者のHPを回復
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
    }

    public void fireball(Matango m) {
        System.out.println(this.name + "は火の玉を放った!");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
    
}
