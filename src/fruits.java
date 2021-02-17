public class fruits {

       public int number_of_fruit_types;

       public fruits(int number_of_fruit_types)
       {
            this.number_of_fruit_types = number_of_fruit_types;
       }

       public void mango()
       {
            System.out.println("You bought mango");
       }

        public void apple()
        {
            System.out.println("You bought apple");
        }

       public void orange()
       {
           System.out.println("You bought orange");
       }

    public static void main(String[] args) {
        //Create object of fruitss class (Instantiation)
        fruits fruitobject = new fruits(5);
        fruitobject.mango();
       }


}
