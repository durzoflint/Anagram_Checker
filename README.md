# Anagram_Checker
Code for Anagram Checker

It is often fun to see if rearranging the letters of a name gives an amusing anagram. For example, the letters of `WILLIAM SHAKESPEARE' rearrange to form `SPEAK REALISM AWHILE'. 

Write a program that will read in a dictionary and a list of phrases and determine which words from the dictionary, if any, form anagrams of the given phrases. Your program must find all sets of words in the dictionary which can be formed from the letters in each phrase. Do not include the set consisting of the original words. If no anagram is present, do not write anything, not even a blank line. 

Input
Input will consist of two parts. The first part is the dictionary, the second part is the set of phrases for which you need to find anagrams. Each part of the file will be terminated by a line consisting of a single #. The dictionary will be in alphabetic order and will contain up to 2000 words, one word per line. The entire file will be in upper case, and no dictionary word or phrase will contain more than 20 letters. You cannot assume the language being used is English. 

Output
Output will consist of a series of lines. Each line will consist of the original phrase, a space, an equal sign (=), another space, and the list of words that together make up an anagram of the original phrase, separated by exactly one space. These words must appear in alphabetic sequence. 

    Sample input
    ABC
    AND
    DEF
    DXZ
    K
    KX
    LJSRT
    LT
    PT
    PTYYWQ
    Y
    YWJSRQ
    ZD
    ZZXY
    # 
    ZZXY ABC DEF
    SXZYTWQP KLJ YRTD
    ZZXY YWJSRQ PTYYWQ ZZXY
    #

    Sample output
    SXZYTWQP KLJ YRTD = DXZ K LJSRT PTYYWQ
    SXZYTWQP KLJ YRTD = DXZ K LT PT Y YWJSRQ
    SXZYTWQP KLJ YRTD = KX LJSRT PTYYWQ ZD
    SXZYTWQP KLJ YRTD = KX LT PT Y YWJSRQ ZD
