import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Autocarro {


    final private String licensePlate;

    Random r = new Random();
    public Autocarro() {

        String carryingCapacity = "10 Tonnellate";
        String loadType = "Serbatoio GAS";
        licensePlate = generateLicensePlate();
    }



    private @NotNull
    String generateLicensePlate(){
        char firstLetter = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
        char secondLetter = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
        char thirdLetter = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
        char fourthLetter = Character.toUpperCase((char)(r.nextInt(26) + 'a'));
        String targa=
                Character.toString(firstLetter) +
                        Character.toString(secondLetter) +
                        Integer.toString((int) (Math.random() * 10))+
                        Integer.toString((int) (Math.random() * 10))+
                        Integer.toString((int) (Math.random() * 10))+
                        Character.toString(thirdLetter) +
                        Character.toString(fourthLetter);
        return targa;
    }


    public String getLicensePlate(){
        return licensePlate;
    }






}
