package edu.escuelaing.arsw.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Test for count the count with comments
     */
    public void testCountWithComments() {
        assertEquals(24, CountRows.withComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/App.java")));
        assertEquals(78, CountRows.withComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/CountRows.java")));
        assertEquals(42, CountRows.withComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/Determinate.java")));

    }
    /**
     * Test for count the count with comments
     */
    public void testCountWithOutComments() {
        assertEquals(16, CountRows.withoutComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/App.java")));
        assertEquals(56, CountRows.withoutComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/CountRows.java")));
        assertEquals(26, CountRows.withoutComments(new File("src/main/java/edu/escuelaing/arsw/ASE/app/Determinate.java")));
    }

}
