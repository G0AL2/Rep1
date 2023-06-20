package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdog implements zzbko {
    final /* synthetic */ zzdpc zza;
    final /* synthetic */ ViewGroup zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdog(zzdpc zzdpcVar, ViewGroup viewGroup) {
        this.zza = zzdpcVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzc() {
        zzdpc zzdpcVar = this.zza;
        zzfrj zzfrjVar = zzdod.zza;
        Map zzm = zzdpcVar.zzm();
        if (zzm == null) {
            return;
        }
        int size = zzfrjVar.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (zzm.get((String) zzfrjVar.get(i10)) != null) {
                this.zza.onClick(this.zzb);
                return;
            }
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
