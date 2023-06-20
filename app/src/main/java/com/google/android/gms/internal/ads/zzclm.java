package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzclm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzccj zza;
    final /* synthetic */ zzclp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclm(zzclp zzclpVar, zzccj zzccjVar) {
        this.zzb = zzclpVar;
        this.zza = zzccjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzQ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
