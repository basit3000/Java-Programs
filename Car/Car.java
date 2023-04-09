public class Car {
    private String name;
    private String direction;
    private int position;
    public Car(String name, String direction, int position){
        this.name = name;
        this.direction = direction;
        this.position = position;
    }
    public Car(String name, String direction){
        this(name, direction, 0);
    }
    public Car(String name){
        this(name, "E");
    }
    public Car(){
        this("random"); 
    }
    public void turn(){
        if(direction.equals("N")){
            direction = "E";
        }
        else if(direction.equals("S")){
            direction = "W";
        }
        else if(direction.equals("E")){
            direction = "S";
        }
        else if(direction.equals("W")){
            direction = "N";
        }
        else{
            System.out.println("No changes");
        }
    }
    public void turn(String direction){
        this.direction = direction;
    }
    public void move(int position){
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public String getDirection(){
        return direction;
    }
    public int getPosition(){
        return position;
    }
}
