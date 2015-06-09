public class Main {
    public static void main(String[] args) {
        X obj = new A();
        obj.a();

        Y y1 = new A();
        Y y2 = new B();
        y1.a(); // Aa 
        y2.a(); // Ba

        Y[] y = new Y[2];
        y[0] = new A();
        y[1] = new B();

        for (Y ch : y) {
            ch.b();
        }
    }
}
