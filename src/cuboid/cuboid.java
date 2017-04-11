package cuboid;

/**
 * Created by HP on 4/11/2017.
 */
public class cuboid {
  int length;
  int width;
  int height;

  public cuboid(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public void getSurface() {
    int s1 = length * width;
    int s2 = length * height;
    int s3 = width * height;
    System.out.println("The total surface is : " + 2 * (s1 + s2 + s3));
  }

  public void getVolume() {
    System.out.println("The total volume is : " + (length * width * height));
  }

  public static void main(String[] args) {
    cuboid myCuboid = new cuboid(1, 2, 3);
    myCuboid.getSurface();
    myCuboid.getVolume();
  }
}
