public class practice1 {
    public static void main(String[] args) {
        
    }
}

class Access {
    int x;

    void method1() {
        int y;
        x = 10;
        y = 1;
    }

    void method2() {
        int z;
        x = 5;
        z = 10;
        y = 1; //this is wrong
    }
}