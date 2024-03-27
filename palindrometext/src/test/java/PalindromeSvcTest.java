import com.example.palindrome.PalindromeSvc;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeSvcTest {
    PalindromeSvc palindromeSvc = new PalindromeSvc();
    @Test
    void palindrome_test1()
    {
        assertTrue(palindromeSvc.isPalindrome(""));
    }

    @Test
    void palindrome_test2()
    {
        assertTrue(palindromeSvc.isPalindrome("noon"));
    }

    @Test
    void palindrome_test3()
    {
        assertFalse(palindromeSvc.isPalindrome("neon"));
    }

    @Test
    void palindrome_test4()
    {
        assertTrue(palindromeSvc.isPalindrome("radar"));
    }
}
