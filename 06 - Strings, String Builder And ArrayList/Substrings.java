public class Substrings {
    public static void main(String[] args) {

    }

}

class Empty {

}

class rectangel {
    int length, width;

    void getDAta(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {
        int area = length * width;
        return (area);
    }
}

// a class with only data fields has no life. The objects created by such a
// class cannot respond to any messages.