package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxc implements DisplayManager.DisplayListener, zzxa {
    private final DisplayManager zza;
    private zzwy zzb;

    private zzxc(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxa zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxc(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        zzwy zzwyVar = this.zzb;
        if (zzwyVar == null || i10 != 0) {
            return;
        }
        zzxe.zzb(zzwyVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zzb(zzwy zzwyVar) {
        this.zzb = zzwyVar;
        this.zza.registerDisplayListener(this, zzeg.zzC(null));
        zzxe.zzb(zzwyVar.zza, zzd());
    }
}
