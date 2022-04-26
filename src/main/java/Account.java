public class Account {
   private String account_name;
   private String account_surname;
   private String accNumber;
   private long balance;

   public String getName(){
       return account_name;
   }

   public void setName(String account_name){
       this.account_name = account_name;
   }
}
