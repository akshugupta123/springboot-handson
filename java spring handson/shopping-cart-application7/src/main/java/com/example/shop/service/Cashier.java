package com.example.shop.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import com.example.shop.pojo.ShoppingCart;

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

    public void openFile() {
        File targetDir = new File(path);
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        File checkoutFile = new File(path, fileName);
        try {
            writer = new BufferedWriter(new FileWriter(checkoutFile, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkout(ShoppingCart cart) {
        try {
            writer.write(new Date() + " " + cart.getItems() + "\r\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
