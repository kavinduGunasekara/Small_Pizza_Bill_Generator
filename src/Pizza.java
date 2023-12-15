public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPack =20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        }
        else{
            this.price=400;

        }
        basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;


        this.price+=extraCheesePrice;

    }
    public void addExtraToppings(){
        isExtraToppingAdded=true;


        this.price+=extraToppingPrice;

    }
    public void takeAway(){
        isOptedForTakeAway=true;


        this.price+=backPack;

    }
    public void getBill(){
        String bill="";

        System.out.println("pizza:"+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added:"+ extraCheesePrice+"\n";
        }
        if(isExtraToppingAdded){
            bill+="Extra Topping added:"+extraToppingPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+="Take Away:"+ backPack+"\n";
        }
        bill +="Bill:" +this.price+ "\n";
        System.out.println(bill);
    }


}
/**
 * base pizza; 300
 * topping ;150
 * cheese ; 100
 *take away ; 20
 */
