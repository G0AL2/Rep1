package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepj implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepj(zzfvm zzfvmVar, Context context) {
        this.zza = zzfvmVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepj.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzepk zzc() throws Exception {
        double d10;
        Intent registerReceiver = this.zzb.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d10 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
        } else {
            d10 = -1.0d;
        }
        return new zzepk(d10, z10);
    }
}
