package activity;

final class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (isValidLatitude(latitude) && isValidLongitude(longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    private boolean isValidLongitude(double longitude) {
        if (longitude >= -180 && longitude <= 180) {
            return true;
        }
        throw new IllegalArgumentException("Wrong data");
    }

    private boolean isValidLatitude(double latitude) {
        if (latitude >= -90 && latitude <= 90) {
            return true;
        }
        throw new IllegalArgumentException("Wrong data");
    }


    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
