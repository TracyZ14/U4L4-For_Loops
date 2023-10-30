public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString)
    {
        int numberOfTimesAppeared = 0;
        for (int i = 0; i < searchString.length(); i ++)
        {
            while (searchString.indexOf(character) != -1)
            {
                int index = searchString.indexOf(character);
                searchString = searchString.substring(0, index) + searchString.substring(index + 1);
                numberOfTimesAppeared++;
            }
        }
        return numberOfTimesAppeared;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString)
    {
        String reversed = "";
        for (int i = origString.length(); i >= 0; i--)
        {
            if (i == origString.length())
            {
                reversed = reversed + origString.substring(i);
            }
            else
            {
                reversed = reversed + origString.substring(i, i + 1);
            }
        }
        return reversed;
    }
}