package TaskOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        String[] arr = {"asd", "qwe", "zxc", "fgh","vbn"};

        //вторая задача
        List<String> list = arrayToList(arr);
        System.out.println(list);

        //первая задача
        System.out.println(change(arr,1,3));

    }

    public static <T> List change(T[] arr, int indexOne, int indexTwo){
        T buffer = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = buffer;
        return Arrays.asList(arr);
    }

    public static <T> ArrayList arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }

}
