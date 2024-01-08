import java.util.List;



/*
//        int a, b;
//        a = 10;
//        b = (a == 1) ? 20 : 30;
//
//        System.out.println("Value of b is : " + b);
 */
public class NumberPrinter {

    public int printNumbersTeriB(int a){
        int b = (a ==10) ? 20 : 30;
        return b;
    }


    public int printNumbersTeriA(int a){
        int b = (a ==1) ? 20 : 30;
        return b;
    }

    public String printNumbersListAsString(List<Integer> numbers){
        StringBuilder result = new StringBuilder();
        for(Integer x: numbers){
            result.append(x).append(",");
        }
        return result.toString();
    }

    public void printNumbersList(List<Integer> numbers){
        for(Integer x: numbers){
            System.out.println(x + ", ");
        }
    }

    public String printStringList(List<String> strings){
        StringBuilder result = new StringBuilder();
        for(String x: strings){
            result.append(x).append(",");
        }
        return result.toString();
    }

    public int minFunction(int n1, int n2){
        int min = Math.min(n1, n2);
        return min;
    }
}
