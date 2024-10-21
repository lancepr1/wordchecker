import java.util.ArrayList;
public class Main{
    public static void main(String[] args)
    {
    ArrayList<String> words = new ArrayList<String>();
    words.add("an");
    words.add("band");
    words.add("band");
    words.add("abandon");
    WordChecker w = new WordChecker(words);
    System.out.println(w.isWordChain());

    ArrayList<String> hello = new ArrayList<String>();
    hello.add("to");
    hello.add("too");
    hello.add("stool");
    hello.add("tools");
    WordChecker x = new WordChecker(hello);
    System.out.println(x.isWordChain());

    ArrayList<String> hi = new ArrayList<String>();
    hi.add("catch");
    hi.add("bobcat");
    hi.add("catchacat");
    hi.add("cat");
    hi.add("at");
    WordChecker z = new WordChecker(hi);
    System.out.println(z.createList("cat"));
    System.out.println(z.createList("catch"));
    System.out.println(z.createList("dog"));
    }
    
}