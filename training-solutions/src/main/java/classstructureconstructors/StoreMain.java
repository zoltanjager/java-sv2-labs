package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("Tomato");

        store.store(5);
        store.store(5);
        System.out.println(store.getActualStock());
        store.dispatch(2);
        System.out.println(store.getActualStock());

        Store anotherStore = new Store("Banana");

        anotherStore.store(7);
        System.out.println(anotherStore.getActualStock());
        anotherStore.dispatch(3);
        System.out.println(anotherStore.getActualStock());


        System.out.println(store.storeNextGen(-1));

        System.out.println(store.dispatchNextGen(6));
        System.out.println(store.dispatchNextGen(6));


    }
}
