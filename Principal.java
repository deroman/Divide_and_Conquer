
public class Principal {


    public static int sumaPositivos1(int[] vector, int i0, int iN) {
        if (i0 == iN)
            return vector[i0];
        else {
            int k = (i0 + iN) / 2, sum = 0;
            int a = sumaPositivos1(vector, i0, k);
            int b = sumaPositivos1(vector, k + 1, iN);
            sum += a > 0 ? a : 0;
            sum += b > 0 ? b : 0;
            return sum;
        }
    }

    public static int sumaPositivos1(int[] vector) {
        return sumaPositivos1(vector, 0, vector.length - 1);
    }
}
