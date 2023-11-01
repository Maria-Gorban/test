public class Main02 {
  public static int concatArray(int[] arr) { //метод для объединения
    int result = 0;
    for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
      result += arr[i] * Math.pow(10, j); //10^j
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {3, 4, 7, 8, 2};
    System.out.println("Число из массива: ");
    System.out.println(concatArray(arr));
  }
}


