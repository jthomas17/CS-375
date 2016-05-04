package com.example.jarek.drinking;

/**
 * Created by Jarek on 1/21/2015.
 */
public class Person {
    int _weight;
    double _metabolism, _alcohol_distribution;
    String _name;
    public Person(String name, int weight, double metabolism, double alcohol_distribution){
        _name = name;
        _weight = weight;
        _metabolism = metabolism;
        //_alcohol = alcohol;
        _alcohol_distribution = alcohol_distribution;
    }
    public Person(String name, int weight){
        _name = name;
        _weight = weight;
    }
    public Person(){};
    public CharSequence getName(){
        return _name;
    }
    public int getWeight(){
        return _weight;
    }
    public double getMet(){
        return _metabolism;
    }
    public double getAlc(){
        return _alcohol_distribution;
    }

}
