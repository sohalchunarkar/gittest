package abstraction;

 class abstractionchild extends AbstractDemo{
    @Override
    void start() {
        
        System.out.println("The Vehicle is Startred");
    }

    public void stop()
    {
        System.out.println("This is stopped now");
    }
}
