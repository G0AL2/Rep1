package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbwm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwm(zzbwn zzbwnVar) {
        this.zza = zzbwnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("Operation denied by user.");
    }
}
