public class Account {
   private String name;
   private String surname;
   private String accNumber;
   private long balance;

   public String getName(){
       return name;
   }
   public String getSurname(){
       return surname;
   }
   public String getAccNumber(){
       return accNumber;
   }

   public void setName(String name){
       this.name = name;
   }
   public void setSurname(String surname){this.surname = surname;}
   public void setAccNumber(String accNumber){this.accNumber = accNumber;}
}
