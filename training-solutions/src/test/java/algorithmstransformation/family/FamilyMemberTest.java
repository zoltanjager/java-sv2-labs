package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void createFamilyMember() {
        FamilyMember familyMember = new FamilyMember("Kis Géza", 34);

        assertEquals("Kis Géza", familyMember.getName());
        assertEquals(34, familyMember.getAge());
    }
}