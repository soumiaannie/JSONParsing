


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Example1 {
        public static void main(String[] args) {

            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(new FileReader("example1.json"));

                JSONObject jsonObject =  (JSONObject) obj;

                //write code here to parse the json

                //print all the platforms

                JSONArray platforms = (JSONArray) jsonObject.get("platforms");

                System.out.println("There are " + platforms.size() + "platforms");
                for (int i=0; i<platforms.size(); i++)
                {
                    System.out.println(((JSONObject) platforms.get(i)).get("id")+ " " + ((JSONObject) platforms.get(i)).get("name"));
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (org.json.simple.parser.ParseException e) {
                e.printStackTrace();
            }
        }
    }

