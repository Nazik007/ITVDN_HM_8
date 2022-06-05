public class Bank {
    static void bank(int payment){
        int credit = 800;
        credit -= payment;

        if (credit <= 0){
            System.out.println("Кредит оплачено повністю");
        }
        if (payment >= credit){
            System.out.println("Кредит переплачено : " + payment % 800);
        }
        else System.out.println("Вам залишилось заплатити: " + credit);
    }

    public static void main(String[] args) {
        bank(1000);

    }
}
