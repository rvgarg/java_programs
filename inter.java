interface inter {
    int a = 0;

    void display();

}

class interimp implements inter {
    @Override
    public void display() {
        System.out.println(a);
    }
}

class inttest {
    public static void main(String[] args) {
        interimp i = new interimp();
        i.display();
    }
}