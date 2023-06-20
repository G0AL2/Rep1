package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzfqh implements zzfsf {
    private transient Set zza;
    private transient Collection zzb;
    private transient Map zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsf) {
            return zzu().equals(((zzfsf) obj).zzu());
        }
        return false;
    }

    public final int hashCode() {
        return zzu().hashCode();
    }

    public final String toString() {
        return zzu().toString();
    }

    abstract Collection zzi();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator zzj() {
        throw null;
    }

    abstract Map zzm();

    abstract Set zzo();

    @Override // com.google.android.gms.internal.ads.zzfsf
    public boolean zzs(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsf
    public final Collection zzt() {
        Collection collection = this.zzb;
        if (collection == null) {
            Collection zzi = zzi();
            this.zzb = zzi;
            return zzi;
        }
        return collection;
    }

    @Override // com.google.android.gms.internal.ads.zzfsf
    public final Map zzu() {
        Map map = this.zzc;
        if (map == null) {
            Map zzm = zzm();
            this.zzc = zzm;
            return zzm;
        }
        return map;
    }

    public final Set zzv() {
        Set set = this.zza;
        if (set == null) {
            Set zzo = zzo();
            this.zza = zzo;
            return zzo;
        }
        return set;
    }
}
