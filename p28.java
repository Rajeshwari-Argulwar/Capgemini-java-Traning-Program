public class p28 {
    public static void main(String[] args) {
        int size = 7; // Outer layer size
        int[][] square = new int[size][size];
        
        // Fill the square
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    square[i][j] = 7;
                } else {
                    square[i][j] = Math.max(size - i, size - j);
                }
            }
        }
        
        // Print the square
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
