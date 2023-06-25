/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;



/**
 * Clase HashTable
 * @author andres
 */
public class HashTable{
    private int size;
    private String[] keys;
    private String[] values ;

    // Constructor de las clase
    public HashTable(int size) {
        this.size = size;
        this.keys = new String[size];
        this.values = new String [size];
    }
    // metodo para obtener el valor de la llave
    public String get(String key){
        int hash = hash(key);
        while(keys[hash]!=null){
            if(keys[hash].equals(key)){
                return values[hash];
            }
            hash = (hash+1)%size;
        }
        return "-1";
    }
    
    // Metodo para ingresar valores al hashTable
    
    public void put(String key,String value){
        int hash = hash(key);
        while (keys[hash]!=null && !keys[hash].equals(keys)){
            hash = (hash + 1) % size;
        }
        keys[hash] = key;
        values[hash]=value;
    }
    
    // Metodo para obtener los indice de los valores
    
    private int hash (String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31*hash+ key.charAt(i))%size;
            
        }
        return hash;
    }
    
    
    
    
}
    
    
            
    