import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example3.json"));

            //write code here to print all the titles and the associated categories


            ArrayList<Map<String, ?>> entries1 = (ArrayList<Map<String, ?>>) (((JSONObject) ((JSONObject) ((JSONObject) obj)
                    .get("responseData"))
                    .get("feed"))
                    .get("entries"));


            for (int i=0; i< entries1.size(); i++)
            {
                Map<String, ?> item = (Map<String, ?>) entries1.get(i);
                System.out.println("Title " +item.get("title") + "  has categories " + item.get("categories"));
            }



            /*JSONArray entries = ((JSONArray)((JSONObject) ((JSONObject) ((JSONObject) obj)
                    .get("responseData"))
                    .get("feed"))
                    .get("entries"));*/


           /* System.out.println("There are " + entries.size() + " titles");

            for (int i=0; i< entries.size(); i++)
            {
                JSONObject jsonObject = (JSONObject) entries.get(i);
                System.out.println("Title " +jsonObject.get("title") + "  has categories " + jsonObject.get("categories"));
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}