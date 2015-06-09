public abstract class Character implements Life {
    String name;
    int hp;

    // コンストラクタ
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }    

    public Character() {
        this.name = "ダミー";
        this.hp = 100;
    }

    // getterメソッド
    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }

    // setterメソッド
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }

    // 戦う
    public void attack(Monster m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("敵に10ポイントのダメージを与えた！");
        m.hp -= 10;
    } 
    
}
