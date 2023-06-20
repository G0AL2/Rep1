package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzww extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzwu zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzww(zzwu zzwuVar, SurfaceTexture surfaceTexture, boolean z10, zzwv zzwvVar) {
        super(surfaceTexture);
        this.zzd = zzwuVar;
        this.zza = z10;
    }

    public static zzww zza(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzcw.zzf(z11);
        return new zzwu().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        String eglQueryString;
        synchronized (zzww.class) {
            if (!zzc) {
                int i11 = zzeg.zza;
                int i12 = 2;
                if (i11 >= 24 && ((i11 >= 26 || (!"samsung".equals(zzeg.zzc) && !"XT1650".equals(zzeg.zzd))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i12 = 1;
                    }
                    zzb = i12;
                    zzc = true;
                }
                i12 = 0;
                zzb = i12;
                zzc = true;
            }
            i10 = zzb;
        }
        return i10 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
