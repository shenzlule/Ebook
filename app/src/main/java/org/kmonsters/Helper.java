package org.kmonsters;

import org.kmonsters.adapters.PdfItem;

import java.util.ArrayList;

/*
 * this class is responsible for sharing  book items between fragments
 * */
public class Helper {
    private static ArrayList<PdfItem> added_to_cart=new ArrayList<>();

    private static ArrayList<PdfItem> full_items_list=new ArrayList<>();

    private static ArrayList<PdfItem> ready_list=new ArrayList<>();

    public static ArrayList<PdfItem> getReady_list() {
        return ready_list;
    }

    public static void setReady_list() {



        // Add items from added_to_cart to ready_list, avoiding duplicates
        for (PdfItem item : Helper.added_to_cart) {
            // Check if the item with the same name already exists in ready_list
            boolean itemExists = false;
            for (PdfItem existingItem : Helper.ready_list) {
                if (existingItem.getName().equals(item.getName())) {
                    itemExists = true;
                    break;
                }
            }

            // If the item does not exist in ready_list, add it
            if (!itemExists) {
                Helper.ready_list.add(item);
            }
        }
    }




    public static ArrayList<PdfItem> get_Added_to_cart() {
        return added_to_cart;
    }

    public  static void  add_item(PdfItem pdfItem){
        full_items_list.add(pdfItem);

    }


    public  static void remove_item(int pos){
        added_to_cart.remove(pos);

    }


    public static void add_item_on_click(PdfItem item) {
        // Check if the item with the same name already exists
        boolean itemExists = false;
        for (PdfItem existingItem : added_to_cart) {
            if (existingItem.getName().equals(item.getName())) {
                itemExists = true;
                break;
            }
        }

        // If the item does not exist, add it to the list
        if (!itemExists) {
            added_to_cart.add(item);
        }
    }


    public  static void  clear_all(){
       added_to_cart.clear();
       full_items_list.clear();

    }

    public  static int getAmount(){
        int amount=0;
        for(PdfItem pdfItem:Helper.get_Added_to_cart()){
            amount=amount+pdfItem.getPrice();

        }        return  amount;
    }



}
