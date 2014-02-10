package com.mike77.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mike on 2/7/14.
 */
public class FootFragment extends Fragment implements View.OnClickListener{
    Character my_carlos;
    Character my_reader;
    ImageView carlos_head;
    ImageView reader_head;
    public FootFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View footer_view = inflater.inflate(R.layout.fragment_footer,container,false);

        Map<String,String> carlos_dialogue = new HashMap<String, String>();
        carlos_dialogue.put("intro_0", "blah blah blah blah intro 0");
        carlos_dialogue.put("intro_1","blah blah blah blah intro 1");
        carlos_dialogue.put("intro_2","blah blah blah blah intro 2");
        carlos_dialogue.put("intro_3","blah blah blah blah intro 3");

        Map<String,String> reader_dialogue = new HashMap<String, String>();
        reader_dialogue.put("intro_0","blap blap blap blap intro 0");
        reader_dialogue.put("intro_0","blap blap blap blap intro 1");
        reader_dialogue.put("intro_0","blap blap blap blap intro 2");
        reader_dialogue.put("intro_0","blap blap blap blap intro 3");

        carlos_head = (ImageView)footer_view.findViewById(R.drawable.head);
        reader_head = (ImageView)footer_view.findViewById(R.drawable.head);

        my_carlos = new Character(carlos_head,"Carlos",carlos_dialogue);
        my_reader = new Character(reader_head,"Reader",reader_dialogue);

        //use layout id -- android cant find fragment from id
        return footer_view;
    }

    @Override
    public void onClick(View view) {
        
    }
}
