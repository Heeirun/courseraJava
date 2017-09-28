
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        startCodon= "ATG";
        stopCodon= "TAA";
        String result= "";
        int indexStart= dna.indexOf(startCodon);
        if (indexStart == -1) {
            return "";
        }
        int indexEnd= dna.indexOf(stopCodon, indexStart+3);
        if (indexEnd == -1) {
            return "";
        }
        result = dna.substring(indexStart, indexEnd+3);
        if(!(result.length()%3 == 0)){
            return "";
        }
        return result;
    }
    public void testSimpleGene() {
        String dna = "ACGTAATTAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATGGTTGATAGGCCGCTATAG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATCGTTGATATGCCTATCCTAGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTGATATGCTAACCTAAATGCT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTGATATTAACCTAAATGCT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
    }

}
