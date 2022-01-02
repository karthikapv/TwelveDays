
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TwelveDaysTest {
    @Test
    public void testVerseOne() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseOne = "On the first day of Christmas my true love gave to me: " + "a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseOne, twelveDays.verse(1));

    }
    @Test
    public void testVerseTwo() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseTwo = "On the second day of Christmas my true love gave to me: two Turtle Doves, " + "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTwo, twelveDays.verse(2));
    }
    @Test
    public void testVerseThree() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseThree = "On the third day of Christmas my true love gave to me: three French Hens, " + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseThree, twelveDays.verse(3));
    }
    @Test
    public void testVerseFour() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseFour = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseFour, twelveDays.verse(4));
    }

    @Test

    public void testVerseFive() {
        TwelveDays twelveDays=new TwelveDays();
        String expectedVerseFive = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseFive, twelveDays.verse(5));
    }

    @Test

    public void testVerseSix() {
        TwelveDays twelveDays=new TwelveDays();
        String expectedVerseSix = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +"five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseSix, twelveDays.verse(6));
    }

    @Test

    public void testVerseSeven() {
        TwelveDays twelveDays=new TwelveDays();
         String expectedVerseSeven = "On the seventh day of Christmas my true love gave to me: " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseSeven, twelveDays.verse(7));
    }

    @Test

    public void testVerseEight() {
        TwelveDays twelveDays=new TwelveDays();
        String expectedVerseEight = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," + " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseEight, twelveDays.verse(8));
    }

    @Test
    public void testVerseNine() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseNine = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +"eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseNine, twelveDays.verse(9));
    }

    @Test
    public void testVerseTen() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseTen = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +"nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +"five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTen, twelveDays.verse(10));
    }

    @Test
    public void testVerseEleven() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseEleven = "On the eleventh day of Christmas my true love gave to me: " +"eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseEleven, twelveDays.verse(11));
    }
    @Test
    public void testVerseTwelve() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVerseTwelve = "On the twelfth day of Christmas my true love gave to me: " +"twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +"eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTwelve, twelveDays.verse(12));
    }
    @Test

    public void testFirstThreeVerses() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVersesOneToThree = "On the first day of Christmas my true love gave to me: " +"a Partridge in a Pear Tree.\n\n" +"On the second day of Christmas my true love gave to me: two Turtle Doves, " +"and a Partridge in a Pear Tree.\n\n" +"On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVersesOneToThree, twelveDays.verses(1, 3));

    }

    @Test
    public void testFourthToSixthVerses() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedVersesFourToSix = "On the fourth day of Christmas my true love gave to me: " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n\n" +"On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n\n" +"On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVersesFourToSix, twelveDays.verses(4, 6));
    }
    @Test
    public void testSingWholeSong() {
        TwelveDays twelveDays = new TwelveDays();
        String expectedSong = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +"\n" +"On the second day of Christmas my true love gave to me: two Turtle Doves, " +"and a Partridge in a Pear Tree.\n" +"\n" +"On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n" +"\n" +"On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +"two Turtle Doves, and a Partridge in a Pear Tree.\n" +"\n" +"On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +"\n" + "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +"\n" +"On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +"six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n" +"\n" +"On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +"\n" +"On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +" seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +"\n" +"On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +" eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" +"On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " + "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +"six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +"and a Partridge in a Pear Tree.\n" +"\n" +"On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedSong, twelveDays.sing());
    }
}