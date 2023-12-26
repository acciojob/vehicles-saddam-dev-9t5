package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, isManual);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        int gear = 1;
        int currSpeed = this.getCurrentSpeed();
        newSpeed = currSpeed + rate;
        if(newSpeed < 0) newSpeed = 0;
        else if(newSpeed <= 50) gear = 1;
        else if(newSpeed <= 100) gear = 2;
        else if (newSpeed <= 150) gear = 3;
        else if (newSpeed <= 200) gear = 4;
        else if (newSpeed <= 250) gear = 5;
        else  gear = 6;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            this.stop();
            this.changeGear(gear);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
