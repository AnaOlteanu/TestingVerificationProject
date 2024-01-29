import org.example.Main;
import org.example.MainMutant1;
import org.example.MainMutantNENeomorat;
import org.example.MainMutantNEOmorat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class MyTests {

//    Main main;
//    MainMutant1 main;
//    MainMutantNEOmorat main;
    MainMutantNENeomorat main;

    @Test
    public void equivalencePartitioning() throws IOException {
        File actual_file = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaOut.txt");

        //c_111
        File f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_1.txt");
        main.gaseste_dispozitive_redundante(f1);
        File expected_f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_1.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f1,actual_file));

        //c_112
        File f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_2.txt");
        main.gaseste_dispozitive_redundante(f2);
        File expected_f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_2.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f2,actual_file));

        //c_2
        File f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_3.txt");
        main.gaseste_dispozitive_redundante(f3);
        File expected_f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_3.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f3,actual_file));

        //c_3
        File f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_4.txt");
        main.gaseste_dispozitive_redundante(f4);
        File expected_f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_4.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f4,actual_file));

        //c_12
        File f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_5.txt");
        main.gaseste_dispozitive_redundante(f5);
        File expected_f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_5.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f5,actual_file));

        //c_13
        File f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_inputs\\input_6.txt");
        main.gaseste_dispozitive_redundante(f6);
        File expected_f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\EP_outputs\\expected_6.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f6,actual_file));
    }

    @Test
    public void boundariesAnalysis() throws IOException {
        File actual_file = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaOut.txt");

        //1
        File f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_1.txt");
        main.gaseste_dispozitive_redundante(f1);
        File expected_f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_1.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f1,actual_file));

        //2
        File f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_2.txt");
        main.gaseste_dispozitive_redundante(f2);
        File expected_f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_2.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f2,actual_file));

        //3
        File f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_3.txt");
        main.gaseste_dispozitive_redundante(f3);
        File expected_f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_3.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f3,actual_file));

        //4
        File f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_4.txt");
        main.gaseste_dispozitive_redundante(f4);
        File expected_f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_4.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f4,actual_file));

        //5
        File f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_5.txt");
        main.gaseste_dispozitive_redundante(f5);
        File expected_f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_5.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f5,actual_file));

        //6
        File f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_6.txt");
        main.gaseste_dispozitive_redundante(f6);
        File expected_f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_6.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f6,actual_file));

        //7
        File f7 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_7.txt");
        main.gaseste_dispozitive_redundante(f7);
        File expected_f7 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_7.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f7,actual_file));

        //8
        File f8 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_8.txt");
        main.gaseste_dispozitive_redundante(f8);
        File expected_f8= new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_8.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f8,actual_file));

        //9
        File f9 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_9.txt");
        main.gaseste_dispozitive_redundante(f9);
        File expected_f9 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_9.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f9,actual_file));

        //10
        File f10 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_inputs\\input_10.txt");
        main.gaseste_dispozitive_redundante(f10);
        File expected_f10 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\BA_outputs\\expected_10.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f10,actual_file));

    }

    @Test
    public void ceg() throws IOException {
        File actual_file = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaOut.txt");

        //1
        File f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_inputs\\input_1.txt");
        main.gaseste_dispozitive_redundante(f1);
        File expected_f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_outputs\\expected_1.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f1,actual_file));

        //2
        File f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_inputs\\input_2.txt");
        main.gaseste_dispozitive_redundante(f2);
        File expected_f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_outputs\\expected_2.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f2,actual_file));

        //3
        File f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_inputs\\input_3.txt");
        main.gaseste_dispozitive_redundante(f3);
        File expected_f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_outputs\\expected_3.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f3,actual_file));

        //4
        File f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_inputs\\input_4.txt");
        main.gaseste_dispozitive_redundante(f4);
        File expected_f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_outputs\\expected_4.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f4,actual_file));

        //5
        File f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_inputs\\input_5.txt");
        main.gaseste_dispozitive_redundante(f5);
        File expected_f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\CEG_outputs\\expected_5.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f5,actual_file));

    }

    @Test
    public void MCDC() throws IOException {
        File actual_file = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaOut.txt");

        //1
        File f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_1.txt");
        main.gaseste_dispozitive_redundante(f1);
        File expected_f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_1.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f1,actual_file));

        //2
        File f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_2.txt");
        main.gaseste_dispozitive_redundante(f2);
        File expected_f2 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_2.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f2,actual_file));

        //3
        File f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_3.txt");
        main.gaseste_dispozitive_redundante(f3);
        File expected_f3 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_3.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f3,actual_file));

        //4
        File f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_4.txt");
        main.gaseste_dispozitive_redundante(f4);
        File expected_f4 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_4.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f4,actual_file));

        //5
        File f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_5.txt");
        main.gaseste_dispozitive_redundante(f5);
        File expected_f5 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_5.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f5,actual_file));

        //6
        File f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_6.txt");
        main.gaseste_dispozitive_redundante(f6);
        File expected_f6 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_6.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f6,actual_file));

        //7
        File f7 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_7.txt");
        main.gaseste_dispozitive_redundante(f7);
        File expected_f7 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_7.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f7,actual_file));

        //8
        File f8 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_8.txt");
        main.gaseste_dispozitive_redundante(f8);
        File expected_f8= new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_8.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f8,actual_file));

        //9
        File f9 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_inputs\\input_9.txt");
        main.gaseste_dispozitive_redundante(f9);
        File expected_f9 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MCDC_outputs\\expected_9.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f9,actual_file));

    }

    @Test
    public void mutantNE() throws IOException {
        File actual_file = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\main\\resources\\granitaOut.txt");

        //1
        File f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MutantNENeomorat_inputs\\input_1.txt");
        main.gaseste_dispozitive_redundante(f1);
        File expected_f1 = new File("C:\\Facultate\\Master\\AN 2\\SEMESTRUL II\\TV\\lab\\PROIECT_LAB_TV\\src\\test\\java\\MutantNENeomorat_outputs\\expected_1.txt");
        Assertions.assertTrue(FileUtils.contentEquals(expected_f1,actual_file));
    }






}
