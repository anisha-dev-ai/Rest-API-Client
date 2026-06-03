import java.util.Scanner;

public class WeatherApiClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   WEATHER INFORMATION SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter City Name: ");
        String city = sc.nextLine();

        WeatherService service = new WeatherService();
        Weather weather = service.getWeather(city);

        if (weather != null) {

            System.out.println("\n=================================");
            System.out.println("        WEATHER REPORT");
            System.out.println("=================================");

            System.out.println("City         : " + weather.getCity());
            System.out.println("Temperature  : " + weather.getTemperature() + " °C");
            System.out.println("Humidity     : " + weather.getHumidity() + " %");
            System.out.println("Wind Speed   : " + weather.getWindSpeed() + " km/h");
            System.out.println("Pressure     : " + weather.getPressure() + " mb");
        }

        sc.close();
    }
}
