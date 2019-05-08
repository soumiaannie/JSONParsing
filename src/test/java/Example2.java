import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Example2 {
        public static void main(String[] args) {

            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(new FileReader("example2.json"));

                //write code here to print all the cars for each person

                JSONArray jsonArray = (JSONArray) obj;

                for (int i =0; i < jsonArray.size(); i++)
                {
                    JSONObject jsonObject = (JSONObject) (jsonArray.get(i));
                    System.out.println(jsonObject.get("name") + " has" + " " + jsonObject.get("cars"));

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

