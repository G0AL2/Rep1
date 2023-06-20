package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbwo implements View.OnClickListener {
    final /* synthetic */ zzbwp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwo(zzbwp zzbwpVar) {
        this.zza = zzbwpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
