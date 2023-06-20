package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzkg {
    private final WifiManager zza;

    public zzkg(Context context) {
        this.zza = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
