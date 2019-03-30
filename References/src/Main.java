import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int intValue = 10;
        int anotherIntValue = intValue;

        System.out.println("myIntVaule = "+ intValue);
        System.out.println("anotherIntValue = "+ anotherIntValue);

        anotherIntValue ++;
        System.out.println("myIntVaule = "+ intValue);
        System.out.println("anotherIntValue = "+ anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherMyIntArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherMyIntArray));
        myIntArray[0] = 1;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherMyIntArray));

        anotherMyIntArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherMyIntArray));

    }


    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
