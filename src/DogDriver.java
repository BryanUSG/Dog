public class DogDriver
{
    public static void main(String[] args)
    {
        //Instantiation of Reference Class objects'
        Dog dog1 = new Dog("Fang", 5, "Husky", 80.0);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45.0);
        Dog dog3 = new Dog("Rocky", 8, "Golden Retriever", 71.0);

        System.out.println("Fang's breed: " + dog1.getBreed());
        System.out.println("Fang's age: " + dog1.getAge());
        System.out.println("Piper's weight: " + dog2.weightInKilograms());
        System.out.println("\n" + dog3.toString());
        System.out.println("Total number of dogs: " + dog3.getNumOfDogs());
    }
}