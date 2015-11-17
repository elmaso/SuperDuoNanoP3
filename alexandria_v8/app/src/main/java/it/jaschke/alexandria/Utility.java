package it.jaschke.alexandria;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by mariosoberanis on 11/16/15.
 * We use this class to store common stuff
 */
public class Utility {


 /* RETURN TRUE IF NETWORK IS AVAILABLE OR FALSE IF ITS NOT
 *
 * @param c Context use to get ConectivityMamager
 * */

    static public boolean isNetworkAvailable(Context c) {
        ConnectivityManager cm
                = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = cm.getActiveNetworkInfo();
        return activeNetworkInfo != null
                && activeNetworkInfo.isConnected();
    }
}
