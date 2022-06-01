package problems;
 
class Geometry {
 
    // Utility function
    static int areaRectangle(int a, int b)
    {
       int area = a * b;
       return area;
    }
 
    static int perimeterRectangle(int a, int b)
    {
       int perimeter = 2*(a + b);
       return perimeter;
    }
     
    // Driver Function
    public static void main (String[] args) {
 
        int a = 7;
        int b = 9;
        System.out.println("Area = "+ areaRectangle(a, b));
        System.out.println("Perimeter = "+ perimeterRectangle(a, b));
 
    }
}