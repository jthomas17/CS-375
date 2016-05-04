package com.example.jarek.drinking;

import android.app.Activity;
import android.content.Context;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarek on 1/22/2015.
 */
public class io {

    //popstring save then load
    public List<Person> list = new <Person>ArrayList();
    public List<String> Name = new ArrayList<String>();
    String s = "";
    int data=0;

    public void save(Activity a) {
    String filename = "users.txt";
    FileOutputStream fos;
    try

    {
        fos = a.openFileOutput(filename, Context.MODE_PRIVATE);
        fos.write(s.getBytes());
        fos.close();
        System.out.println(s);
    }

    catch(
    Exception e
    )

    {
        e.printStackTrace();
    }list.clear();Name.clear();
}
    public void load(Activity a){
        String filename = "users.txt";
    try {

        FileInputStream fis = a.openFileInput(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
        System.out.println("Reading File line by line using BufferedReader");
            data = Integer.parseInt(reader.readLine());
        for(int i = 0; i<data;i++) {

            int weight = Integer.parseInt(reader.readLine());
            double metabolism = Double.parseDouble(reader.readLine());
            double alcdist =  Double.parseDouble(reader.readLine());
            String name = reader.readLine();
            Person p = new Person();
            p._alcohol_distribution = alcdist;
            p._metabolism = metabolism;
            p._name = name;
            p._weight = weight;
            list.add(p);
            Name.add(name);
            System.out.println("added");
        }
    }

    catch(Exception e){}
    }
    public void popstring(){
        s=data+"\n";
        for (int i = 0; i<data;i++){
            int weight = list.get(i)._weight;
            double metabolism = list.get(i)._metabolism;
            String name = (String) list.get(i)._name;
            double alcdist = list.get(i)._alcohol_distribution;
            s+=weight+"\n"+metabolism+"\n"+alcdist+"\n"+name+"\n";
        }


    }
    //do adduser then popstring then save then load
    public void adduser(Person p){

        Name.add(p._name);
        list.add(p);
        data+=1;

    }
    public void cleardata(Activity a){
        String filename = "users.txt";
        String s = "";
        FileOutputStream fos;
        try

        {
            fos = a.openFileOutput(filename, Context.MODE_PRIVATE);
            fos.write(s.getBytes());
            fos.close();
            System.out.println(s);
        }

        catch(
                Exception e
                )

        {
            e.printStackTrace();
        }list.clear();Name.clear();
    }
}
