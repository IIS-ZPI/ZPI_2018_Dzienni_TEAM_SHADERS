package com.example.gucio.salestaxapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> state = new ArrayList<String>();
        state.add("Alabama");
        state.add("Georgia");
        state.add("Indiana");
        state.add("Louisiana");
        state.add("Nebraska");


        expandableListDetail.put("state TEAMS", state);
        return expandableListDetail;
    }
}
