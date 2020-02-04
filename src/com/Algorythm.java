/*
File names.txt contains over 5 thousand names.



Firstly, please sort those names alphabetically (from A to Z) – of course as a part your program.
Each name has a value, which is sum of letter values (letter value is position in alphabet) multiplied by position of name in sorted file.


For example, when the file is sorted alphabetically, sum of letters in COLIN name is 3 + 15 + 12 + 9 + 14 = 53 and COLIN is the 938th name in the sorted file. COLIN score is 938 × 53 = 49714.



The question and result of the task is: What is the sum of all the name scores in this file?
 */


package com.filip;

import java.util.Arrays;

public class Algorythm {
    public int calculateNameScore(String[] names){
        Arrays.sort(names);
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            int value = 0;
              for(int j = 0; j < names[i].length(); j++){
                  value += names[i].charAt(j) - 'A' + 1;
              }
              sum += value * (i + 1);
        }


            return sum;
    }
}
