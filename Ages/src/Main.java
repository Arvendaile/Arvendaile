public class Main
{
    public static void main(String[] args)
    {
        int vasyaAge =40;
        int katyaAge = 32;
        int mishaAge = 12;

        int min = 0;
        int middle = 0;
        int max = 0;


        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            System.out.println("max " + vasyaAge);
            if (mishaAge > katyaAge) {
                System.out.println("middle " + mishaAge);
                System.out.println("min " + katyaAge);
            } else {
                System.out.println("middle " + katyaAge);
                System.out.println("min " + mishaAge);
            }

        } else if (mishaAge > katyaAge) {
            System.out.println("max " + mishaAge);
            if (vasyaAge > katyaAge)
                System.out.println("middle " + vasyaAge);
                System.out.println("min " + katyaAge);
        } else   {
            System.out.println("max " + katyaAge);
            if (vasyaAge > mishaAge)
                System.out.println("middle " + vasyaAge);
                System.out.println("min " + mishaAge);
            }

    }

}


