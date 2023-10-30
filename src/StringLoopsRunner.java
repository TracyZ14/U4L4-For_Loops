public class StringLoopsRunner
{
    public static void main(String[] args)
    {
        StringLoops loops = new StringLoops();
        System.out.println(loops.countCharacters("a", "Apples and bananas"));
        System.out.println(loops.countCharacters("A", "Apples and bananas"));
        System.out.println(loops.countCharacters("!", "Hello! Nice day!"));
        System.out.println(loops.reverseString("hello!"));
        System.out.println(loops.reverseString("Apples and bananas"));
    }
}