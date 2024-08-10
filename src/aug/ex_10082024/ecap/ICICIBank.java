package aug.ex_10082024.ecap;

public class ICICIBank {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public long getBal(boolean isAdmin) {
        if (isAdmin) {
            return bal;
        } else {
            return 0;
        }
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed!");
        }
    }
}
