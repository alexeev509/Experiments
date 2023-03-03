public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().summ(1,2,100));
    }

    public int summ(int... array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}


//  public summ([I)I