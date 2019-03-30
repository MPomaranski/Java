import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i<=10; i++){
            System.out.println(i + "--->" + intArrayList.get(i).intValue());
        }

        Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double db = 0.0; db <10.0; db +=0.5){
            myDoubleValues.add(Double.valueOf(db));
        }
        for (int i =0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+"----->"+value);
        }
    }
}
