/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dosapp;

import com.leapfrog.dosapp.command.DirCommand;
import com.leapfrog.dosapp.command.DosCommand;
import com.leapfrog.dosapp.command.DosCommandFactory;
import com.leapfrog.dosapp.command.MDCommand;
import com.leapfrog.dosapp.command.RDCommand;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Prakriti
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File(".");
        Scanner input = new Scanner(System.in);
        String param = "";
        System.out.print(file.getAbsolutePath() + ">");
        while (!(param = input.nextLine()).equalsIgnoreCase("exit")) {
            String[] cmds = param.split(" ");

           DosCommand command=DosCommandFactory.get(cmds[0]);
           if (command!=null){
               command.execute(cmds);
           }else{
               System.out.println("Invalid command!");
           }

            System.out.print(file.getAbsolutePath() + ">");

        }
    }

}
