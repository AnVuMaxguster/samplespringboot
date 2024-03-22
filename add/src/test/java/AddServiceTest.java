import com.example.add.AddService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddServiceTest {

    AddService addService = new AddService();

    @Test
    void singleValueTest(){
        assertEquals(4, addService.result(2, 2));
    }
//    ////    ---------------------------------------------------------------------------------------
//    @ParameterizedTest
//    @ValueSource(ints = {1,2,3,4})
//    void multipleValueTest(int a){
//        assertEquals(a, addService.result(1, 2));
//    }
//
//    @ParameterizedTest
//    @ValueSource(strings = { "cali", "bali", "dani" })
//    void endsWithI(String str) {
//        assertTrue(str.endsWith("i"));
//    }
//    ////    ---------------------------------------------------------------------------------------
//
//    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
//    @DisplayName("RepeatingTest")
//    void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) {
//        int i = 3;
//        System.out.println(testInfo.getDisplayName() +
//                "-->" + repInfo.getCurrentRepetition()
//        );
//        assertEquals(repInfo.getCurrentRepetition(), i);
//    }
//    ////    ---------------------------------------------------------------------------------------
//    @Test
//    @DisplayName("Custom test name")
//    void testWithDisplayName() {
//    }
//
//    @Test
//    @DisplayName("Print test name")
//    void printDisplayName(TestInfo testInfo) {
//        System.out.println(testInfo.getDisplayName());
//    }
//    ////    ---------------------------------------------------------------------------------------
//    @BeforeEach
//    void init(TestInfo testInfo) {
//        String callingTest = testInfo.getTestMethod().get().getName();
//        System.out.println(callingTest);
//    }
//
//    @Test
//    void firstTest() {
//        System.out.println(1);
//    }
//
//    @Test
//    void secondTest() {
//        System.out.println(2);
//    }
//    ////    ---------------------------------------------------------------------------------------
//    @AfterEach
//    void after(TestInfo testInfo) {
//        String callingTest = testInfo.getTestMethod().get().getName();
//        System.out.println(callingTest);
//    }
//    @Test
//    void firstTest() {
//        System.out.println(1);
//    }
//    @Test
//    void secondTest() {
//        System.out.println(2);
//    }
    //    ////    ---------------------------------------------------------------------------------------
//    @BeforeAll
//    static void runonce() {
//        System.out.println("only run once before all test");
//    }
    //    ////    ---------------------------------------------------------------------------------------
//    @AfterAll
//    static void after() {
//        System.out.println("Only run once after all tests");
//    }
    //    ////    ---------------------------------------------------------------------------------------

}
