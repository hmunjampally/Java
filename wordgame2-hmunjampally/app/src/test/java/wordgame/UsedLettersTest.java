
package wordgame;

import org.junit.Test;

import wordgame.model.SecretWord;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsedLettersTest {
    
    @Test // to check if the values are read from a file and not hardcoded
    public void testFileReading() throws IOException {
        
        File tempFile = creatingTempFile("Value1\nValue2\nValue3");
        ArrayList<String> values = new ArrayList<>();
        try {
            Scanner scan = new Scanner(tempFile);
            while (scan.hasNextLine()) {
                String nextWord = scan.nextLine();
                values.add(nextWord);
            }
            scan.close();
        } catch (FileNotFoundException error) {
            fail("File not found: " + error.getMessage());
        }

        ArrayList<String> expectedValues = new ArrayList<>();
            expectedValues.add("Value1");
            expectedValues.add("Value2");
            expectedValues.add("Value3");
            assertEquals(expectedValues, values);
    }
    public File creatingTempFile(String data) throws IOException {
        File tempFile = File.createTempFile("testfile", ".txt");
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(data);
        }

        return tempFile;
    }


    @Test //test case to check if the word check is case sensitive or not
    public void caseSensitiveCheck() 
    {
        SecretWord secret = new SecretWord("Brain");
        TestGuesser guesser = new TestGuesser("braIN");
        Game game = new Game(secret, guesser);
        game.play();
        assertEquals(game.getResult(), Result.WIN);
    }

    @Test 
        public void RepeatedGuessErrorNotCounted() {
        SecretWord secret = new SecretWord("world");
        TestGuesser guesser = new TestGuesser("worolrd");
        Game game = new Game(secret, guesser);
        game.setErrorLimit(2);
        game.play();
        assertEquals(game.getResult(), Result.WIN);
    }

        
}

/*
 



 */
    

