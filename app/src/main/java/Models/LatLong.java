package Models;

public class LatLong {


    double lat;
    double lng;
    public LatLong(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }


    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "LatLong{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
