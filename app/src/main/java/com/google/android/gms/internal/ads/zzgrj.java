package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgrj extends e {
    private final WeakReference zza;

    public zzgrj(zzbix zzbixVar, byte[] bArr) {
        this.zza = new WeakReference(zzbixVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        zzbix zzbixVar = (zzbix) this.zza.get();
        if (zzbixVar != null) {
            zzbixVar.zzc(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbix zzbixVar = (zzbix) this.zza.get();
        if (zzbixVar != null) {
            zzbixVar.zzd();
        }
    }
}
