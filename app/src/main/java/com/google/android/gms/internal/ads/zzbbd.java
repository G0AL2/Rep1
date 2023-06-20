package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbd {
    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzbbc zza(boolean z10) {
        synchronized (this.zzb) {
            zzbbc zzbbcVar = null;
            if (this.zzc.isEmpty()) {
                zzcfi.zze("Queue empty");
                return null;
            }
            int i10 = 0;
            if (this.zzc.size() >= 2) {
                int i11 = RecyclerView.UNDEFINED_DURATION;
                int i12 = 0;
                for (zzbbc zzbbcVar2 : this.zzc) {
                    int zzb = zzbbcVar2.zzb();
                    if (zzb > i11) {
                        i10 = i12;
                    }
                    int i13 = zzb > i11 ? zzb : i11;
                    if (zzb > i11) {
                        zzbbcVar = zzbbcVar2;
                    }
                    i12++;
                    i11 = i13;
                }
                this.zzc.remove(i10);
                return zzbbcVar;
            }
            zzbbc zzbbcVar3 = (zzbbc) this.zzc.get(0);
            if (z10) {
                this.zzc.remove(0);
            } else {
                zzbbcVar3.zzi();
            }
            return zzbbcVar3;
        }
    }

    public final void zzb(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzcfi.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzbbcVar.zzj(i10);
            zzbbcVar.zzn();
            this.zzc.add(zzbbcVar);
        }
    }

    public final boolean zzc(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbbc zzbbcVar2 = (zzbbc) it.next();
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (zzbbcVar != zzbbcVar2 && zzbbcVar2.zzd().equals(zzbbcVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && zzbbcVar != zzbbcVar2 && zzbbcVar2.zzf().equals(zzbbcVar.zzf())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbbcVar);
        }
    }
}
