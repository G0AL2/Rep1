package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgj {
    private final AudioManager zza;
    private final zzgh zzb;
    private zzgi zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgj(Context context, Handler handler, zzgi zzgiVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgiVar;
        this.zzb = new zzgh(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzgj zzgjVar, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                zzgjVar.zzg(3);
                return;
            }
            zzgjVar.zzf(0);
            zzgjVar.zzg(2);
        } else if (i10 == -1) {
            zzgjVar.zzf(-1);
            zzgjVar.zze();
        } else if (i10 != 1) {
            Log.w("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            zzgjVar.zzg(1);
            zzgjVar.zzf(1);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzeg.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i10) {
        zzgi zzgiVar = this.zzc;
        if (zzgiVar != null) {
            zzii zziiVar = (zzii) zzgiVar;
            boolean zzq = zziiVar.zza.zzq();
            zziiVar.zza.zzau(zzq, i10, zzim.zzah(zzq, i10));
        }
    }

    private final void zzg(int i10) {
        if (this.zzd == i10) {
            return;
        }
        this.zzd = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.zze == f10) {
            return;
        }
        this.zze = f10;
        zzgi zzgiVar = this.zzc;
        if (zzgiVar != null) {
            ((zzii) zzgiVar).zza.zzar();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        return z10 ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
