public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Arr arr = new Arr(array);
        arr.printArr();
        arr.push(8);
        arr.printArr();
    }
}
