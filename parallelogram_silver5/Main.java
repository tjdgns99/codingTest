import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        class point{
            int x, y;
        }
        point a = new point();
        a.x = scan.nextInt();
        a.y = scan.nextInt();

        point b = new point();
        b.x = scan.nextInt();
        b.y = scan.nextInt();

        point c = new point();
        c.x = scan.nextInt();
        c.y = scan.nextInt();

        double big = 0;
        double small = 0;

        double one, two, three;
        one = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
        one = Math.sqrt(one);
        two = (a.x - c.x) * (a.x - c.x) + (a.y - c.y) * (a.y - c.y);
        two = Math.sqrt(two);
        three = (c.x - b.x) * (c.x - b.x) + (c.y - b.y) * (c.y - b.y);
        three = Math.sqrt(three);

        if(one > two && one > three){
            big = one;
            if(two > three)
                small = three;
            else
                small = two;
        }else if(two > one && two > three){
            big = two;
            if(one > three)
                small = three;
            else
                small = one;
        }else if(three > one && three > two){
            big = three;
            if(one > two)
                small = two;
            else
                small = one;
        }

        double num = big - small;
        num *= 2.0;


        if((double)(a.y-b.y)/(a.x-b.x) == (double) (a.y-c.y)/(a.x-c.x) || (double)(b.y-a.y)/(b.x-a.x) == (double) (b.y-c.y)/(b.x-c.x) || (double)(c.y-b.y)/(c.x-b.x) == (double) (c.y-a.y)/(c.x-a.x))
            System.out.println(-1);
        else
            System.out.println(num);


    }
}
