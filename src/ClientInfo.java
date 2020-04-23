class ClientInfo {
    public void printClientSummary (Client client, double price, double discountPrice){
        //wiadomość powitalna
        printWelcomeMessage(client);
        //wiadomość, czy klient jest premium, jeśli nie to zachęcamy do kupienia takiego konta
        showPremiumMessage(client);
        //wyświetlamy ceny
        printPrices(price, discountPrice);
    }

    private void printPrices(double price, double discountPrice) {
        System.out.println("Kwota do zapłaty: " + price + " zł");
        System.out.println("Kwota po rabacie: " + discountPrice + " zł");
    }

    void showPremiumMessage (Client client) {
        if(client.isPremium()){
            System.out.println("Jesteś klientem Premium, otrzymujesz dodatkowe zniżki.");
        }else{
            System.out.println("Aby skorzystać ze zniżek, kup konto Premium.");
        }
    }

    void printWelcomeMessage (Client client){
        //tylko imie
        if(hasFirstName(client) && !hasLastName(client))
            System.out.println("Witaj, " + client.getFirstName());

        //tylko nazwisko
        else if(!hasFirstName(client) && hasLastName(client))
            System.out.println("Dzień dobry, panie/pani " + client.getLastName());

        //imie i nazwisko
        else if(hasFirstNameAndLastName(client))
            System.out.println("Witaj, " + client.getFirstName() + " " + client.getLastName());

        //gosc/nieznajomy
        else
            System.out.println("Witaj, nieznajomy");
    }

    boolean hasFirstName (Client client){
        return client.getFirstName() != null;
    }

    boolean hasLastName (Client client){
        return client.getLastName() != null;
    }

    boolean hasFirstNameAndLastName (Client client){
        return client.getFirstName() != null && client.getLastName() != null;
    }
}
