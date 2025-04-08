public class Passenger {
    private String Title;
    private String First_name;
    private String Last_name;
    private int Age;
    private String ID_Code;

    public Passenger() {
    }

    public Passenger(String title, String first_name, String last_name, int age, String ID_Code) {
        Title = title;
        First_name = first_name;
        Last_name = last_name;
        Age = age;
        this.ID_Code = ID_Code;
    }

    public String getTitle() {
        if (Title.equals("Mr")) {
            return Title;
        }
        else if (Title.equals("Mrs")){
            return Title;
        }
        else if (Title.equals("Ms")){
            return Title;
        }
        else{
            throw new IllegalArgumentException("Must be Mr, Mrs or Ms");
        }
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirst_name() {
        if (First_name.equals("Mark")) {
            return First_name;
        }
        else {
            throw new IllegalArgumentException("Can't be less then 3 characters");
        }
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getID_Code() {
        return ID_Code;
    }

    public void setID_Code(String ID_Code) {
        this.ID_Code = ID_Code;
    }
}
