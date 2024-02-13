package ca.bcit.comp2526.assign1;

public class LowerCaseFilter
    extends Filter
{

    public String apply(String source)
    {
        if(source == null){
            throw new IllegalArgumentException("value cannot be null");
        }

        return lower(source);

    }

}
