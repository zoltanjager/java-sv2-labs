package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void init() {

        family = new Family();
        family.addFamilyMember(new FamilyMember("Kis Géza", 26));
        family.addFamilyMember(new FamilyMember("Kis Béla", 22));
        family.addFamilyMember(new FamilyMember("Kis Kata", 21));
        family.addFamilyMember(new FamilyMember("Tóth Géza", 32));
        family.addFamilyMember(new FamilyMember("Nagy Géza", 34));
        family.addFamilyMember(new FamilyMember("Kiss Kata", 35));
        family.addFamilyMember(new FamilyMember("Tóth Géza", 36));
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        List<Integer> expected = family.getAgesOfFamilyMembersWithNameGiven("Géza");

        assertEquals(4, expected.size());
        assertTrue(expected.contains(32));
        assertFalse(expected.contains(35));
    }
}