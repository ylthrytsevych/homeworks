package homework14;

public class App {

    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();
        printer.print(new PrinterImpl.Message("Петро", "Хело ворлд"));

        printer.print(new PrinterImpl.Message(null, "Я нулл"));
        printer.print(new PrinterImpl.Message("", "Я анонім"));

        printer.print(new PrinterImpl.Message("", ""));
        printer.print(new PrinterImpl.Message(null, ""));
        printer.print(new PrinterImpl.Message(null, null));
        printer.print(new PrinterImpl.Message("", null));



    }
}
