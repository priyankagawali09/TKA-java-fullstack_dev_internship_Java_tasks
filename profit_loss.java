public class profit_loss{
	public static void main(String[] args) {
    int cost_price =250;
    int selling_price = 230;
    if(cost_price <= selling_price){
        int profit = selling_price - cost_price ;
        System.out.println("congratulation ...! you got profit of rs. "+profit);
    }else{
        int loss=cost_price - selling_price;
        System.out.println("Sorry ...! you got loss of rs. "+loss);
    }

	}

}
