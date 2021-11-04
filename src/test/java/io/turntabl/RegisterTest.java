package io.turntabl;

import io.turntabl.enums.Levels;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RegisterTest extends TestCase {

    Register register = new Register();

    @Test
    public void testGetGoldClients() {
        assertTrue(Arrays.asList(
                new Corporate(1, "Jimmy Wo Ltd", Levels.GOLD, "Black Sam"),
                new Private(7, "Sandy Mini", Levels.GOLD)).size()==register.getGoldClients().size());

    }

    @Test
    public void testGetNameById() {
        System.out.println(register.getNameById(1));
        assertEquals("Jimmy Wo Ltd", register.getNameById(1));
    }
}