package vcelearner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author J.Weidehaas
 */
public class Test {

    public static void main(String[] args) {
        
////       //Testen Lernkarte§Themenbereich
//        Lernkarte2Themenbereich lK2TB = new Lernkarte2Themenbereich(1, 1);
//        Lernkarte2Themenbereich.insert(lK2TB);

//         //Testen PotentielleAntwort.insert()
//         PotentielleAntwort pA = new PotentielleAntwort(true, "Raum 5.2", 1);
//         PotentielleAntwort.insert(pA);
//        //Testen Lernkarte ohne Array
//        LernKarte lK = new LernKarte("Wie spät?", 1);
//        
        //zusätzlich testen Lernkarte mit Themenbereich  ArrayList
//        ArrayList<Themenbereich> tBs = new ArrayList<>();
//        tBs.add(new Themenbereich(1,"Java advanced"));
//        tBs.add(new Themenbereich(2, "Whatever"));
//        lK.settBs(tBs);
//         //zusätzlich testen Lernkarte mit PotentielleAntworten  ArrayList
//        ArrayList<PotentielleAntwort> pAs = new ArrayList<>();
//        pAs.add(new PotentielleAntwort(true, "Raum 5.2"));
//        pAs.add(new PotentielleAntwort(false, "Gebäudee 2"));
//        lK.setpAs(pAs);
//        
//        //Methode testen
//        LernKarte.insert(lK);
//        ArrayList<LernKarte> lKs = LernKarte.getAll();
//        System.out.println(lKs);
////        Lernkarte2Themenbereich.delete(1);
////        PotentielleAntwort.delete(1);
//          LernKarte.delete(lK);
/**
 * ein bischen unsinnn
 */
        Sitzung s = new Sitzung();
//        s.addLernKarte(new LernKarte("Wie spät?", 1));
//        System.out.println(s.getAktuelleLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println("------------------");
////        System.out.println(s.getPrevLernKarte());
////        System.out.println(s.getPrevLernKarte());
////         s.removeLernKarte(new LernKarte("Wie spät?", 1));
////         
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getPrevLernKarte());
//         
//        s.setAktuelleLernKarte(new LernKarte("Wie früh?", 1));
//         
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        LernKarte lK = s.getById(3);
//        System.out.println(lK);

/**
 * Test Team Datenbank ... Isabel und Rainer
 */

//    LernSitzung2LernKarte lS2lK = new LernSitzung2LernKarte(5, 1, true);
//    LernSitzung2PotentielleAntwort lS2pA = new LernSitzung2PotentielleAntwort(5, 4);
//    LernSitzung2PotentielleAntwort lS2pA1 = new LernSitzung2PotentielleAntwort(5, 5);
//    LernSitzung lS = new LernSitzung("ungewertet", "2016-05-30", 1);
//    LernSitzung.insert(lS);
//    LernSitzung2LernKarte.insert(lS2lK);
//    LernSitzung2PotentielleAntwort.insert(lS2pA);
//    LernSitzung2PotentielleAntwort.insert(lS2pA1);
    
//    System.out.println(lS.toString());
//    System.out.println(lS2lK.toString());
//    System.out.println(lS2pA.toString());
//    System.out.println(lS2pA1.toString());

        Benutzer user = new Benutzer(1, "chef", "abc", "vorname", "nachname");
        
        
        LernKarte lk1 = new LernKarte(1, "frage", 0);
        ArrayList<PotentielleAntwort> pAs1 = new ArrayList<>();
        PotentielleAntwort pA1 = new PotentielleAntwort(true, "antwort1", 1);
        pA1.setId(1);
        PotentielleAntwort pA2 = new PotentielleAntwort(false, "antwort2", 1);
        pA2.setId(2);
        
        pAs1.add(pA1);
        pAs1.add(pA2);
        lk1.setpAs(pAs1);
        boolean wv1= false;
        
        
       
        
        
        LernKarte lk2 = new LernKarte(2, "frage", 0);
        ArrayList<PotentielleAntwort> pAs2 = new ArrayList<>();
        PotentielleAntwort pA3 = new PotentielleAntwort(true, "antwort3", 2);
        pA3.setId(3);
        PotentielleAntwort pA4 = new PotentielleAntwort(false, "antwort4", 2);
        pA4.setId(4);
        pAs2.add(pA3);
        pAs2.add(pA4);
        lk2.setpAs(pAs2);
        boolean wv2= true;
        
        
        
        ArrayList<LernKarte> lKs =new ArrayList<>();
        lKs.add(lk1);
        lKs.add(lk2);
        
        LernSitzung lernSitzung = new LernSitzung(1, "ungewertet", "datum", 1);
        
        BenutzerSitzung benutzerSitzung = new BenutzerSitzung(user, lKs, lernSitzung);
        //benutzerSitzung.getsLKs().get(0).setGemogeltTrue();
        benutzerSitzung.getsLKs().get(0).setGegebeneAntworten(pAs1);
        benutzerSitzung.getsLKs().get(0).setWiederVorlage(wv1);
        benutzerSitzung.getsLKs().get(1).setGegebeneAntworten(pAs2);
        benutzerSitzung.getsLKs().get(1).setGemogeltTrue();
        benutzerSitzung.getsLKs().get(1).setWiederVorlage(wv2);
//        System.out.println(benutzerSitzung.toString());

        System.out.println(benutzerSitzung);
        BenutzerSitzung.insert(benutzerSitzung);

      


    }
}
