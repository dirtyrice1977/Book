package com.mike77.app;


import android.media.Image;
import android.widget.ImageView;

import java.util.Map;

/**
 * Created by mike on 2/10/14.
 */
public class Character {
    ImageView my_image;
    String my_name;
    Map<String, String> my_dialogue;

    public Character(){

    }

    public Character(ImageView the_image, String the_name){
        my_image = the_image;
        my_name = the_name;

    }

    public Character(ImageView the_image, String the_name, Map<String, String> the_dialogue){
        my_image = the_image;
        my_name = the_name;
        my_dialogue = the_dialogue;
    }

    public void addDialogue(String the_scene, String the_line)
    {
        my_dialogue.put(the_scene, the_line);
    }

    public String getDialogue(String the_scene)
    {
        return my_dialogue.get(the_scene);
    }
}
