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
        String[] arrSpeakersSplit = speakers.split("");

        //if(all letters equal each other) return first letter
        if (arrSpeakersSplit[0].equals(arrSpeakersSplit[1]) &&
                arrSpeakersSplit[2].equals(arrSpeakersSplit[1]))
            return arrSpeakersSplit[0];


        //if(no letters equal each other) remove letters from list of all possibilities
        //and return remaining letter
        if (!(arrSpeakersSplit[0].equals(arrSpeakersSplit[1])) &&
                !(arrSpeakersSplit[0].equals(arrSpeakersSplit[2])) &&
                !(arrSpeakersSplit[1].equals(arrSpeakersSplit[2]))
        ) {
            List<String> languageList = new ArrayList<>(List.of("D", "F", "I", "R"));
            languageList.removeAll(Arrays.asList(arrSpeakersSplit));
            return languageList.toString();
        }

        //if(only two letters equal each other) return non-equal letter
        if((arrSpeakersSplit[0].equals(arrSpeakersSplit[1])) && !(arrSpeakersSplit[0].equals(arrSpeakersSplit[2])))
            return arrSpeakersSplit[2];
        if((arrSpeakersSplit[0].equals(arrSpeakersSplit[2])) && !(arrSpeakersSplit[0].equals(arrSpeakersSplit[1])))
            return arrSpeakersSplit[1];
        if((arrSpeakersSplit[1].equals(arrSpeakersSplit[2])) && !(arrSpeakersSplit[1].equals(arrSpeakersSplit[0])))
            return arrSpeakersSplit[0];

        return "reached end of method";
    }

    public static void main(String[] args) {
        TrilingualDemocracy tD = new TrilingualDemocracy();
        System.out.println(tD.chooseLanguage("DDD"));
        System.out.println(tD.chooseLanguage("DFR"));
        System.out.println(tD.chooseLanguage("IIR"));
        System.out.println(tD.chooseLanguage("FDF"));
        System.out.println(tD.chooseLanguage("FRR"));



    }

}
