class rom {
    int l, b;

    rom(int x, int y) {
        l = x;
        b = y;
    }

    public int area() {
        return l * b;

    }
}

class broom extends rom {
    int h;

    broom(int x, int y, int z) {
        super(x, y);
        h = z;
    }

    public int vol() {
        return l * b * h;
    }
}

class Room {
    public static void main(String[] args) {
        broom r = new broom(14, 12, 18);
        int area = r.area();
        int vol = r.vol();
        System.out.println("Area : " + area);
        System.out.println("Vol : " + vol);
    }
}