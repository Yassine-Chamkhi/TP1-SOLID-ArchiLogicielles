package com.directi.training.lsp.proposed_solution;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (Duck duck : ducks) {
            try{
                duck.quack();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    private void swim(Duck... ducks)
    {
        for (Duck duck : ducks) {
            try{
                duck.swim();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
