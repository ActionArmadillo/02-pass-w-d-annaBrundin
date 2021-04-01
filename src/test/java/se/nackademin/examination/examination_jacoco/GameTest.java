package se.nackademin.examination.examination_jacoco;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game = new Game();
    ArrayList<String> values = new ArrayList<String>();

    @Test
    public void collectInputDataCorrectUserInput() {
        String[] input = {"Game", "Anna", "Brown", "F", "38", "Stockholm"};
        InputStream in = new ByteArrayInputStream(String.join(System.lineSeparator(), Arrays.asList(input)).getBytes());
        System.setIn(in);

        assertEquals("Game", game.collectInputData().get(0));
    }

    @Test
    public void testGetGenderFromInputValues() {
        values.addAll(Arrays.asList("Game", "Anna", "Brown", "F", "38", "Stockholm"));
        assertEquals('F', game.getGenderFromInputValues(values));
    }

    @Test
    public void testGetAgeFromInputValues() {
        values.addAll(Arrays.asList("Game", "Anna", "Brown", "F", "38", "Stockholm"));
        assertEquals(38, game.getAgeFromInputValues(values));
    }

    @Test
    public void testCalculateOutPutBasedOnNames(){
        int i = game.calculateOutPutBasedOnNames("Anna", "Brown");
        assertEquals(0, i, 0);
        i = game.calculateOutPutBasedOnNames("Annika", "Brown");
        assertEquals(1, i, 0);
        i = game.calculateOutPutBasedOnNames("Anna", "Blue");
        assertEquals(2, i, 0);
    }

    @Test
    public void testCalculateOutPutBasedOnGender(){
        int i = game.calculateOutPutBasedOnGender('F');
        assertEquals(1, i, 0);
        i = game.calculateOutPutBasedOnGender('M');
        assertEquals(0, i, 0);
        i = game.calculateOutPutBasedOnGender('N');
        assertEquals(2, i, 0);
    }

    @Test
    public void testCalculateOutPutBasedOnAge(){
        int i = game.calculateOutPutBasedOnAge(40);
        assertEquals(1, i, 0);
        i = game.calculateOutPutBasedOnAge(14);
        assertEquals(0, i, 0);
    }

    @Test
    public void testCalculateOutPutBasedOnHomeCity() {
        assertEquals(0, game.calculateOutPutBasedOnHomeCity("Alby"), 0);
        assertEquals(1, game.calculateOutPutBasedOnHomeCity("Bruges"), 0);
        assertEquals(2, game.calculateOutPutBasedOnHomeCity("Copenhagen"), 0);
        assertEquals(3, game.calculateOutPutBasedOnHomeCity("Donbas"), 0);
        assertEquals(4, game.calculateOutPutBasedOnHomeCity("Eskilstuna"), 0);
        assertEquals(5, game.calculateOutPutBasedOnHomeCity("Falun"), 0);
        assertEquals(6, game.calculateOutPutBasedOnHomeCity("GBG"), 0);
        assertEquals(7, game.calculateOutPutBasedOnHomeCity("Höör"), 0);
        assertEquals(8, game.calculateOutPutBasedOnHomeCity("Innsbruck"), 0);
        assertEquals(9, game.calculateOutPutBasedOnHomeCity("Johannesburg"), 0);
        assertEquals(10, game.calculateOutPutBasedOnHomeCity("Katrineholm"), 0);
        assertEquals(10, game.calculateOutPutBasedOnHomeCity("Vilnius"), 0);
    }

    @Test
    public void testRunGame() {
        game.runGame("Game", "Anna", "Brown", 'F', 38, "GBG");
    }

    @Test
    public void testRun() {
        values.addAll(Arrays.asList("Game", "Anna", "Brown", "F", "38", "Stockholm"));
        game.run(values);
    }
}
