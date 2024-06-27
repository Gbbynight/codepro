/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q7;

public class PhoneBook extends Phone {

    @Override
    void insertPhone(String name, String phone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            String[] entry = PhoneList.get(i).split(" : ");
            if (entry[0].equals(name)) {
                if (!entry[1].contains(phone)) {
                    PhoneList.set(i, entry[0] + " : " + entry[1] + " : " + phone);
                }
                return;
            }
        }
        PhoneList.add(name + " : " + phone);
    }

    @Override
    void removePhone(String name) {
        PhoneList.removeIf(entry -> entry.split(" : ")[0].equals(name));
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            String[] entry = PhoneList.get(i).split(" : ");
            if (entry[0].equals(name)) {
                PhoneList.set(i, name + " : " + newphone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (String entry : PhoneList) {
            if (entry.split(" : ")[0].equals(name)) {
                System.out.println(entry);
                return;
            }
        }
        System.out.println("Khong thay nguoi dung.");
    }

    @Override
    void sort() {
        PhoneList.sort((entry1, entry2) -> entry1.split(" : ")[0].compareTo(entry2.split(" : ")[0]));
    }
}
