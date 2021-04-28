package main.java.classroom;

import main.java.users.User;

import java.util.*;

public class Classroom {

    public Classroom(LinkedList<User> users){
        this.users = new LinkedList<User>();
    }

    LinkedList<User> users;

    public void add(User user){
        if(users.size() == 0){
            users.add(user);
        }
        else {
            for (User u : users) {
                if (user.getName().equals(u.getName()) == false) {
                    users.add(user);
                    System.out.println("+" + user.getName());
                    break;
                } else {
                    System.out.println("User is already exist, must be only one");
                    break;
                }
            }
        }
    }

    public User get(int ID){
        return users.get(ID);
    }

    public LinkedList<User> getUsers() {
        return users;
    }

    public void setUsers(LinkedList<User> users) {
        this.users = users;
    }

    public int size(){
        return users.size();
    }

}
