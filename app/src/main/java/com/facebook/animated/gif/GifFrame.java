package com.facebook.animated.gif;

import android.graphics.Bitmap;
import y3.d;

/* loaded from: classes.dex */
public class GifFrame {
    @d
    private long mNativeContext;

    @d
    GifFrame(long j10) {
        this.mNativeContext = j10;
    }

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDisposalMode();

    @d
    private native int nativeGetDurationMs();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetTransparentPixelColor();

    @d
    private native int nativeGetWidth();

    @d
    private native int nativeGetXOffset();

    @d
    private native int nativeGetYOffset();

    @d
    private native boolean nativeHasTransparency();

    @d
    private native void nativeRenderFrame(int i10, int i11, Bitmap bitmap);

    protected void finalize() {
        nativeFinalize();
    }
}
