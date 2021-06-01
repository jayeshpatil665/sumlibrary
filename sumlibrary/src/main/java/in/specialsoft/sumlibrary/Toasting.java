package in.specialsoft.sumlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toasting {

    public static void doToast(Context c,String msg){
        Toast.makeText(c, ""+msg, Toast.LENGTH_SHORT).show();
    }

}
