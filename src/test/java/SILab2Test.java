import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {
    private List<String> createList(String elements){
        return new ArrayList<>(Arrays.asList(elements));
    }

    @Test
    void everyStatementTest(){
        List<String> list = new ArrayList<>();
        list.add("#");
        list.add("2");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("1");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("#");

        List<String> firstList = new ArrayList<>();
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");


        assertEquals(list, SILab2.function(firstList));
        List<String> secondList = new ArrayList<>();
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(secondList));
        List<String> thirdList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(thirdList));
    }

    @Test
    void everyBranchTest(){
        List<String> list = new ArrayList<>();
        list.add("#");
        list.add("2");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("1");
        list.add("0");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("#");


        List<String> firstList = new ArrayList<>();
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");
        firstList.add("0");
        firstList.add("0");
        firstList.add("0");
        firstList.add("0");
        firstList.add("#");
        firstList.add("#");
        firstList.add("#");

        assertEquals(list, SILab2.function(firstList));
        List<String> secondList = new ArrayList<>();
        list.add("0");
        list.add("0");
        list.add("0");
        list.add("#");
        list.add("0");
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(secondList));
        List<String> thirdList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(thirdList));
    }
}