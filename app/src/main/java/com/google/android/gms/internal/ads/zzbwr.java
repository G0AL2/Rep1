package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbwr implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbws zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwr(zzbws zzbwsVar) {
        this.zza = zzbwsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
