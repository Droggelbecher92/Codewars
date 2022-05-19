package de.kittlaus.codewars.may;

/*Deoxyribonucleic acid (DNA) is a chemical found in the nucleus
of cells and carries the "instructions" for the development and
functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other,
as "C" and "G". You function receives one side of the DNA
(string, except for Haskell); you need to return the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
dnaStrand []        `shouldBe` []
dnaStrand [A,T,G,C] `shouldBe` [T,A,C,G]
dnaStrand [G,T,A,T] `shouldBe` [C,A,T,A]
dnaStrand [A,A,A,A] `shouldBe` [T,T,T,T]*/

public class DnaStrand {

    public static String makeComplement(String dna) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
                char c = dna.charAt(i);
                switch (c) {
                    case 'A' -> output.append("T");
                    case 'T' -> output.append("A");
                    case 'C' -> output.append("G");
                    case 'G' -> output.append("C");
                    default -> {
                        output.append(i+1);
                        output.append(i);
                        i++;
                    }
                }
        }
        return output.toString();
    }

}
