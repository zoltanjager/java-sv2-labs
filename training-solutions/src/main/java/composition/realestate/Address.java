package composition.realestate;

    public class Address {
        private String city;
        private String street;
        private int houseNumber;
        private String zipCode;

        public Address(String city, String street, int houseNumber, String zipCode) {
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
            this.zipCode = zipCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    ", zipCode='" + zipCode + '\'' +
                    '}';
        }
    }
