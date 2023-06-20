package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapo extends zzaqn {
    private static final zzaqo zzi = new zzaqo();
    private final Context zzj;

    public zzapo(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11, Context context) {
        super(zzapcVar, "jP+6II/RqbFgO1yXDlTKTZh3PSPs7B8S68QmevSn/bVP2NzeS5BO3umQKUdsHS/c", "GLyIO6R2q01pjCn0D3/H49YHLEvqvbC5vDeJpi09sqQ=", zzaliVar, i10, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzm("E");
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzm(zzamn.zza(str.getBytes(), true));
        }
    }
}
