// write your code here

public class Print implements InterfaceA, InterfaceB {
    public String printLowercaseLetter(){
        return "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    }
    public String printCapitalLetter(){
        return "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
    }

}

interface InterfaceB{
    public abstract String printLowercaseLetter();
}


interface InterfaceA{
    public String printCapitalLetter();
}