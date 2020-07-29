public class StringCount {
        /*

        We have bunnies standing in a line, numbered 1, 2, ...
        The odd bunnies (1, 3, ..) have the normal 2 ears. The even
        bunnies (2, 4, ..) we'll say have 3 ears, because they each
        have a raised foot. Recursively return the number of "ears"
        in the bunny line 1, 2, ... n (without loops or multiplication).
        bunnyEars2(0) → 0
        bunnyEars2(1) → 2
        bunnyEars2(2) → 5
            */
    public static void countX() {
        String str="helllo world";
        System.out.println("strin:   " +str.substring(1));
        }
    public int countS(String str) {
        if (str.length() == 0)

            return 0;

        int count = 0;
        if (str.charAt(0) == 'x') {//return character at the specified index

            count++;
        }
        return count + countS(str.substring(1));//return a  substring of the new string


    }
    public String changePi(String str) {
        if(str.length()==0){
            return str;
        }

        if(str.startsWith("pi")){

            return "3.14" + changePi(str.substring(2));

        }
        return str.substring(0,1) + changePi(str.substring(1));
    }
    public static void main(String[] args) {
        countX();
    }

    }

