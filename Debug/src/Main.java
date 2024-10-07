public class Main {
    public static void main(String[] args) {
        InterfaceA a = new Print();
        a.printCapitalLetter();
        InterfaceB b = new Print();
        b.printLowercaseLetter();
    }
}