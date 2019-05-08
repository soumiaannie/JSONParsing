import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example4.json"));

            //write code here to print all the type of phone no and the corresponding no

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray phoneNumber = (JSONArray) jsonObject.get("phoneNumber");
            System.out.println(jsonObject.get("firstName") + " " + jsonObject.get("lastName")+" has " + phoneNumber.size() + " phoneNumbers.");

            for (int i=0; i< phoneNumber.size(); i++) {
                System.out.println(((JSONObject) phoneNumber.get(i)).get("type") +" " + ((JSONObject) phoneNumber.get(i)).get("number"));
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