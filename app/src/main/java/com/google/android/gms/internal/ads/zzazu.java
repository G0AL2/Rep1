package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(17)
/* loaded from: classes2.dex */
public final class zzazu extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzazs zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzazu(zzazs zzazsVar, SurfaceTexture surfaceTexture, boolean z10, zzazt zzaztVar) {
        super(surfaceTexture);
        this.zzc = zzazsVar;
    }

    public static zzazu zza(Context context, boolean z10) {
        if (zzazo.zza >= 17) {
            boolean z11 = true;
            if (z10 && !zzb(context)) {
                z11 = false;
            }
            zzayz.zze(z11);
            return new zzazs().zza(z10);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean zzb(Context context) {
        boolean z10;
        synchronized (zzazu.class) {
            if (!zzb) {
                int i10 = zzazo.zza;
                if (i10 >= 17) {
                    boolean z11 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i10 == 24) {
                            String str = zzazo.zzd;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z11 = true;
                    }
                    zza = z11;
                }
                zzb = true;
            }
            z10 = zza;
        }
        return z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}
