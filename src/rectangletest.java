 import org.junit.Test;
 import static org.junit.Assert.assertEquals;

 public class rectangletest {
   rectagle myrectangle = new rectangle(5,6);

   @Test
   public void testGetArea() {
     assertEquals(myrectangle.getArea(), 30);
   }
  
   @Test
   public void testGetPerimeter() {
     assertEquals(myrectangle.getPerimeter(), 22);
   }
   
   @Test
   public void testLength() {
     assertEquals(myrectangle.length, 5);
   }

   @Test
   public void testWidth() {
     assertEquals(myrectangle.width, 6);
   }
 }
