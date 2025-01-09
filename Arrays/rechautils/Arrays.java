package rechautils;

public class Arrays {
    public static java.lang.Object[] ExpandArray(java.lang.Object[] arrayToExpand){
        
        return java.util.Arrays.copyOf(arrayToExpand, arrayToExpand.length + 1);

    } 
    public static java.lang.Object[] ExpandArray(java.lang.Object[] arrayToExpand, Object value){
        java.lang.Object[] newArray = java.util.Arrays.copyOf(arrayToExpand, arrayToExpand.length + 1);
        newArray[newArray.length - 1] = value;

        return newArray;
    } 
}
