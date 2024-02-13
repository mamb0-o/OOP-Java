package ca.bcit.comp2526.assign1;


public class Filter
{

    public String source;
    public String expected;
    public Filter()
    {

    }
    public String apply(String source)
    {
    if(source == null){
            throw new IllegalArgumentException("value cannot be null");
    }

            return source;

    }
    public static String reverse(String str){
        String words[]=str.split(" ");
        String ans="";
        for (int i = words.length - 1; i >= 0; i--) {
            ans += words[i] + " ";
        }
        String word[]=ans.split(" ");
        String reverseWord="";
        for(String w:word){
            StringBuilder sbuilder=new StringBuilder(w);
            sbuilder.reverse();
            reverseWord+=sbuilder.toString()+" ";
        }
        return reverseWord.trim();
    }
    public static String upper(String str){
        return str.toUpperCase();
    }
    public static String capitl(String str){
        String word =str.toLowerCase();
        String ans= word.substring(0, 1).toUpperCase() + word.substring(1);

        return ans;

    }
    public static String lower(String str){
        return str.toLowerCase();
    }
    }
