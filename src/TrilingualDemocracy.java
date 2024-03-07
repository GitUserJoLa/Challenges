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
        System.out.println("method parameter String: " + speakers);

        String[] arrSpeakersSplit = speakers.split("");

        System.out.println("split arr[0]:" + arrSpeakersSplit[0] +
                "\nsplit arr[1]:" + arrSpeakersSplit[1] +
                "\nsplit arr[2]:" + arrSpeakersSplit[2]);

        //if(all letters equal each other) return equal letter

        if (arrSpeakersSplit[0].equals(arrSpeakersSplit[1]) &&
                arrSpeakersSplit[2].equals(arrSpeakersSplit[1])) {
            System.out.println("return value for " + speakers + ": " + arrSpeakersSplit[0]);
            return arrSpeakersSplit[0];
        }


        //if(all letters are different) compare to list of all possibilities
        // and return the letter which is not in the list

        if (!(arrSpeakersSplit[0].equals(arrSpeakersSplit[1])) &&
                !(arrSpeakersSplit[0].equals(arrSpeakersSplit[2])) &&
                !(arrSpeakersSplit[1].equals(arrSpeakersSplit[2]))
        ) {
            List<String> possibleLanguage = new ArrayList<>(List.of("D", "F", "I", "R"));
            List<String> compare = Arrays.asList(arrSpeakersSplit);
            possibleLanguage.removeAll(compare);
            
            System.out.println("return value for " + speakers + ": " + possibleLanguage.toString());

            return possibleLanguage.toString();

        }

        //if(only two letters equal each other) return non-equal letter

        return "reached end of method";
    }

    public static void main(String[] args) {
        TrilingualDemocracy tD = new TrilingualDemocracy();
        System.out.println(tD.chooseLanguage("DDD"));
        System.out.println(tD.chooseLanguage("DFR"));
        //System.out.println(tD.chooseLanguage("DDD"));


    }

}
