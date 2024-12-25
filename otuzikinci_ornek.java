package JAVA101;

public class otuzikinci_ornek {
    static boolean isPalindrom(int number) {
        int temp = number , reversenumber=0,lastnumber;
        while (temp!=0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }

            if (reversenumber == number)
                return true;
            else
                return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }

}

