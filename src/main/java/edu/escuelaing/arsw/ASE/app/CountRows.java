package edu.escuelaing.arsw.ASE.app;

import java.io.*;

/**
 * This class give methods statics for use the count rows.
 */
public class CountRows {
    /**
     *
     * @param file
     * @return int the number the rows for one document with comments
     */
    public static int withComments(File file){
        return countLines(file);
    }

    /**
     *
     * @param file
     * @return int the numbers the rows for one document without comments
     */
    public static  int withoutComments(File file)  {
        File tempFile = new File("temp.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String currentLine;
            boolean inBlockComment = false;
            int countRows = 0;
            while ((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                // Skip empty lines
                if (trimmedLine.isEmpty()) {
                    continue;
                }
                // Check if the line starts a multi-line comment
                if (trimmedLine.startsWith("/*")) {
                    inBlockComment = true;
                }
                // If in a multi-line comment, check if it ends
                if (inBlockComment) {
                    if (trimmedLine.endsWith("*/")) {
                        inBlockComment = false;
                    }
                    continue;
                }
                // Skip single-line comments
                if (trimmedLine.startsWith("//")) {
                    continue;
                }
                // Write non-comment lines to the temporary file
                writer.write(currentLine + System.getProperty("line.separator"));
                countRows++;
            }
            writer.close();
            reader.close();
            tempFile.delete();
            return countRows;

        }catch (IOException  e){
            e.printStackTrace();
            return -999;
        }
    }
    private static int countLines(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int numRows = 0;
            while (reader.readLine() != null) {
                numRows++;
            }
            return numRows;
        } catch (IOException e) {
            e.printStackTrace();
            return -999;
        }
    }
}
