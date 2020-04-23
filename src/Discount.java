class Discount {
    public double checkDiscount(Client client, double price){
        if(client.isPremium())
            //zniżka dla klienta premium
            return calculatePremiumDiscount(price);
        else
            //zwykła zniżka
            return calculateStandardDiscount(price);
    }

    private double calculatePremiumDiscount(double price){
        if(price > 1000)
            //aplikujemy zniżkę
            return applyDiscount(price, 0.15);
        else
            //aplikujemy zniżkę
            return applyDiscount(price,0.1);
    }

    private double calculateStandardDiscount(double price){
        if(price > 1000)
            //aplikujemy zniżkę
            return applyDiscount(price,0.05);
        else
            //zniżka = aktualna cena
            return price;
    }

    private double applyDiscount(double price, double discount){
        price *= (1 - discount);
        return price;
    }
}
