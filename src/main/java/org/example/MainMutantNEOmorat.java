package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainMutantNEOmorat {

    public static void gaseste_dispozitive_redundante(File f) throws IOException{
        Scanner myScanner = new Scanner(f);
        FileWriter myWriter = new FileWriter("src/main/resources/granitaOut.txt");

        int n, i, nr_dispozitive = 0, k;

        n = myScanner.nextInt();
        if(n < 1 || n > 6){
            myWriter.write("n este invalid");
            myWriter.close();
            return;
        }

        k = myScanner.nextInt();
        if(k < 1 || k > 20){
            myWriter.write("k este invalid");
            myWriter.close();
            return;
        }

        List<Interval> intervals = new ArrayList<>();

        for(i = 0; i < n; i ++){
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            Interval interval = new Interval(a, b);
            intervals.add(interval);
        }

        Collections.sort(intervals, new Cmp());

        int max_crt = -1;

        for(i = 0; i < n - 1; i++){ //mutant ne-echivalent omorat de testul ceg()
            if(intervals.get(i).b > max_crt && intervals.get(i).b - intervals.get(i).a <= k){
                max_crt = intervals.get(i).b;
            }
            else {
                nr_dispozitive ++;
            }
        }

        if(nr_dispozitive > 0){
            myWriter.write(String.valueOf(nr_dispozitive));
            myWriter.close();
        } else {
            myWriter.write("nu s-au gasit dispozitive redundante");
            myWriter.close();
        }
    }

//    public static void main(String[] args) {
//        try{
//            File f = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaIn.txt");
//            gaseste_dispozitive_redundante(f);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}