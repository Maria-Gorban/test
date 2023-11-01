public class Main02 {
  //куку привет мой виртуальный коллега:)
  public static int concatArray(int[] arr) { //метод для объединения массив цифр в одно число
    int result = 0;
    for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
      result += arr[i] * Math.pow(10, j); //10^j
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {1, 5, 3, 9, 6};
    System.out.println("Число из заданного массива: ");
    System.out.println(concatArray(arr));
  }
}


