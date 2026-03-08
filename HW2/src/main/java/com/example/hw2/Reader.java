package com.example.hw2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class Reader {
    
    private ArrayList<Dancer> ListDancers;
    
    public ArrayList<Dancer> read(){
        try{
        Yaml ym = new Yaml();
        FileInputStream stream = new FileInputStream("dancers.yaml");
        
        Map<String, List<Map<String, String>>> data = ym.load(stream);
        stream.close();
        
        List<Map<String, String>> dancers = data.get("Dancers");    
        
        ListDancers = new ArrayList<>();
        
        for(Map<String, String> dancer : dancers){
            String name = dancer.get("name");
            String style = dancer.get("style");
            ListDancers.add(new Dancer(name, style));
        }
        
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex) {
            System.getLogger(Reader.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        return ListDancers;
    }    
}
