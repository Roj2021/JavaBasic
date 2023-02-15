package class12;

public class StringDemo9 {
    public static void main(String[] args) {


        String str="hagsfdk hlut 398945678";
        int counter=0;
        for(int i = 0; i < str.length(); i++){

            if(Character.isAlphabetic(str.charAt(i))){
                counter++;

            }
        }
        System.out.println("Total isAlphabet in Str "+counter);
    }
}
