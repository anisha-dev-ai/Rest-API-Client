import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherService {

    public Weather getWeather(String city) {

        try {

            String apiUrl =
                    "https://wttr.in/" + city + "?format=j1";

            URL url = java.net.URI.create(apiUrl).toURL();

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    connection.getInputStream()));

            StringBuilder response =
                    new StringBuilder();

            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            JSONObject json =
                    new JSONObject(response.toString());

            JSONArray currentCondition =
                    json.getJSONArray("current_condition");

            JSONObject current =
                    currentCondition.getJSONObject(0);

            String temperature =
                    current.getString("temp_C");

            String humidity =
                    current.getString("humidity");

            String windSpeed =
                    current.getString("windspeedKmph");

            String pressure =
                    current.getString("pressure");

            return new Weather(
                    city,
                    temperature,
                    humidity,
                    windSpeed,
                    pressure
            );

        } catch (Exception e) {

            System.out.println(
                    "Error fetching weather data: "
                            + e.getMessage());

            return null;
        }
    }
}
