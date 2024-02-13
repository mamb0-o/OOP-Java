package ca.bcit.comp2526.assign1;

public class CapitalizationFilter
        extends Filter
{

    public CapitalizationFilter() {



    }
    public String apply(String source)
    {

        if(source == null){
            throw new IllegalArgumentException("value cannot be null");
        }

        return capitl(source);

    }
}
