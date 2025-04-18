public class StringMethods {

static void space() {
    System.out.println();
}

    public static void main(String[] args) {
        
    // equalsIgnoreCase()
    String name = "chov";
    boolean isNameChov = name.equalsIgnoreCase("chov");
    
    System.out.println(isNameChov);
    
    space();
    // length()
    String word = "nalukuna";
    
    System.out.println(word);
    System.out.println("length : " + word.length());
    
    space();
    // charAt()
    word = "skividi";
    int setIndex = 3;
    
    System.out.println(word);
    System.out.println("character at " + setIndex + " : " + word.charAt(setIndex));
    
    space();
    // indexOf()
    word = "yameti";
    char setChar = 'e';
    
    System.out.println(word);
    System.out.println("character index of " + setChar + " : " + word.indexOf(setChar));
    
    space();
    // isEmpty()
    word = "g";
    boolean isEmpty = word.isEmpty();
    
    System.out.println(word);
    System.out.println("is the word empty? : " + isEmpty);
    
    space();
    // isBlank()
    word = "f";
    boolean isBlank = word.isBlank();
    
    System.out.println(word);
    System.out.println("is the word blank? : " + isBlank);
    
    space();
    // {
    // toUpperCase()
    word = "but when eye, won a 20v1. i get -10,000 aura? wow... i see how it is.";
    word = word.toUpperCase();
    System.out.println(word);
    // toLowerCase()
    word = word.toLowerCase();
    System.out.println(word);
    
    space();
    // trim()
    word = "            opz";
    System.out.println("non trim : " + word);
    word = word.trim();
    System.out.println("trimmed : " + word);
    
    space();
    // replace()
    word = "lomego";
    System.out.println("orig : " + word);
    word = word.replace('e', 'i');
    System.out.println("replaced : " + word);
    }
}