public class Hero {
    String name; // 名前の宣言
    int hp; // HPの宣言
    Sword sword;

    void attack() {

    }

    void run() {
        System.out.println(this.name + "は、逃げだした！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！" );
    }

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    Hero() {
        this.hp = 100;
        this.name = "ダミー";
    }

}
