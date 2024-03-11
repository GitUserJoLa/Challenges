/*
Trilingual Democracy

"""
Switzerland has four official languages: German, French, Italian, and Romansh.

When native speakers of one or more of these languages meet,
they follow certain regulations to choose a language for the group.
Here are the rules for groups of exactly three people:

    When all three are native speakers of the same language,
    it also becomes their group's language.

    When two are native speakers of the same language,
    but the third person speaks a different language,
    all three will converse in the minority language.

    When native speakers of three different languages meet,
    they eschew these three languages and instead use the remaining of the four official languages. [...]
"""

Read the whole description of the problem here:
https://www.codewars.com/kata/62f17be8356b63006a9899dc
Credits to jcsahnwaldt
 */

import java.util.*;

public class TrilingualDemocracy {
    public String chooseLanguage(String speakers) {
        //each letter in speakers string symbolizes a language spoken
        //save each letter to a separate field
        //and compare the fields for equality
        String[] letters = speakers.split("");

        //if(all letters equal each other) return first letter
        if (letters[0].equals(letters[1]) &&
                letters[2].equals(letters[1]))
            return letters[0];

        //if(no letters equal each other) return letter which isn't in the array
        if (!(letters[0].equals(letters[1])) &&
                !(letters[0].equals(letters[2])) &&
                !(letters[1].equals(letters[2]))
        ) {
            //languageList contains all possible letters
            List<String> languageList = new ArrayList<>(List.of("D", "F", "I", "R"));

            //remove all letters from languageList which appear in letter array
            //(removeAll() takes collections as arguments -> turn array into collection)
            languageList.removeAll(Arrays.asList(letters));

            //return languageList.toString(); //has cosmetic output issues
            //turn list into array again to resolve cosmetic output issues
            String[] arrLanguageLeft = languageList.toArray(String[]::new);
            return arrLanguageLeft[0];
        }

        //if(only two letters equal each other) return non-equal letter
        if ((letters[0].equals(letters[1])) && !(letters[0].equals(letters[2])))
            return letters[2];
        if ((letters[0].equals(letters[2])) && !(letters[0].equals(letters[1])))
            return letters[1];
        if ((letters[1].equals(letters[2])) && !(letters[1].equals(letters[0])))
            return letters[0];

        return "could not choose language";
    }

    public static void main(String[] args) {
        TrilingualDemocracy tD = new TrilingualDemocracy();
        System.out.println("DDD: " + tD.chooseLanguage("DDD"));
        System.out.println("DFR: " + tD.chooseLanguage("DFR"));
        System.out.println("IIR: " + tD.chooseLanguage("IIR"));
        System.out.println("FDF: " + tD.chooseLanguage("FDF"));
        System.out.println("FRR: " + tD.chooseLanguage("FRR"));
    }
}
