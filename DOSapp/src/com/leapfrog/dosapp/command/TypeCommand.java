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
public class TypeCommand extends DosCommand {

    @Override
    public void execute(String[] params) {
        if(params.length>1d){
           try{
           FileReader reader=new FileReader(new File(params[1]));
          
           int i=0;
           while((i=reader.read())!=-1){
               System.out.print((char)i);
           }
             
             reader.close(); 
           
       }catch(IOException ioe){
               System.out.println(ioe.getMessage());
           
       }
       }
       
    }
    
    
    
}
