/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class SpecUser extends User {
    private String address;

    public SpecUser() {
        super();
    }

    public SpecUser(String name, int status, String address ) {
        super(name, status);
        this.address = address;
    }

    @Override
    public String toString() {
        return getName() + ", " + address + ", " + getStatus();
    }
    public void setData(){
        setName(getName() + address);
    }
    public String getValue(){
        if(getStatus() == 1){
            return getName() + "admin";
        } else {
            return getName() + "user";
        }
    }
}
