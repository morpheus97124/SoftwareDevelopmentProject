package com.example.rpgminigame;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class JSONHandler {
    /**
     *
     * @param path - Path to a specific json file.
     * @throws IOException
     * @throws ParseException
     * @return jsonObject - A JSONObject object containing the data from the file.
     */
    public static JSONObject ReadFromJSON(String path) throws IOException, ParseException, BadFileSuffix {
        if(!path.endsWith(".json")){
            throw new BadFileSuffix("Filename needs to have an appropriate suffix");
        }
        InputStream is = JSONHandler.class.getResourceAsStream(path);
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = new JSONObject();
        jsonObject = (JSONObject) (jsonParser.parse(isr));
        return jsonObject;
    }



}
