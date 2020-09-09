class fin {
    final void disp() {
        System.out.println("finl display");
    }
}

class fin1 extends fin {
    void disp1() {
        System.out.println("sub display");
    }
}

class test {
    public static void main(String[] args) {
        fin1 a = new fin1();
        a.disp();
    }
}