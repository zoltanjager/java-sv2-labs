package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    private List<DnsEntry> dnsEntries = new ArrayList<>();


    public void addEntry(String hostName, String hostIP) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.getHostName().equals(hostName) || actual.getHostIP().equals(hostIP)) {
                throw new IllegalArgumentException("Already exists");
            }
        }
        dnsEntries.add(new DnsEntry(hostName, hostIP));
    }

    public void removeEntryByName(String hostName) {
        DnsEntry removeEntry = null;
        for (DnsEntry actual : dnsEntries) {
            if (actual.getHostName().equals(hostName)) {
                removeEntry = actual;
            }
        }
        dnsEntries.remove(removeEntry);
    }

    public void removeEntryByIp(String hostIP) {
        DnsEntry removeEntry = null;
        for (DnsEntry actual : dnsEntries) {
            if (actual.getHostIP().equals(hostIP)) {
                removeEntry = actual;
            }
        }
        dnsEntries.remove(removeEntry);
    }

    public String getIpByName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.getHostName().equals(hostName)) {
                return actual.getHostIP();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String hostIP) {
        for (DnsEntry actual : dnsEntries) {
            if (actual.getHostIP().equals(hostIP)) {
                return actual.getHostName();
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private class DnsEntry {
        private String hostName;
        private String hostIP;

        public DnsEntry(String hostName, String hostIP) {
            this.hostName = hostName;
            this.hostIP = hostIP;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIP() {
            return hostIP;
        }
    }
}
