package test;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ModulithTest {

    @Test
    public void test() {
        ApplicationModules.of(ErrorReproApplication.class).verify();
    }

}
