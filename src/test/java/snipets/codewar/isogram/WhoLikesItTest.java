package snipets.codewar.isogram;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import snipets.codewar.likes.Omar;
import snipets.codewar.likes.WhoLikesIt;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Who likes it exercise")
class WhoLikesItTest {

    @Test
    @DisplayName("Omar as author")
    void omarTest(){
        WhoLikesIt who = new Omar();
        assertEquals("no one likes this", who.likes());
        assertEquals("Peter likes this", who.likes("Peter"));
        assertEquals("Jacob and Alex like this", who.likes("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", who.likes("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", who.likes("Alex", "Jacob", "Mark", "Max"));
    }

}
