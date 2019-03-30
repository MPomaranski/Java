public class Main {

    public static void main(String[] args) {
        Sort sort = new Sort(10);
        sort.addingNumbers();
        sort.printArray(sort.getTab());
        sort.sortArray();
        sort.printArray(sort.sortArray());

    }
}
