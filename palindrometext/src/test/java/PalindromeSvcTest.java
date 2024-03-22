import com.example.palindrome.PalindromeSvc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeSvcTest {
    PalindromeSvc palindromeSvc = new PalindromeSvc();
    @Test
    void palindrome_test()
    {
        assertTrue(palindromeSvc.isPalindrome(""));
    }
}
