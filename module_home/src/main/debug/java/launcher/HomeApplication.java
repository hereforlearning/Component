package launcher;

import android.app.Application;

import com.weiqi.modulebase.BaseApplicationHelper;
import com.weiqi.modulehome.BuildConfig;

/**
 * Created by alexwangweiqi on 17/9/5.
 */

public class HomeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        boolean debug = BuildConfig.DEBUG;
        init(debug, this);
    }

    private void init(boolean debug, Application context) {

        BaseApplicationHelper.init(debug, context);

    }

    static {
        System.loadLibrary("keyutil");
    }
}
