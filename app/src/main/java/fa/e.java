package fa;

import android.view.Surface;

/* compiled from: MediaCodecVideoDecoderException.java */
/* loaded from: classes2.dex */
public class e extends b9.m {
    public e(Throwable th, b9.n nVar, Surface surface) {
        super(th, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
