class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;

        int len = encodedText.length();
        int cols = len / rows;

        char[][] matrix = new char[rows][cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = encodedText.charAt(index++);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int col = 0; col < cols; col++) {
            int i = 0, j = col;

            while (i < rows && j < cols) {
                result.append(matrix[i][j]);
                i++;
                j++;
            }
        }

        int end = result.length();
        while (end > 0 && result.charAt(end - 1) == ' ') {
            end--;
        }

        return result.substring(0, end);
    }
}
