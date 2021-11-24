package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test

    void createTrainer() {
        Trainer trainer = new Trainer("John Doe", 34);

        assertEquals("John Doe", trainer.getName());
        assertEquals(34, trainer.getAge());

    }

}