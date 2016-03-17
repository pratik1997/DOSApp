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
public class CopyCommand extends DosCommand{

    @Override
    public void execute(String[] params) {
       if(params.length>2){
           try{
           FileReader reader=new FileReader(new File(params[1]));
           FileWriter writer=new FileWriter(new File(params[2]));
           int i=0;
           while((i=reader.read())!=-1){
               writer.write((char)i);
           }
             writer.close();
             reader.close(); 
           
       }catch(IOException ioe){
               System.out.println(ioe.getMessage());
           
       }
       }
    }
    
}



