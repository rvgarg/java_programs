import java.util.Scanner;

class s1 {
    public String s1;

    s1(String s) {
        this.s1 = s;
    }
}

class s2 extends s1 {
    public String s;

    s2(String s1, String s2) {
        super(s1);
        this.s = s2;
    }
}

class cat extends s2 {
    cat(String s1, String s2) {
        super(s1, s2);
    }

    public String conc() {
        return this.s1 + this.s;
    }
}

public class jscat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1, s2;
        s1 = s.next();
        s2 = s.next();
        cat c = new cat(s1, s2);
        System.out.println(c.conc());
        s.close();
    }
}