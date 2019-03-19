public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 5,true);
        System.out.println(printer.getTonerLevel());
        printer.fillUpTheToner(30);
        System.out.println(printer.getTonerLevel());
        printer.printPage(5);
        System.out.println(printer.getTonerLevel());
        printer.printPage(23);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getNumberOfPages());
    }
}
