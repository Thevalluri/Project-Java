public class rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);


    rectangle myrectangle = new rectangle(length, width);

    String output = String.format("**** Your rectangle ***\n\nLength: %d\nWidth: %d\nArea: %\nPerimeter: %d\n\n", myrectangle.length, myrectangle.width, myrectangle.getArea(), myrectangle.getPerimeter());

    System.out.println(output);
   }
}  
