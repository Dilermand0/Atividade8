public class NumberController {
    private NumberModelo model;
    private View view;

    public NumberController(NumberModelo model,View view) {
        this.model = model;
        this.view = view;
    }

    public void setNumbers(int[] numbers) {
        model = new NumberModelo(numbers);
    }

    public void sortNumbers() {
        model.insertionSort();
    }

    public void displayNumbers() {
        int[] numbers = model.getNumbers();
        view.displayNumbers(numbers);
    }
}