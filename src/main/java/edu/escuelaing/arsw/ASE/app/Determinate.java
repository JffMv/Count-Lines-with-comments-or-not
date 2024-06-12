package edu.escuelaing.arsw.ASE.app;

import java.io.File;

public class Determinate {
    /**
     *  Identify if it is the file or directory and work base on it.
     * @param path
     * @param howRead how it read with or without comments
     * @return int for the row for each document
     */
    public static int principal(String path, String howRead){
        File pathFileOrDirectory = new File(path);
        howRead.toLowerCase();
        if (pathFileOrDirectory.isFile()) {
            return countEachFile(howRead,pathFileOrDirectory, path);
        } else if (pathFileOrDirectory.isDirectory()) {
            //System.out.println(path + " is a directory.");
            // Get a list of files and directories within the specified directory
            File[] files = pathFileOrDirectory.listFiles();
            // Iterate through the files and directories
            for (File file : files) {
                //System.out.println("esto es lo que soy con .toString en file: "+ file.toString());
                principal(file.toString(), howRead);
                //countEachFile(howRead,file, path+file.toString());
            }
        } else {
            System.out.println(path + " does not exist or is not accessible.");
        }
        return -777;
    }
    private static int countEachFile(String howRead,File pathFileOrDirectory, String path ){
        String withCommets = "phy";
        String withoutComentaries = "loc";
        int numberRows = howRead.equals(withCommets) ? CountRows.withComments(pathFileOrDirectory) : CountRows.withoutComments(pathFileOrDirectory);
        System.out.println(path + " is a file and your number of rows is: "+ numberRows);
        return numberRows;
    }
}
