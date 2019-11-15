package com.example.homework3;

import com.example.model.cat;

import java.util.HashMap;
import java.util.List;

public class database {
    public static HashMap<Long, cat> catsList = new HashMap<>();

    public static cat getCatById(long id) {
        return catsList.get(id);
    }

    public static List<cat> getAllCats() {
        return (List) catsList.values();
    }

    public static void saveBooksTodatabase(List<cat> catsToSave) {
        for (int i = 0; i < catsToSave.size(); i++) {
            cat c = catsToSave.get(i);
            catsList.put(c.getId(), c);
        }
        System.out.println(catsList);
    }
}
