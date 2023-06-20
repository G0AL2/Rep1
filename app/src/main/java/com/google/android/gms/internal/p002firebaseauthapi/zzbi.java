package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbi {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private zzbf zzb;
    private final Class zzc;

    private zzbi(Class cls) {
        this.zzc = cls;
    }

    public static zzbi zzb(Class cls) {
        return new zzbi(cls);
    }

    public final zzbf zza(Object obj, zzkl zzklVar) throws GeneralSecurityException {
        byte[] array;
        if (zzklVar.zzh() == 3) {
            int zzi = zzklVar.zzi() - 2;
            if (zzi != 1) {
                if (zzi != 2) {
                    if (zzi == 3) {
                        array = zzaq.zza;
                    } else if (zzi != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzklVar.zza()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzklVar.zza()).array();
            }
            zzbf zzbfVar = new zzbf(obj, array, zzklVar.zzh(), zzklVar.zzi(), zzklVar.zza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzbfVar);
            zzbh zzbhVar = new zzbh(zzbfVar.zzb(), null);
            List list = (List) this.zza.put(zzbhVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzbfVar);
                this.zza.put(zzbhVar, Collections.unmodifiableList(arrayList2));
            }
            return zzbfVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final Class zzc() {
        return this.zzc;
    }

    public final List zzd(byte[] bArr) {
        List list = (List) this.zza.get(new zzbh(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final void zze(zzbf zzbfVar) {
        if (zzbfVar.zzc() == 3) {
            if (!zzd(zzbfVar.zzb()).isEmpty()) {
                this.zzb = zzbfVar;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
