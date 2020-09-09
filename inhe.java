class Box {
    double wd;
    double ht;
    double dt;

    Box(Box ob) {
        wd = ob.wd;
        ht = ob.ht;
        dt = ob.dt;
    }

    Box(double h, double w, double d) {
        wd = w;
        ht = h;
        dt = d;
    }

    public double vol() {
        return ht * wd * dt;
    }

}

class Boxwt extends Box {
    Boxwt(double h,double w,double d,double wt){
        super(h, w, d);
        this.wt = wt;
        wd  = w;
        ht = h;
        dt  = d;
    }

    double wt;
}

class inhe {
    public static void main(String[] args) {
        Boxwt b = new Boxwt(10,20,15,30.5);
        System.out.println(b.vol());
    }
}