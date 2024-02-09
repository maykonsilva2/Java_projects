package Java_Sintaxe_Ex;

public class LoopArray {
    public static void main(String args[]) {
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // System.out.println("Loop For Through an Array------------------");
        // loopThroughAnArray(cars);

        // System.out.println("Loop For Through an Array with For-Each------------------");
        // loopThroughAnArrayWithForEach(cars);

        int[][] myNumbers = { {10, 20, 30, 40}, {50, 60, 70} };

        System.out.println("Loop Through a multi-Dimensional Array-----------------------");
        loopThroughMultiDimesionalArray(myNumbers);


    }

    public static void loopThroughAnArray(String[] array) {
        for(int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void loopThroughAnArrayWithForEach(String[] array) {
        for(String str : array) {
            System.out.println(str);
        }
    }

    public static void loopThroughMultiDimesionalArray(int[][] array) {
        for(int line = 0; line < array.length; line++) {
            for(int column = 0; column < array[line].length; column++) {
                System.out.print("Line: " + (line + 1) + " column: " + (column + 1) + " = " + array[line][column] + "\n");
            }
        }
    }
}
