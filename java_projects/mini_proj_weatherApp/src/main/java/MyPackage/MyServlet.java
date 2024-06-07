package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
//    https://api.openweathermap.org/data/2.5/weather?q={new delhi}&appid={abffb26a99840c6cd40062f5949afa92}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cityname = request.getParameter("city");
		
		String apikey = "a1960e3945912611710be13cbfcb16a9";
		String apiurl = "http://api.openweathermap.org/geo/1.0/direct?q="+cityname+"&limit=1&appid="+apikey;
		URL url = new URL(apiurl);
		
//		System.out.println(apiurl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		
		InputStream inputStream = connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
       // System.out.println(reader);
        
        Scanner scanner = new Scanner(reader);
        StringBuilder responseContent = new StringBuilder();

        while (scanner.hasNext()) {
            responseContent.append(scanner.nextLine());
        }
        
//        System.out.println(responseContent);
        scanner.close();
//        System.out.println(responseContent.toString());	
        // Parse the JSON response to extract temperature, date, and humidity
        Gson gson = new Gson();
//        List<String> currentGroupIdsList = new ArrayList<String>(Arrays.asList(responseContent.toString().split(",")));
        JsonArray jsonArray = gson.fromJson(responseContent.toString(), JsonArray.class);
//        JsonObject jsonObject = gson.fromJson(responseContent.toString(), JsonObject.class);
        try {
        JsonElement jsonele = jsonArray.get(0);
        JsonObject jsonObject = jsonele.getAsJsonObject();

        
       
        	float lat =jsonObject.get("lat").getAsFloat();
            float lon =jsonObject.get("lon").getAsFloat();
        
//        System.out.println(jsonObject);

        
//        		System.out.println(lat+" "+lon);
        		
//        		//now actuall api
        		String apiurl2 = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+apikey;
        		URL url2 = new URL(apiurl2);
//        		System.out.println(apiurl2);
        		HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
        		connection2.setRequestMethod("GET");
        		
        		InputStream inputStream2 = connection2.getInputStream();
                InputStreamReader reader2 = new InputStreamReader(inputStream2);
               // System.out.println(reader);
                
                Scanner scanner2 = new Scanner(reader2);
                StringBuilder responseContent2 = new StringBuilder();

                while (scanner2.hasNext()) {
                    responseContent2.append(scanner2.nextLine());
                }
                
               // System.out.println(responseContent);
                scanner2.close();
                System.out.println("Secnod call");
                Gson gson2 = new Gson();
                JsonObject jsonObject2 = gson2.fromJson(responseContent2.toString(),JsonObject.class);
//                System.out.println(jsonObject2);

                //Date & Time
                long dateTimestamp = jsonObject2.get("dt").getAsLong() * 1000;
                String date = new Date(dateTimestamp).toString();
//                System.out.println(date);

                
                //Temperature
                double temperatureKelvin = jsonObject2.get("main").getAsJsonObject().get("temp").getAsDouble();
                int temperatureCelsius = (int) (temperatureKelvin - 273.15);
//                System.out.println(temperatureCelsius);

                //Humidity
                int humidity = jsonObject2.getAsJsonObject("main").get("humidity").getAsInt();
                System.out.println(humidity);

                //Wind Speed
                double windSpeed = jsonObject2.getAsJsonObject("wind").get("speed").getAsDouble()	;
//                System.out.println(windSpeed);

                //Weather Condition
                String weatherCondition = jsonObject2.get("weather").getAsJsonArray().get(0).getAsJsonObject().get("main").getAsString();
//                System.out.println("watherCondition : "+weatherCondition);
                // Set the data as request attributes (for sending to the jsp page)
                request.setAttribute("date", date);
                request.setAttribute("city", cityname);
                request.setAttribute("temperature", temperatureCelsius);
                request.setAttribute("weatherCondition", weatherCondition); 
                request.setAttribute("humidity", humidity);    
                request.setAttribute("windSpeed", windSpeed);
                request.setAttribute("weatherData", responseContent.toString());
                connection.disconnect();
                
                request.getRequestDispatcher("index.jsp").forward(request,response);
	} catch(IndexOutOfBoundsException e){
//      request.setAttribute("error", date);
  	response.sendRedirect("error.html"); 

  }}

}
