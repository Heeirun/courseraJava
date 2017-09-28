
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
    
        int indexStart= dna.indexOf("ATG");
        if (indexStart == -1) {
            return "";
        }
        int indexEnd= dna.indexOf("TAA", indexStart+3);
        if (indexEnd == -1) {
            return "";
        }
        
        while ( indexEnd != -1) {
            if ((indexEnd-indexStart) % 3 == 0) {
                return dna.substring(indexStart, indexEnd+3);
            }
            
            else {
                indexEnd= dna.indexOf( "TAA", indexEnd+1);                
            }
        }
        return "";
    }
    public void testSimpleGene() {
        String dna = "ACGTAATTAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATGGTTGATAGGCCGCTATAG";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //       v  v  v  v  v  v  v  v
        dna = "CGATCGTTGATATGCCTATCCTAGA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTGATATGCTAACCTAAATGCT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        
        dna = "CGATGGTTGATATTAACCTAAATGCT";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}
