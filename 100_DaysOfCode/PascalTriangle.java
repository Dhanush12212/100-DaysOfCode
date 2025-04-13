import java.util.Vector;
class PascalTriangle {
    Vector<Integer> generateRows(int row) {
        Vector<Integer> ansRows = new Vector<>();
        long ans = 1;
        ansRows.add(1);
        for(int col=1; col<row; col++) {
            ans = ans* (row - col);
            ans = ans / col;
            ansRows.add((int)ans);
        }
        return ansRows;
    }

    Vector<Vector<Integer>> pTriangle(int numRows) {
        Vector<Vector<Integer>> ans = new Vector<>();
        for(int i=1; i<=numRows; i++) {
            ans.add(generateRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
        int numRows = 5;
        Vector<Vector<Integer>> Triangle = sol.pTriangle(numRows);
        for(Vector<Integer> row : Triangle)
        {
            System.out.println(row);
        }
        
    }
}