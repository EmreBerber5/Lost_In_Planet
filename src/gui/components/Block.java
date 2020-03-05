package gui.components;

public class Block {

	private int blockGridX;
	private int blockGridY;
	
	private int blockSize;
	
	private Pixel[][] pixelMatrix;
	
	public Block (int x, int y,int rows, int colums) {
		setMatrixDim(rows,colums);
		setBlockGridX(y);
		setBlockGridY(x);
		setBlockSize(rows);
	}
	
	public void initializePixelMatrix() {
		for (int h = 0;h < blockSize;h++) {
			for (int w = 0;w < blockSize;w++) {
				pixelMatrix[h][w] = new Pixel(h,w,null);
			}
		}
	}
	public void setMatrixDim(int rows,int colums) {
		pixelMatrix = new Pixel[rows][colums];  
	}
	
	public Pixel[][] getPixelMatrix() {
		return pixelMatrix;
	}

	public void setPixelMatrix(Pixel[][] pixelMatrix) {
		this.pixelMatrix = pixelMatrix;
	}

	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

	public int getBlockGridY() {
		return blockGridY;
	}

	public void setBlockGridY(int y) {
		this.blockGridY = y;
	}

	public int getBlockGridX() {
		return blockGridX;
	}

	public void setBlockGridX(int x) {
		this.blockGridX = x;
	}

}
