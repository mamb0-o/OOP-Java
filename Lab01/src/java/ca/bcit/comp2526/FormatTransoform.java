package ca.bcit.comp2526;
/*
 Alisher Shamayev, A01182865
 */
public class FormatTransoform implements Transformer{
    @Override
    public String transform(String str) {
        final String result;
        if(str!=null && !str.trim().isEmpty()) {
            result=str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
            return result;
        }
        else {
            throw new IllegalArgumentException("cannot be empty");
        }
    }
}
