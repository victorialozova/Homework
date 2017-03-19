package CopyFiles;

import java.io.File;

import static CopyFiles.CopyFiles.copyFile;

/**
 * Написать программу для копирования всех файлов из одного каталога в другой
 */

public class copyDir {
    public static void copyDir(String srcDir, String destDir) throws Exception {
        File sdr = new File(srcDir);
        File ddr = new File(destDir);
        if (!ddr.isDirectory()) {
            ddr.mkdir();
        }
        if (sdr.isDirectory()) {
            File[] srcFile = sdr.listFiles();
            File[] destFile = new File[srcFile.length];
            for (int i = 0; i < srcFile.length; i++) {
                String srcF = srcFile[i].getPath();
                String destF = srcF.replace(srcDir, destDir);
                destFile[i] = new File(destF);
                copyFile(srcFile[i], destFile[i]);
            }
        } else {
            System.out.println("There is no such directory " + srcDir);
        }
    }
}
