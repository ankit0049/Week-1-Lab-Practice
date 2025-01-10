// Create a class DiscountFees to calculate discounted fee
class DiscountFees {
    public static void main(String[] args) {
        // Create variables for fee and discount percentage
        int fee = 125000, discountPercent = 10;

        //  Create a int variable to Calculate discount  using ( fee * discountPercent) / 100
        int discount = (fee * discountPercent) / 100; 
		
		// Create a int variable to Calculate final discountedFee using ( Fee - discount )
        int discountedFee = fee - discount;

        // Display the discount details
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + discountedFee);
    }
}
