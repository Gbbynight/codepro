/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MTLS
 */
public class SpecLift extends Lift{
    private int load;

    public SpecLift() {
        super();
    }

    public SpecLift(String label, int type,int load) {
        super(label, type);
        this.load = load;
    }

    @Override
    public String toString() {
        return getLabel() + "," + getLoad() + ", " + getType();
    }
    public int getLoad(){
        return load;
    }
    public void setLoad(int load){
    this.load = load;
 }
    public void setData(){
        StringBuilder modifiedLabel = new StringBuilder();
        for(int i = 0; i < getLabel().length();i++){
            if(i%2==0){
                modifiedLabel.append(getLabel().charAt(i));
            }
        }
        setLabel(modifiedLabel.toString());
    }
    public int getValue(){
        if(getLabel().contains(String.valueOf(getType()))){
            return getLoad()+ getType();
        } else {
            return getLoad();
        }
    }
}