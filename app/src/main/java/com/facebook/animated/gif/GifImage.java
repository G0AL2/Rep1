package com.facebook.animated.gif;

import java.nio.ByteBuffer;
import y3.d;

@d
/* loaded from: classes.dex */
public class GifImage {
    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j10, int i10);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i10);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    protected void finalize() {
        nativeFinalize();
    }

    @d
    GifImage(long j10) {
        this.mNativeContext = j10;
    }
}
