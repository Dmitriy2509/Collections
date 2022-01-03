package singleton;

public class PetTest {

    public static void main(String[] args) {
        Pets firstPet = Pets.petSingleton();
        firstPet.setNickName("Play");
        System.out.println(firstPet);

//        Pets secondPet = new Pets(); Can't create new one
        Pets thirdPet = Pets.petSingleton();
        thirdPet.setNickName("Stop");

        System.out.println(firstPet); //Terminal:Pets(nickName=Stop) Pay attention to terminal. We tried to print the firstPet, but got nickname of the thirdPet
    }
}
