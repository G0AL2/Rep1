package zd;

import android.app.Activity;
import android.view.View;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsNative;

/* compiled from: RNAdsNative.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class d {
    public static void a(RNAdsNative rNAdsNative, Object obj) {
    }

    public static void b(RNAdsNative _this, Object obj) {
        _this.destroy(obj);
    }

    public static View c(RNAdsNative _this, Activity activity, Object obj, int i10, int i11) {
        return _this.inflateAdView(activity, obj, i10, i11);
    }
}
