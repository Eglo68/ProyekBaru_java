/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9_vavian;

/**
 *
 * @author user
 */
public class Hewan {    
    
    public String jenisKelamin;
    public int umur;
    public String warnaBulu;
    //constructor default
    public Hewan() {
    }
    //constructor dengan parameter
    public Hewan(String jenisKelamin, int umur, String warnaBulu) {
    this.jenisKelamin = jenisKelamin;
    this.umur = umur;
    this.warnaBulu = warnaBulu;
    }
    
    
    public static void main(String[] args){ 
        
    Hewan anjing = new Hewan();
    anjing.jenisKelamin = "Jantan";
    anjing.umur = 5;
    anjing.warnaBulu = "Cokelat";
    System.out.println("Anjing " + anjing.jenisKelamin + " berumur " + anjing.umur + " tahun berbulu " + anjing.warnaBulu);
    
    String perilaku = "Anjing melompati pagar.";
    return perilaku;
    
    //cara memanggi prosedur
    System.out.println(anjing.melompat());
    
    
    public String melompat(String parameter) {
    String perilaku = "Anjing melompati " + parameter + ".";
    return perilaku;
    }
    
    Hewan anjing = new Hewan();
    anjing.jenisKelamin = "Jantan";
    anjing.umur = 5;
    anjing.warnaBulu = "Cokelat";
    System.out.println("Anjing " + anjing.jenisKelamin + " berumur " + anjing.umur + " tahun berbulu " + anjing.warnaBulu);

    //cara memanggi prosedur
    System.out.println(anjing.melompat("Kursi"));
    
    
}

