package july.ex_28072024;

public class Lab155 {
    public static void main(String[] args) {


        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using




        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();


        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();

    }
}
