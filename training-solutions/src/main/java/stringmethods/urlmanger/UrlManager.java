package stringmethods.urlmanger;

import java.util.Locale;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolUrl(url);
        this.port = getPortUrl(url);
        this.host = getHostUrl(url);
        this.path = getPathUrl(url);
        this.query = getQueryUrl(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    private String getProtocolUrl(String url) {
        url = url.trim();
        return url.substring(0,url.indexOf(':')).toLowerCase();
    }

    private String removeProtocolAndDoubleSlash(String url){
        url = url.trim();
        url = url.replace(getProtocolUrl(url),"");
        url = url.replace("://", "");
        return url;
    }

    private String getHostUrl(String url) {
        url = removeProtocolAndDoubleSlash(url);
        int singleSlash = url.indexOf('/');
        int indexOfColon = url.indexOf(':');
        if (indexOfColon > -1) {
            return url.substring(0, indexOfColon).toLowerCase();
        } else {
            return url.substring(0, singleSlash).toLowerCase();
        }
    }

    private Integer getPortUrl(String url) {
        url = removeProtocolAndDoubleSlash(url);
        int singleSlash = url.indexOf('/');
        int indexOfColon = url.indexOf(':');
        if (indexOfColon > -1) {
            return Integer.parseInt(url.substring(indexOfColon+1, singleSlash));
        } else {
            return null;
        }
    }

    private String getPathUrl(String url) {
        url = removeProtocolAndDoubleSlash(url);
        int singleSlash = url.indexOf('/');
        int startQuery = url.indexOf('?');
        if ( startQuery > -1 ) {
            return url.substring(singleSlash + 1, startQuery);
        } else {
            return url.substring(singleSlash + 1);
        }
    }

    private String getQueryUrl(String url) {
        url = url.trim();
        int startOfQuery = url.indexOf('?');
        if (startOfQuery > -1) {
            return url.substring(startOfQuery +1);
        } else {
            return null;
        }
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }

    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (int i = 0; i < properties.length; i++) {
            String[] property = properties[i].split("=");
            if (property[0].equals(key)) {
                return property[1];
            }
        }
        return null;
    }

}
