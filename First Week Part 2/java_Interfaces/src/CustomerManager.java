public class CustomerManager {
    private iCustomerDal customerDal;
    public CustomerManager(iCustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //iş kodları
        customerDal.add();
    }
}
