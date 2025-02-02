package com.example.SpringBoot.api;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class whetherResponse {
	public Current current;
	public Location location;
	public Request request;
	public Root root;
}
@Getter
@Setter
class Current{
    public String observation_time;
    public int temperature;
    public int weather_code;
    public ArrayList<String> weather_icons;
    public ArrayList<String> weather_descriptions;
    public int wind_speed;
    public int wind_degree;
    public String wind_dir;
    public int pressure;
    public int precip;
    public int humidity;
    public int cloudcover;
    public int feelslike;
    public int uv_index;
    public int visibility;
    public String is_day;
}
@Getter
@Setter
class Location{
    public String name;
    public String country;
    public String region;
    public String lat;
    public String lon;
    public String timezone_id;
    public String localtime;
    public int localtime_epoch;
    public String utc_offset;
}
@Getter
@Setter
class Request{
    public String type;
    public String query;
    public String language;
    public String unit;
}
@Getter
@Setter
class Root{
    public Request request;
    public Location location;
    public Current current;
}

