package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computers memory.
        we are calling it box1 if we need the information that we are storing inside the box
        we can simply say to the computer give us the contents of box1.
         */
        int box1=10;
        // if we are printing something we don't need ""
        System.out.println(box1); // bring the contents of box1 and print them on the console
        /*To store whole numbers(Numbers without decimals points) we have 4 different types of boxes.
         for example numbers like 10 20 3000 100000 330000
         1) byte 2) short 3) int 4) long
         */
        byte box2=127; // range for byte is from 128 to 127 if we need to store larger numbers we should try shor
        byte box3=-128;
        short box4=32767;
        short box5=-32567;
        int biggerBox=123456484; // most common type of box
        long maxBox=15131351465464l; //why do we need put L

    }
}