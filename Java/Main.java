class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123",
        new Account("Andres Herrera","AND123"), "Chevrolet", "Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("JIO465", new Account("Tony S", "HJK456"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        /*Car car2 = new Car("AFQ523",new Account("Andrea Herrera","AHD123"));
        car2.printDataCar();*/
    }
}