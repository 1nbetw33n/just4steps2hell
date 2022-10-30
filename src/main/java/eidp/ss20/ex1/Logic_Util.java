/*
 *
 * 2022 1nbetw33n Labs
 * Virgo Supercluster, Milky Way - Earth A-6847
 *
 * I dont give a fuck about copyright - this code is free to use for everybody - EXCEPTION:
 *     - entities that support:
 *         > queer hostility
 *         > any kind of religion
 *         > authoritarianism
 *         > sexism
 *         > racism
 *         > ableism
 *     - (most) boomer
 *     - conservatives
 *     - nazis
 *     - TERFs
 *     - TWERFs
 *     - SWERFs
 *
 * -will be extended if necessary-
 */

package eidp.ss20.ex1;

/*
 * Created by 0x1nbetw33n on 07/08/2022
 * Virgo Supercluster, Milky Way - Earth A-6847
 */

@SuppressWarnings({"unused", "CommentedOutCode"})
public class Logic_Util {

    boolean log_implies(boolean a, boolean b){
        return !a || b;
    }

    void print_table(){
        System.out.println("\n");
        System.out.println("a\t\tb\t\ta -> b");
        System.out.println("----------------------");
        System.out.println(false + "\t" + false + "\t" + log_implies(false, false));
        System.out.println(false + "\t" + true + "\t" + log_implies(false, true));
        System.out.println(true + "\t" + false + "\t" + log_implies(true, false));
        System.out.println(true + "\t" + true + "\t" + log_implies(true, true));
        System.out.println("\n");
    }

        static Player get_instance_of_player(){
            return new Player();
        }
        static Point_2D get_instance_of_point_2D(){
            return new Point_2D();
        }

        static Rectangle get_instance_of_rectangle(){
        return new Rectangle();
        }

    public static void main(String[] args){
        /*
        Logic_Util logic_util = new Logic_Util();
        logic_util.print_table();
        Player player = get_instance_of_player();
        player.player_main();
        Point_2D point = get_instance_of_point_2D();
        point.point_2D_main();
         */
        Rectangle rectangle = get_instance_of_rectangle();
        rectangle.rectangle_main();
    }

    public static class Player{

        String name;
        Integer[] statistic;

        public Player(){}

        Player(String name){
            this.name = name;
            statistic = new Integer[]{0, 0};
        }

        void game(boolean won){
            if(won){
                statistic[0]++;
            } else{
                statistic[1]++;
            }
        }

        void show_statistic(){
            System.out.println("\n");
            System.out.println("Game Stats for " + name + ":");
            System.out.println("won:\t\t" + statistic[0]);
            System.out.println("lost:\t\t" + statistic[1]);
            System.out.println("Average:\t" + (double) statistic[0] / (statistic[0] + statistic[1]) * 100 + "%");
        }

        public void player_main(){
            Player a = new Player("Anna");
            Player b = new Player("Otto");
            b.game(true);
            a.game(true);
            b.game(false);
            a.game(true);
            a.game(true);
            b.game(true);
            b.game(false);
            a.game(false);
            a.game(false);
            a.game(true);
            a.show_statistic();
            System.out.println();
            b.show_statistic();
        }
    }

    static class Point_2D{

        double x, y;

        Point_2D(){
            x = y = 0;
        }

        Point_2D(double x, double y){
            this.x = x;
            this.y = y;
        }

        Point_2D(Point_2D point_2d){
            x = point_2d.x;
            y = point_2d.y;
        }

        void move(double x, double y){
            this.x += x;
            this.y += y;
        }

        @SuppressWarnings("SameParameterValue")
        void move_to(double x, double y){
            this.x = x;
            this.y = y;
        }

        double getX(){
            return x;
        }

        double getY() {
            return y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public void point_2D_main(){
            Point_2D point1 = new Point_2D();
            Point_2D point2 = new Point_2D(3., 5.);
            Point_2D point3 = new Point_2D(point2);
            System.out.println(point1 + "\n" + point2 + "\n" + point3 + "\n");
            point1.move(-2., 5.3);
            point2.move_to(3.8, -12.4);
            point3.move(-1., 1.);
            System.out.println(point1 + "\n" + point2 + "\n" + point3 + "\n");
        }
    }

    static class Rectangle{

        final Point_2D ref;
        final double l;
        final double h;

        Rectangle(){
            ref = new Point_2D();
            l = h = 0.;
        }

        Rectangle(Point_2D p, double l, double h){
            ref = new Point_2D(p);
            this.l = l;
            this.h = h;
        }

        Rectangle(Point_2D bottom_left, Point_2D top_right){
            ref = new Point_2D(bottom_left);
            l = top_right.x - bottom_left.x;
            h = top_right.y - bottom_left.y;
        }

        double calc_surface(){
            return l * h;
        }

        double calc_circumference(){
            return (l + h)* 2.;
        }

        @SuppressWarnings("SameReturnValue")
        double calc_center(){
            //DONT HAVE THE FORMULA AND NO INTERNET
            return 0.;
        }

        boolean isSquare(){
            return l - h < .000001;
        }

        String to_string(){
            return "(" + (ref.x) + ", " + (ref.y + h) + ")" + "\t(" + (ref.x + l) + ", " + (ref.y + h) + ")\n(" + ref.x + ", " + ref.y + ")\t(" + (ref.x + l) + ", " + ref.y + ")\n";
        }

        void rectangle_main(){
            Rectangle rectangle1 = new Rectangle();
            Rectangle rectangle2 = new Rectangle(new Point_2D(5., 5.), 5., 5.);
            Rectangle rectangle3 = new Rectangle(new Point_2D(), new Point_2D(rectangle2.ref));
            System.out.println(rectangle1.to_string());
            System.out.println(rectangle2.to_string());
            System.out.println(rectangle3.to_string());
        }

    }


}