public class Task_3 {
}
void main() {
    double balance = 5000.00;
    double annualInterestRate = 0.17;
    double monthlyInterestRate = annualInterestRate / 12.0;

    // Month 1
    double month1Interest = balance * monthlyInterestRate;
    balance += month1Interest; // Balance after month 1

    // Month 2
    double month2Interest = balance * monthlyInterestRate;
    balance += month2Interest; // Balance after month 2

    System.out.println("Interest due after month 1: $" + month1Interest);
    System.out.println("Interest due after month 2: $" + month2Interest);
}