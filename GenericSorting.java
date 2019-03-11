
package project1;

/**
 *
 * @author masbahuddin
 */
public class GenericSorting <T extends Comparable <T>>{
    private T[][] grid;
    public GenericSorting(T[][] a)
    {
        this.grid = a;
    }
    
    public T[][] getGrid()
    {
        return this.grid;
    }
    
    public void setGrid(T[][] a)
    {
        this.grid = a;
    }

    public  void sort(){
        int col = 0;
        int row = 0;

        int prevCol = col;
        int prevRow = row;

        int newRow = -1;
        int newCol = -1;


        for(prevRow = 0; prevRow < this.grid.length; prevRow++){
            for (prevCol = 0; prevCol < this.grid[prevRow].length; prevCol++){
                T prev = this.grid[prevRow][prevCol];
                newCol = prevCol;
                newRow = prevRow;
                T min = prev;

                for (row = 0; row < this.grid.length; row++){
                    for (col = 0; col < this.grid[row].length; col++){
                        if((row <= prevRow && col < prevCol) || row < prevRow){
                            continue;
                        }
                        if (min.compareTo(this.grid[row][col]) == 1){
                            min = this.grid[row][col];
                            newCol = col;
                            newRow = row;
                        }
                    }

                }
                this.grid[prevRow][prevCol] = this.grid[newRow][newCol];
                this.grid[newRow][newCol] = prev;


            }
        }

        for (int row2 = 0; row2 < this.grid.length; row2++){
            for (int col2 = 0; col2 < (this.grid[row2].length)/2; col2++){
                if(row2 % 2 != 0){
                    T prev2 = this.grid[row2][col2];
                    this.grid[row2][col2] = this.grid[row2][this.grid[row2].length - 1 - col2];
                    this.grid[row2][this.grid[row2].length - 1 - col2] = prev2;

                }
            }
        }

    }

    public void print2DArray()
    {
        for(int i=0; i<this.grid.length;i++)
        {
            for(int j=0; j < this.grid[i].length; j++)
            {
                System.out.print(this.grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
