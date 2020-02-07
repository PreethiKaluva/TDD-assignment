package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class read {

    public int reader(String f) throws Exception {

        Path file = Paths.get(f);
        Scanner scanner = new Scanner(file);
        int x=scanner.nextInt();

        return x;
    }

}
