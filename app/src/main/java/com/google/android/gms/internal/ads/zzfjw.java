package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjw {
    public static float zza(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static String zzb(View view) {
        if (view.isAttachedToWindow()) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
            } else if (view.getAlpha() == 0.0f) {
                return "viewAlphaZero";
            } else {
                return null;
            }
        }
        return "notAttached";
    }
}
