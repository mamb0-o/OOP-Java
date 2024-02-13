package ca.bcit.comp2526;
/*
 Alisher Shamayev, A01182865
 */
public class LowerTransform implements Transformer{

    @Override
    public String transform(String str) {
        final String result;
        if(str==null){
            throw new IllegalArgumentException("input cannot be null");
        }
        result= str.toLowerCase();
        return result;
    }
}
