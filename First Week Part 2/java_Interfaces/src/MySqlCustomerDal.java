public class MySqlCustomerDal implements iCustomerDal, iRepository{
    @Override
    public void add() {
        System.out.println("MySql Eklendi");
    }
}
