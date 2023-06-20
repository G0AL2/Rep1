package com.facebook.imagepipeline.nativecode;

@y3.d
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements d6.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f14861a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14862b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14863c;

    @y3.d
    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f14861a = i10;
        this.f14862b = z10;
        this.f14863c = z11;
    }

    @Override // d6.d
    @y3.d
    public d6.c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z10) {
        if (cVar != com.facebook.imageformat.b.f14800a) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f14861a, this.f14862b, this.f14863c);
    }
}
