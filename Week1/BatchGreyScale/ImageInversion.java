
/**
 * Write a description of ImageInversion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class ImageInversion {
        //Started with making out the image that i wanted inImage
        public ImageResource makeInvert (ImageResource inImage) {
        //made blank image of same size
        ImageResource outImage= new ImageResource (inImage.getWidth(), inImage.getHeight());
        //for each pizel of outImage
            for (Pixel pixel: outImage.pixels()) {
                //look at corresponding pixels in inImage
                Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
                //compute imversion
                int invR= 250-inPixel.getRed();
                int invB= 250-inPixel.getBlue();
                int invG= 250-inPixel.getGreen();
                
                //set pixel's red to average
                pixel.setRed(invR);
                //set pixel's green to average
                pixel.setGreen(invG);
                //set pixel's blue to average
                pixel.setBlue(invB);
                
            }
        //outImage is your answer
        return outImage;
    }
    public void selectAndConvert () {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            ImageResource inImage = new ImageResource(f);
            ImageResource invert = makeInvert(inImage);
            String fname= inImage.getFileName();
            String newname= "inverted-"+fname;
            inImage.setFileName(newname);
            invert.draw();
            invert.save();
        }
   
    }
}
