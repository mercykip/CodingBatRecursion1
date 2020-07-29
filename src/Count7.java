public class Count7 {
        /*
        Given a non-negative int n, return the count of the occurrences of
        7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%)
        by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
        removes the rightmost digit (126 / 10 is 12).
        count7(717) → 2
        count7(7) → 1
        count7(123) → 0
            */
    public static int count7(int n){
        int counter=0;
        //base case
        if(n %10==7){//gets the once digit and increament counter
            counter ++;
         //   System.out.println("counter : "+counter +" value of n :" +n);
        }
        if(n/10==0){//remove the once digit
              System.out.println("counter returned : "+counter );
            return counter;
        }
        else
        {
            System.out.println("counter : "+counter +" value of n :" +n);
        return counter+count7(n/10);
        }
    }

    public static void main(String[] args) {
        count7(767872767);
    }
}
