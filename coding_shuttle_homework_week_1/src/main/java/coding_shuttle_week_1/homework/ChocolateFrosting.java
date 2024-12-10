package coding_shuttle_week_1.homework;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting extends Frosting_Interface {

    @Override
    public String getFrostingType(){
        return "Chocolate Frosting";
    }
}
