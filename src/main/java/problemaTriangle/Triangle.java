package main.java.problemaTriangle;
/*
Determine if a triangle is equilateral, isosceles, or scalene.
An equilateral triangle has all three sides the same length.
An isosceles triangle has at least two sides the same length.
(It is sometimes specified as having exactly two sides the same
length,
but for the purposes of this exercise we'll say at least two.)
A scalene triangle has all sides of different lengths.
Note
For a shape to be a triangle at all, all sides have to be of
length > 0,
and the sum of the lengths of any two sides must be greater
than or equal
to the length of the third side.
 */
public class Triangle {
    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) throws ExceptieTriangle {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a <= 0 || b <= 0 || c < 0 || a + b  <= c || b + c <= a || a + c <= b) {
                throw new ExceptieTriangle("nu este triunghi");
            }
        }

        public  boolean equilateral () {
            if (a == b && b == c) {
                return true;
            }
            return false;
        }

        public boolean isoscel () {
            if (a == b || b == c || a == c) {
                return true;
            }
            return false;
        }

        public boolean scalene () {
            if (a!= b && b!=c) {
                return true;
            }
            return false;
        }
        public static void main (String[]args) {
            Triangle triunghi = null;
            try {
                triunghi = new Triangle(-1, 4, 4);
                System.out.println(triunghi.scalene());
                System.out.println(triunghi.isoscel());
                System.out.println(triunghi.equilateral());
            } catch (ExceptieTriangle e) {
                System.out.println("nu este triunghi");
               e.printStackTrace();
            }

    }
    }

