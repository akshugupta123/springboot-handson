package com.example.shop.pojo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Cashier {
    private String fileName;
    private String path;
    private BufferedWriter writer;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    // Method to open the file
    public void openFile() {
        File targetDir = new File(path);
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }
        File checkoutFile = new File(path, fileName);
        try {
            if (!checkoutFile.exists()) {
                checkoutFile.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(checkoutFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to write checkout information to the file
    public void checkout(ShoppingCart cart) throws IOException {
        writer.write(new Date() + " - Items: " + cart.getItems() + "\n");
        writer.flush();
    }

    // Method to close the file
    public void closeFile() throws IOException {
        writer.close();
    }
}
