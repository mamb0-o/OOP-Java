package ca.bcit.comp2526.assign1;

public class ReverseFilter
    extends Filter
{

    public String apply(String source)
    {

        if(source == null){
            throw new IllegalArgumentException("value cannot be null");
        }

        return reverse(source);

    }

}
