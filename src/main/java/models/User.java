package models;

public class User {
    private int userID;
    private String name;
    private String email;
    private int age;
    private String className;


    public User(int userID, String name, String email, int age, String className){
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.age = age;
        this.className = className;

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }






}
