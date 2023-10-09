package extra;

import java.util.Scanner;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point3D p = new Point3D();

        System.out.print("x >> ");
        p.setX(scanner.nextDouble());

        System.out.print("y >> ");
        p.setY(scanner.nextDouble());

        System.out.print("z >> ");
        p.setZ(scanner.nextDouble());

        System.out.print("point: " + p);
    }
}

