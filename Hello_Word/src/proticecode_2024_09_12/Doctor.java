package proticecode_2024_09_12;

import java.util.ArrayList;

public class Doctor {
    private ArrayList<Item> item = new ArrayList<Item>();
    public void add(Item item)
    {
    }
    public void printlistd()
    {
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.add(new DVD("张明",60,"java发展史","2020-2-3"));
        doc.printlistd();
    }
}
