package class12;

public class Task6 {
    public static void main(String[] args) {


        /*
        Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and
calculate how many total countries been stored.
         */

        String [][] countries ={{"USA", "Canada", "Mexico"},
                {"Brazil","Argentina","Peru","Columbia","Chile"},
                {"Germany","Unted Kingdom","France","Spain"},
        {"China","India","Japan","Russia"},
                {"Egype","Nigeria","South Africa", "Ethopia"}};
        System.out.println (countries.length);

        int counter=0;

        for(int i=0; i<countries.length; i++){
            for( int j=0; j<countries.length; j++){

            }
            System.out.println();
        }
        System.out.println("Total countries "+counter);
    }
}
