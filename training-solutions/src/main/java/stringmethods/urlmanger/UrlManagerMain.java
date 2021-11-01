package stringmethods.urlmanger;

public class UrlManagerMain {
    public static void main(String[] args) {
        UrlManager urlManager = new UrlManager("https://earthquake.usgs.gov:443/fdsnws/event/1/" +
                "query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.hasProperty("format"));
        System.out.println(urlManager.hasProperty("format2"));
        System.out.println(urlManager.getProperty("format"));
        System.out.println(urlManager.getProperty("starttime"));

    }
}
