package edu.escuelaing.arsw.ASE.app;

import java.io.File;

/**
 * This is the class principal for run this app.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        if (args.length != 2) {
            System.out.println("Usage: java YourClassName <type_read> <path of file or files>");
            return;
        }
        String howRead = args[0];
        String path = args[1];
        Determinate.principal(path, howRead);


    }
}
