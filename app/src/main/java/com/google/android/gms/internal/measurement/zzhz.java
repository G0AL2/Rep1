package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhz implements zzhj {
    private static final Map zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhz zza(Context context, String str) {
        zzhz zzhzVar;
        if (!zzha.zza()) {
            synchronized (zzhz.class) {
                zzhzVar = (zzhz) zza.get(null);
                if (zzhzVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzhzVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzhz.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzhz) it.next()).zzb;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    public final Object zzb(String str) {
        throw null;
    }
}
