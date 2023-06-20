package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaw {
    public final Uri zza;
    public final List zze;
    public final zzfrj zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;
    public final String zzb = null;
    public final zzaq zzc = null;
    public final zzag zzd = null;
    public final String zzf = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaw(Uri uri, String str, zzaq zzaqVar, zzag zzagVar, List list, String str2, zzfrj zzfrjVar, Object obj, zzav zzavVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfrjVar;
        zzfrg zzi = zzfrj.zzi();
        if (zzfrjVar.size() <= 0) {
            this.zzh = zzi.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzazVar = (zzaz) zzfrjVar.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            return this.zza.equals(zzawVar.zza) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && this.zze.equals(zzawVar.zze) && zzeg.zzS(null, null) && this.zzg.equals(zzawVar.zzg) && zzeg.zzS(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
