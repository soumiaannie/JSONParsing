import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example3.json"));

            //write code here to print all the titles and the associated categories

            JSONArray entries = ((JSONArray)((JSONObject) ((JSONObject) ((JSONObject) obj).get("responseData")).get("feed")).get("entries"));
            System.out.println("There are " + entries.size() + " titles");

            for (int i=0; i< entries.size(); i++)
            {
                JSONObject jsonObject = (JSONObject) entries.get(i);
                System.out.println("Title " +jsonObject.get("title") + "  has categories " + jsonObject.get("categories"));
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