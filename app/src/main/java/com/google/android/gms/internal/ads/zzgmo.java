package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmo {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgmo() {
    }

    public static /* bridge */ /* synthetic */ zzgji zza(zzgmo zzgmoVar, zzgji zzgjiVar, zzgji zzgjiVar2) {
        zzgmoVar.zzb(zzgjiVar);
        zzgmoVar.zzb(zzgjiVar2);
        zzgji zzgjiVar3 = (zzgji) zzgmoVar.zza.pop();
        while (!zzgmoVar.zza.isEmpty()) {
            zzgjiVar3 = new zzgms((zzgji) zzgmoVar.zza.pop(), zzgjiVar3);
        }
        return zzgjiVar3;
    }

    private final void zzb(zzgji zzgjiVar) {
        zzgji zzgjiVar2;
        zzgji zzgjiVar3;
        if (zzgjiVar.zzh()) {
            int zzc = zzc(zzgjiVar.zzd());
            int zzc2 = zzgms.zzc(zzc + 1);
            if (!this.zza.isEmpty() && ((zzgji) this.zza.peek()).zzd() < zzc2) {
                int zzc3 = zzgms.zzc(zzc);
                zzgji zzgjiVar4 = (zzgji) this.zza.pop();
                while (!this.zza.isEmpty() && ((zzgji) this.zza.peek()).zzd() < zzc3) {
                    zzgjiVar4 = new zzgms((zzgji) this.zza.pop(), zzgjiVar4);
                }
                zzgms zzgmsVar = new zzgms(zzgjiVar4, zzgjiVar);
                while (!this.zza.isEmpty()) {
                    if (((zzgji) this.zza.peek()).zzd() >= zzgms.zzc(zzc(zzgmsVar.zzd()) + 1)) {
                        break;
                    }
                    zzgmsVar = new zzgms((zzgji) this.zza.pop(), zzgmsVar);
                }
                this.zza.push(zzgmsVar);
                return;
            }
            this.zza.push(zzgjiVar);
        } else if (zzgjiVar instanceof zzgms) {
            zzgms zzgmsVar2 = (zzgms) zzgjiVar;
            zzgjiVar2 = zzgmsVar2.zzd;
            zzb(zzgjiVar2);
            zzgjiVar3 = zzgmsVar2.zze;
            zzb(zzgjiVar3);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgjiVar.getClass())));
        }
    }

    private static final int zzc(int i10) {
        int binarySearch = Arrays.binarySearch(zzgms.zza, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzgmo(zzgmn zzgmnVar) {
    }
}
