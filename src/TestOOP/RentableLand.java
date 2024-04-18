package TestOOP;

public class RentableLand {
   final int COST_PER_SQUARE_METER = 40;
   boolean isFarmLand;

   int rent(int width, int length, int days){
       if ( isFarmLand && days >= 182){
           return COST_PER_SQUARE_METER * days * (width*length) - 100000;
       } else {
           return COST_PER_SQUARE_METER * days * (width*length);
       }
   }
}
