package Iterator;
//https://ru.stackoverflow.com/questions/1259516/%D1%81%D0%BE%D0%B7%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5-%D0%B8%D1%82%D0%B5%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%B0-%D0%B4%D0%BB%D1%8F-%D0%BA%D0%B0%D1%81%D1%82%D0%BE%D0%BC%D0%BD%D0%BE%D0%B3%D0%BE-%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D0%B0
public class Example {
    public static void main(String[] args) {
        String[] strings = {"123", "456", "789"};
        // конструкция for each, на самом деле (при компиляции), разворачиватеся в итератор
        for (FullName fullName : new FullNameCollections(strings)) {
            fullName.printFullName();
        }
    }
}
