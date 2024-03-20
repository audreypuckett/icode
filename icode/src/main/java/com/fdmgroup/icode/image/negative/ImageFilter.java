package com.fdmgroup.icode.image.negative;

import java.awt.*;
import java.awt.image.BufferedImage;

import org.springframework.stereotype.Service;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.util.ImageUtils;

@Service("negative")
public class ImageFilter {
	
	private ImageUtils utils;

	public ImageFilter(ImageUtils utils) {
		super();
		this.utils = utils;
	}

	public void negativeFilter(ImageInfo imageInfo) {
		BufferedImage bufferedImage = utils.getBufferedImage(imageInfo);
		// ******************** CODE BELOW ****************
		for (int y = 0; y < bufferedImage.getHeight(); y++) {
			for (int x = 0; x < bufferedImage.getWidth(); x++) {
				//Retrieving contents of a pixel
				int pixel = bufferedImage.getRGB(x,y);
				//Creating a Color object from pixel value
				Color color = new Color(pixel, true);
				//Retrieving the R G B values
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				//Modifying the RGB values
				red = 255 - red;
				green = 255 - green;
				blue = 255 - blue;
				//Creating new Color object
				color = new Color(red, green, blue);
				//Setting new Color object to the image
				bufferedImage.setRGB(x, y, color.getRGB());
			}
		}
		// ******************** CODE ABOVE ******************
		utils.saveBufferedImage(bufferedImage, imageInfo.getSimpleName(), "negative");
	}

	public void deleteImageById(ImageInfo image) {
		System.out.println(image.getName());
	}
}
