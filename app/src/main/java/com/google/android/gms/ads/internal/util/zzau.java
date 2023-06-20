package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzau implements DialogInterface.OnClickListener {
    final /* synthetic */ zzav zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzP(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
