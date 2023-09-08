package x.saveProgram;
public class Student{
    Student(int id , String name , cls std) throws InvalidNameException {
        setName(name);
        setId(id);
        setStandard(std);

    }
    private int  id;
    private String name;

    private int standard;

    public enum cls{
        LKG(-1) ,UKG(0) , I(1), II(2),III(3),IV(4),V(5);
        public int getCls(){
            return this.val;
        }
        private int val;
        private cls(int value)
        {
            this.val = value;
        }
    };


    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }

    public int getId() {
        return id;
    }

    public void setStandard(cls standard) {
        this.standard = standard.val;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) throws InvalidNameException {
        if(name.isEmpty() || name.length()>10) {
            throw new InvalidNameException();
        }
        this.name = name;
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(){
        super("Invalid Name Constraints !! Name should be in length from 0 to 10");
    }
}