import android.app.Application;

/**
 * Created by HP on 8/10/2017.
 */

public class cart_var extends Application {
    private String var1;

    public String getvar(){
        return var1;
    }
    public void setvar(String str){
        var1 = str;
    }
}
