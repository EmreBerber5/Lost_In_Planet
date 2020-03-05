package gui.levelcreator;

import java.io.FileNotFoundException;

import gui.components.*;
import io.data.DataManager;
import javafx.scene.image.Image;

public class MapScanner {

	public static Map createGraphicalComponents(Image picture, int blockSize) {
		
        int matrixDimHeight = ((int) picture.getHeight())/blockSize;
        //System.out.println(matrixDimHeight);
        int matrixDimWidth = ((int) picture.getWidth())/blockSize; 
        //System.out.println(matrixDimWidth);
        Map map = new Map(matrixDimHeight,matrixDimWidth); 
        Block block;
        
		for (int blockX = 0; blockX < picture.getHeight()-1;blockX += blockSize) {
			for (int blockY = 0; blockY < picture.getWidth()-1;blockY += blockSize) {
				//System.out.println("blockHeight:" + blockX);
				//System.out.println("blockWidth" + ":" + blockY);
				block = new Block(blockX,blockY,blockSize,blockSize);
				block.setBlockGridX(blockX);
				block.setBlockGridY(blockY);
				block.initializePixelMatrix();
				
				for (int pixelX = 0;pixelX < blockSize;pixelX++) {
					for (int pixelY = 0; pixelY < blockSize;pixelY++) {
						
						//System.out.println("pixelX&Y:" + (pixelX+blockX) + "|" + (pixelY+blockY));	
					
						
						block.getPixelMatrix()[pixelX][pixelY]
								.setColor(picture.getPixelReader().getColor(blockX+pixelX, blockY+pixelY)); // Set color of pixel
						
						block.getPixelMatrix()[pixelX][pixelY]    // Set global x of pixel
								.setGlobalX(blockX+pixelX);
						
						block.getPixelMatrix()[pixelX][pixelY]   // Set global y of pixel
								.setGlobalY(blockY+pixelY);
					}
				}
				
				map.getBlockMatrix()[blockX/blockSize][blockY/blockSize] = block;	
			}
			
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		String path = MapScanner.class.getClassLoader().getResource("images/Level0.png").getPath();
		//System.out.println(path);
		Image image = null;
		try {
			image = DataManager.loadImage(path, 40, 40);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map map = createGraphicalComponents(image,2);
		System.out.println(map.getBlockMatrix()[19][19].getPixelMatrix()[0][1].getColor());
		System.out.println(map.getBlockMatrix()[19][19].getPixelMatrix()[0][1].getColor().getRed());
		System.out.println(map.getBlockMatrix()[19][19].getPixelMatrix()[0][1].getColor().getGreen());
		System.out.println(map.getBlockMatrix()[19][19].getPixelMatrix()[0][1].getColor().getBlue());
	}
}
