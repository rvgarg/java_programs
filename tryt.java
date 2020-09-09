import java.util.Scanner;

public class tryt {
    private static int RollNo;
    private static String CollegeName;

    public static void set_RollNo(int x) {
        RollNo = x;
    }

    private String Name;

    public static void set_College_Name(String clgn) {
        CollegeName = clgn;
    }

    public void set_Name(String nam) {
        Name = nam;
    }

    public String getName() {
        return Name;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public int getRollNo() {
        return RollNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tryt t = new tryt();
        System.out.print("Enter name : ");
        t.set_Name(sc.next());
        System.out.print("Enter roll no : ");
        tryt.set_RollNo(sc.nextInt());
        System.out.print("Enter college name : ");
        tryt.set_College_Name(sc.next());
        sc.close();
        System.out.print("Name : " + t.getName());
    }
}