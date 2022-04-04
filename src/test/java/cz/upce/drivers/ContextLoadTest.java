package cz.upce.drivers;

import cz.upce.drivers.controller.RidicController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ContextLoadTest {

    @Autowired
    private RidicController ridicController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(ridicController).isNotNull();
    }
}
