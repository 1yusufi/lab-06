package com.example.code;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * A new City object provided with a city name and province name
     * @param city      a String of city name
     * @param province  a String of province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return String city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the province name
     * @return String province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Overriding compareTo() so that is orders cities by their city name alphabetically
     * @param o     an other object that we are comparing with
     * @return Negative if this.city is before o alphabetically
     *         Positive if this.city is after o alphabetically
     *         Zero if both are equal
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Overriding equals() so that it defines how two City objects are equal
     * @param o     an other object that we are comparing with
     * @return a boolean value whether the two city objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }

    /**
     * Create a valid hashcode that makes comparison easy
     * @return a valid hashcode
     */
    @Override
    public int hashCode() {
        return 31 * city.hashCode() + province.hashCode();
    }
}