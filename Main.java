import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;

class Main {
  public static void main(String[] args) throws Exception {
    // Open a file and save as a BufferedImage (a 2D int array)
    File f = new File("bPic.png");
    BufferedImage image = ImageIO.read(f);
    
    // Get some information about the 2D array
    int totalCols = image.getWidth();
    int totalRows = image.getHeight();
    System.out.println("Width is " + totalCols);
    System.out.println("Height is " + totalRows);
    
    // Create a black pixel and place it somewhere
    int blackPixel = new Color(0,0,0).getRGB();
    image.setRGB(14, 10, blackPixel);   // column, row, pixel value
    
    // PART 1a: Create a black border around the image. Start with the top row, 
    //        i.e., all the columns in row 0.

    
    // 1b. Do the bottom border, i.e., all the columns in the last row 
    
    
    // 1c. Do the left border, i.e., the 0th column in all the rows.
    
    
    // 1d. Do the right border, i.e., the last column in all the rows.
    
    
    // PART 2: Invert the colors, i.e. create a photo-negative. Do all the columns
    //    in all the rows. (This starter code does it for the top-left pixel.)
    Color originalColor = new Color(image.getRGB(0, 0)); // column, row
    int red = originalColor.getRed();
    int green = originalColor.getGreen();
    int blue = originalColor.getBlue();
    Color invertedColor = new Color(255-red, 255-green, 255-blue); // create inverted color
    image.setRGB(0, 0, invertedColor.getRGB()); // column, row, pixel value
    
    // Create a new file so we don't mess up the original
    File output = new File(f.getName().replace(".png", "") + "_new.png");
    ImageIO.write(image, "PNG", output);
    System.out.println("Created file at " + output.getAbsolutePath());
  }
}
