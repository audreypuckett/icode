package com.fdmgroup.icode.image.grayscale;

import java.awt.image.BufferedImage;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;

@Service("grayscale")
public class ImageFilter {

	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void grayscaleFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************
		 int width = bufferedImage.getWidth();
	     	 int height = bufferedImage.getHeight();
	     	//iterate over each pixel of the image
	     	 for(int y=0;y<height;y++) {
		     for(int x=0;x<width;x++) {
		         //get the rgb value
		         int rgb = bufferedImage.getRGB(x,y);
		         int R=(rgb>>16)&0xFF;
		         int G=(rgb>>8)&0xFF;
		         int B=rgb&0xFF;
		         //get RGB average values
		         int Avg=(R+G+B)/3;
		         int newRGB=(Avg<<16)|(Avg<<8)|Avg;
		         bufferedImage.setRGB(x, y, newRGB);
		     }
	         }
		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "grayscale");
	}

}
