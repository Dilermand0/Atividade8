public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 10, 3, 8, 1, 6, 9, 4, 7};

        NumberModelo model = new NumberModelo(numbers);
        View view = new View();
        NumberController controller = new NumberController(model, view);

        controller.sortNumbers();
        controller.displayNumbers();
    }
}