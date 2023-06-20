package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxc {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private zzfwz zzb;
    private final Class zzc;

    private zzfxc(Class cls) {
        this.zzc = cls;
    }

    public static zzfxc zzc(Class cls) {
        return new zzfxc(cls);
    }

    public final zzfwz zza(Object obj, zzgfv zzgfvVar) throws GeneralSecurityException {
        byte[] array;
        if (zzgfvVar.zzi() == 3) {
            int zzj = zzgfvVar.zzj() - 2;
            if (zzj != 1) {
                if (zzj != 2) {
                    if (zzj == 3) {
                        array = zzfwk.zza;
                    } else if (zzj != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgfvVar.zza()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgfvVar.zza()).array();
            }
            zzfwz zzfwzVar = new zzfwz(obj, array, zzgfvVar.zzi(), zzgfvVar.zzj(), zzgfvVar.zza());
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzfwzVar);
            zzfxb zzfxbVar = new zzfxb(zzfwzVar.zzb(), null);
            List list = (List) this.zza.put(zzfxbVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzfwzVar);
                this.zza.put(zzfxbVar, Collections.unmodifiableList(arrayList2));
            }
            return zzfwzVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public final zzfwz zzb() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzfxb(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final void zzf(zzfwz zzfwzVar) {
        if (zzfwzVar.zzc() == 3) {
            if (!zze(zzfwzVar.zzb()).isEmpty()) {
                this.zzb = zzfwzVar;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
