package com;

import sun.security.krb5.internal.crypto.Des;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        if(Desktop.isDesktopSupported()){
            Desktop desktop=Desktop.getDesktop();
            for(Desktop.Action a :Desktop.Action.values()){
                System.out.println(a);
            }
//            if(desktop.isSupported(Desktop.Action.OPEN)){
//                desktop.open(new File("pikachu.png"));
//            }
            if(desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(new URI("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuWylHDNKS9r7W2gV6lkcz2Vg80OTZg38syEIqIC9Oy4T7EaeUKA"));
            }
        }
    }
}
