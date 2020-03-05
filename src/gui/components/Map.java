package gui.components;

public class Map {

	private Block[][] blockMatrix;
	
	public Map(int rows, int colums) {
		setMatrixDim(rows,colums);
	}

	public void setMatrixDim(int rows,int colums) {
		blockMatrix = new Block[rows][colums]; 
	}

	public Block[][] getBlockMatrix() {
		return blockMatrix;
	}

	public void setBlockMatrix(Block[][] blockMatrix) {
		this.blockMatrix = blockMatrix;
	}

}
