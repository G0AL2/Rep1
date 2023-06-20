package fm.castbox.mediation.helper;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes3.dex */
public class AudienceNetworkInitializeHelper implements AudienceNetworkAds.InitListener {
    private static final String TAG = "AudienceNetworkInitializeHelper";
    private Context context;
    private Listener listener;

    /* loaded from: classes3.dex */
    public interface Listener {
        void onFailure(String str);

        void onSuccess();
    }

    public AudienceNetworkInitializeHelper(Context context, Listener listener) {
        this.listener = listener;
        this.context = context;
    }

    public void initialize() {
        if (AudienceNetworkAds.isInitialized(this.context)) {
            return;
        }
        AudienceNetworkAds.buildInitSettings(this.context).withInitListener(this).initialize();
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        if (initResult.isSuccess()) {
            Log.i(TAG, "Facebook Audience Network SDK initialization succeeded");
            Listener listener = this.listener;
            if (listener != null) {
                listener.onSuccess();
                return;
            }
            return;
        }
        String str = "Facebook Audience Network SDK initialization failed due to " + initResult.getMessage();
        Log.e(TAG, str);
        Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onFailure(str);
        }
    }
}
