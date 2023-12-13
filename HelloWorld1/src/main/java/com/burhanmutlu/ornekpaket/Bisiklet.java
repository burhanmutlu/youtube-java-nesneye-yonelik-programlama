package com.burhanmutlu.ornekpaket;

public class Bisiklet {
    private int tekerlekSayisi; // camel case
    private String renk;
    
    public Bisiklet() {
        tekerlekSayisi = 2;
        renk = "siyah";
    }
    
    public Bisiklet(int tekerlekSayisi) {
        this();
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public Bisiklet(String renk) {
        this.renk = renk;
    }

    public Bisiklet(int tekerlekSayisi, String renk) {
        this.tekerlekSayisi = tekerlekSayisi;
        this.renk = renk;
    }
    
    public void setTekerlekSayisi(int tekerlekSayisi) {
        if(tekerlekSayisi < 0) {
            System.out.println("tekerlek sayisi 0dan küçük olamaz");
        } else {
            this.tekerlekSayisi = tekerlekSayisi;
        }
    }
    
    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public String getRenk() {
        if(tekerlekSayisi == 2) {
            return renk;
        } else {
            return "hata";
        }
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }  

    @Override
    public String toString() {
        return "Tekerlek sayısı: " 
                + tekerlekSayisi 
                + "- Renk: " + renk;
    }
    
    
    
}
