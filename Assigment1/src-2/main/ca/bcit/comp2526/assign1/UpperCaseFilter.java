package ca.bcit.comp2526.assign1;

public class UpperCaseFilter
    extends Filter
{


    public String apply(String source)
    {

        if(source == null){
            throw new IllegalArgumentException("value cannot be null");
        }

        return upper(source);

    }
}
