import java.text.DecimalFormat;

public class Dog
{
    //Instance variables
    private String name;
    private int age;
    private String breed;
    private double weight;
    //Static variable
    private static int numOfDogs;

    //Constructors
    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        numOfDogs++;
    } //end full constructor

    public Dog()
    {
        name = "name goes here";
        age = 0;
        breed = "breed goes here";
        weight = 0.0;
    } //end default constructor

    //Getters and setters  
    public String getName()
    {
        return name;
    }

    public void setName(String myName)
    {
        name = myName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int myAge)
    {
        age = myAge;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String myBreed)
    {
        breed = myBreed;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(int myWeight)
    {
        weight = myWeight;
    }

    public static int getNumOfDogs()
    {
        return numOfDogs;
    }

    //Brain method
    public double weightInKilograms()
    {
        DecimalFormat fmt = new DecimalFormat("0.##");
        double kilograms = weight * 0.45359237;
        return Double.parseDouble(fmt.format(kilograms));
    }

    //toString
    public String toString()
    {
        String output = name + " " +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nWeight: " + weightInKilograms();
        return output;
    }
}
  