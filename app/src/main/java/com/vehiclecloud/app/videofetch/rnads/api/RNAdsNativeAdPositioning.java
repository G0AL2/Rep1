package com.vehiclecloud.app.videofetch.rnads.api;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public interface RNAdsNativeAdPositioning {

    /* loaded from: classes3.dex */
    public interface Callback {
        void onFailed(String str);

        void onSuccess(Positioning positioning);
    }

    /* loaded from: classes3.dex */
    public static class Positioning {
        public List<Integer> fixed;
        public int repeating;
    }

    void loadPositions(Context context, String str, Callback callback);
}
