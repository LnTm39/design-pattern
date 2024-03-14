// Main.java
public class Main {
    public static void main(String[] args) {
        Client[] clients = {
            new Client(new VisaCreditCard()), new Client(new VisaCreditCard()), new Client(new MasterCardCreditCard()),
            new Client(new VisaDebitCard()), new Client(new VisaDebitCard()), new Client(new MasterCardDebitCard()), new Client(new MasterCardDebitCard())
        };

        for (Client client : clients) {
            System.out.println(client.card);
        }
    }
}
