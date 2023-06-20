package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwl(zzbwn zzbwnVar) {
        this.zza = zzbwnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzI(context, zzb);
    }
}
