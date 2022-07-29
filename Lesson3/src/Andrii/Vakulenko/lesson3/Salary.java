package Andrii.Vakulenko.lesson3;
public class Salary {
    static class Worker {
        double monthIncome;
        int period;
        double tax;
        double salaryForPeriod;
        double taxFreeSalary;
        Worker(double monthIncome, int period, double tax) {
            this.monthIncome = monthIncome;
            this.period = period;
            this.tax = tax / 100;
            this.salaryForPeriod = this.monthIncome * 12 * this.period;
            this.taxFreeSalary = Math.ceil(this.salaryForPeriod * (1 - this.tax) * 100) / 100;
         }
    }
    public static void main (String[] args) {
        Worker workerOne = new Worker(1, 10, 5);
        Worker workerTwo = new Worker(2, 10, 5);
        Worker workerThree = new Worker(3, 10, 5);
        double inAverageSalary =Math.ceil((workerOne.taxFreeSalary + workerTwo.taxFreeSalary + workerThree.taxFreeSalary)/3*100)/100;
        System.out.println("First worker's tax free salary for " +  workerOne.period + " years is " + workerOne.taxFreeSalary);
        System.out.println("Second worker's tax free salary for " +  workerTwo.period + " years is " + workerTwo.taxFreeSalary);
        System.out.println("Third worker's tax free salary for " +  workerThree.period + " years is " + workerThree.taxFreeSalary);
        System.out.println("Average salary of three workers for " + workerOne.period + " years is " + inAverageSalary);


    }
}
