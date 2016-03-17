/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosapp.command;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Prakriti
 */
public class Rename extends DosCommand {

    @Override
    public void execute(String[] params) {
        if(params.length>2){
        File file=new File(params[1]);
        file.renameTo(new File(params[2]));
       }
        
    }
    
    
}
