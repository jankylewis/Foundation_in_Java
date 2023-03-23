package ProgramEngineering.Constructor;

public class RobotCat {

    private String name;
    private String color;

    //generate an empty constructor
    public RobotCat() {

    }

    //generate a parameterized constructor
    public RobotCat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        //empty constructor
        RobotCat dfRobotCat = new RobotCat();
        System.out.println(dfRobotCat.getName());
        System.out.println(dfRobotCat.getColor());

        //parameterized constructor
        RobotCat paramRobotCat = new RobotCat("First Robot Cat",
                "Purple");
        System.out.println(paramRobotCat.getName());
        System.out.println(paramRobotCat.getColor());

    }
}
