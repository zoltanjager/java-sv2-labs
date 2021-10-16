package classstructureconstructors;

public class Store {

    private String product;
    private int stock;

    public Store (String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store (int stock) {
        this.stock += stock;
    }

    public String storeNextGen (int stock) {
        if (stock < 0) {
            return "Wrong amount!";
        }
        else {
            this.stock += stock;
            return "This item has been stored";
        }
    }

    public String dispatchNextGen (int stock) {
        if (this.stock - stock < 0 ) {
            return "This dispatch is not possible! Max amount: " + this.stock ;
        }
        else {
            this.stock -= stock;
            return "Dispatch is done. Current stock: " + this.stock;
        }
    }


    public void dispatch (int stock) {
        this.stock -= stock;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public String getActualStock() {
        return ("Item: " + this.getProduct() + " - Amount: " + this.getStock());
    }

}
