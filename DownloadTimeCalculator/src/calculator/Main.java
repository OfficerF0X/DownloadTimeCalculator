package calculator;

/*
    @author: Vasilije Pecanin (Vasilije)
    Package: DownloadTimeCalculator
    Date: 26.10.2022
*/

import java.util.Scanner;

public class Main {
    /**
     * This function takes a megabyte and convert it to megabits.
     *
     * @param megabyte The amount of megabytes you want to convert.
     * @return The number of megabits.
     */
    static int convertMegaByte(int megabyte) {
        return megabyte * 8;
    }

    /**
     * It takes two integers as parameters, converts the first one to megabits, and returns the download time.
     *
     * @param fileSize      The size of the file in MB
     * @param downloadSpeed The download speed of the user in MB/s
     * @return The time it takes to download a file.
     */
    static int calculation(int fileSize, int downloadSpeed) {
        fileSize = convertMegaByte(fileSize);
        return fileSize / downloadSpeed;
    }

    /**
     * The function takes two arguments, the file size in MB and the download speed in Mbps, and returns the time it takes
     * to download the file in seconds, minutes, hours and days.
     */
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Input the File Size [MB]: ");
        int fileSize = scanObj.nextInt();

        System.out.print("Input the Download Speed [Mbps]: ");
        int downloadSize = scanObj.nextInt();

        System.out.println("----------------------------------------------------");

        System.out.println(calculation(fileSize, downloadSize) + " seconds\n");
        System.out.println(calculation(fileSize, downloadSize) / 60 + " minutes\n");
        System.out.println(calculation(fileSize, downloadSize) / 3600 + " hours\n");
        System.out.println(calculation(fileSize, downloadSize) / 86400 + " days");
    }
}
