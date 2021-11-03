public class speeds {
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Система расчёта штрафов в Германии");

        System.out.println(calculateFine(100));

        int carSpeed = 108;

        int fineFor1to10 = 15;
        int fineFor11to15 = 25;
        int fineFor16to20 = 35;
        int fineFor21to25 = 80;
        int fineFor26to30 = 100;
        int fineFor31to40 = 160;
        int fineFor41to50 = 200;
        int fineFor51to60 = 280;
        int fineFor61to70 = 480;
        int fineFor71andMore = 680;


        int townSpeed = 60, countrySpeed = 90, overSpeed ;

        boolean isTown = false;

        if (isTown)
            overSpeed = carSpeed - townSpeed;
        else overSpeed = carSpeed - countrySpeed;


        if(overSpeed < 0) {
            System.out.println("Скорость не превышена");
        }
        else if(overSpeed >= 1 && overSpeed <= 10) {
            System.out.println("Штраф: " + fineFor1to10 + " евро");
        }
        else if(overSpeed >= 11 && overSpeed <= 15) {
            System.out.println("Штраф: " + fineFor11to15 + " евро");
        }
        else if(overSpeed >= 16 && overSpeed <= 20) {
            System.out.println("Штраф: " + fineFor16to20 + " евро");
        }
        else if(overSpeed >= 21 && overSpeed <= 25) {
            System.out.println("Штраф: " + fineFor21to25 + " евро");
        }
        else if(overSpeed >= 26 && overSpeed <= 30) {
            System.out.println("Штраф: " + fineFor26to30 + " евро");
        }
        else if(overSpeed >= 31 && overSpeed <= 40) {
            System.out.println("Штраф: " + fineFor31to40 + " евро");
        }
        else if(overSpeed >= 41 && overSpeed <= 50) {
            System.out.println("Штраф: " + fineFor41to50 + " евро");
        }
        else if(overSpeed >= 51 && overSpeed <= 60) {
            System.out.println("Штраф: " + fineFor51to60 + " евро");
        }
        else if(overSpeed >= 61 && overSpeed <= 70) {
            System.out.println("Штраф: " + fineFor61to70 + " евро");
        }
        else if(overSpeed >= 71) {
            System.out.println("Штраф: " + fineFor71andMore + " евро");
        }

        public static int calculateFine(int carSpeed) {
            return 0;
    }
    }

    public static int calculateFine(int carSpeed) {
        return 0;
    }
}


