/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosapp.command;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Prakriti
 */
public class DirCommand extends DosCommand {

    @Override
    public void execute(String[] params) {
        File file=null;
        if(params.length==1){
            file=new File(".");
        }else{
            file=new File(params[1]);
        }
        for (File f : file.listFiles()) {
            Date date = new Date(f.lastModified());

            System.out.print(date.toString());
            System.out.print((f.isDirectory()) ? "\t<DIR>" : "\t");
            System.out.print("\t" + (!(f.isDirectory()) ? f.length() : ""));

            System.out.print("\t" + f.getName());
            System.out.println(" ");
        }
    }

}
