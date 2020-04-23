public class Shop {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        //price1 = cena zakupów w koszyku
        double price1 = 3100;

        Discount discount1 = new Discount();
        //sprawdzamy cenę dla klienta
        double discountPrice1 = discount1.checkDiscount(client1, price1);

        ClientInfo clientInfo1 = new ClientInfo();
        clientInfo1.printClientSummary(client1, price1, discountPrice1);

    }
}
