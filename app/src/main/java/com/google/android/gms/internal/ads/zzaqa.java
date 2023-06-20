package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqa extends zzaqn {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzaqa(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", zzaliVar, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzA("E");
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzA(zzi);
        }
    }
}
