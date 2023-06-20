package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.m;
import androidx.work.n;
import androidx.work.v;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            v.i(context.getApplicationContext(), new b.C0081b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            v g10 = v.g(context);
            g10.a("offline_ping_sender_work");
            g10.c(new n.a(OfflinePingSender.class).i(new c.a().b(m.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e10) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        c a10 = new c.a().b(m.CONNECTED).a();
        try {
            v.g(context).c(new n.a(OfflineNotificationPoster.class).i(a10).m(new e.a().g("uri", str).g("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
