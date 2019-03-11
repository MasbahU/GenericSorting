
package project1;

/**
 *
 * @author masbahuddin
 */
public class TestGenericSorting
{
    public static void main(String[] args)
    {
        Integer[][] grid = {{32, 19, 27, 90},
                            {100, 22, 29, 23},
                            {34, 1, 45, 37},
                            {397, 49, 76, 63},
                            {204, 95, 77, 49},
                            {47, 54, 13, 11}};


        Double[][] grid2 = {{1.9, 3.4, 0.45 , 23.9, 34.5},
                            {1.49, 6.37, 7.54, 5.43, 3.46},
                            {50.76, 112.24, 19.6, 19.99, 45.3}};


        Integer[][] grid3 = {{95, 34, 87, 300, 899, 6},
                            {99, 32, 777, 900, 87, 4},
                            {3, 9, 430, 235, 102, 32},
                            {45, 34, 98, 23, 190, 19},
                            {93, 54, 86, 84 ,27, 19},
                            {234, 54, 67, 20, 200, 123},
                            {30, 7, 19, 22, 34, 31}};


        GenericSorting srt = new GenericSorting(grid);
        srt.sort();
        srt.print2DArray();
        System.out.println();

        srt.setGrid(grid2);
        srt.sort();
        srt.print2DArray();
        System.out.println();

        srt.setGrid(grid3);
        srt.sort();
        srt.print2DArray();
        System.out.println();
    }
}
