public class Ellipsis {
    public static void main(String ...args) {
        show();
        show(4);
        show(4, 9);
        show(4, 9, 2);
        show(new int[]{4, 9, 2, 3, 5});
        display(4, 9, 2, 3, 5, 7);
        showName("Zahid", "Jewel","Robi", "Hasan", "Tonmoy");
        showName(new String[] {"Zahid", "Jewel","Robi", "Hasan", "Tonmoy", "Saif"});
    }

    public static void show(int ...A) {
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void display(int t, int ...A) {
        System.out.print(t+" ");
        for(int x: A)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void showName(String ...names) {
        for(String name: names) {
            System.out.print(name+" ");
        }
        System.out.println();
    }
}
