import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static service.Spinner.spinArray;

public class App {

    public static void main(String[] args) {


        //      input: int[]{1,2,3,4,5}
        System.out.println(Arrays.toString(spinArray(new int[]{1, 2, 3, 4, 5}, 111)));
        //      output for 2: int[]{4,5,1,2,3}
        //      output for 1: int[]{5,1,2,3,4}
        //      output for 5: int[]{1,2,3,4,5}

    }


}
