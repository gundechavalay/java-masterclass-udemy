public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age>= 0 && age <=100)
            this.age = age;
        else
            this.age = 0;
    }
    public boolean isTeen(){
        if (age > 12 && age < 20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        boolean isEmptyFirstName = firstName.isEmpty();
        boolean isEmptyLastName = lastName.isEmpty();
        if (isEmptyFirstName && isEmptyLastName)
            return "";
        else if (isEmptyFirstName)
            return lastName;
        else if (isEmptyLastName)
            return firstName;
        else
            return firstName + " " + lastName;
    }
}
