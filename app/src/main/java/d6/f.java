package d6;

import r5.m;

/* compiled from: MultiImageTranscoderFactory.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f29087a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f29088b;

    /* renamed from: c  reason: collision with root package name */
    private final d f29089c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f29090d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29091e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f29087a = i10;
        this.f29088b = z10;
        this.f29089c = dVar;
        this.f29090d = num;
        this.f29091e = z11;
    }

    private c a(com.facebook.imageformat.c cVar, boolean z10) {
        d dVar = this.f29089c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z10);
    }

    private c b(com.facebook.imageformat.c cVar, boolean z10) {
        Integer num = this.f29090d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return d(cVar, z10);
            }
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return c(cVar, z10);
    }

    private c c(com.facebook.imageformat.c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f29087a, this.f29088b, this.f29091e).createImageTranscoder(cVar, z10);
    }

    private c d(com.facebook.imageformat.c cVar, boolean z10) {
        return new h(this.f29087a).createImageTranscoder(cVar, z10);
    }

    @Override // d6.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z10) {
        c a10 = a(cVar, z10);
        if (a10 == null) {
            a10 = b(cVar, z10);
        }
        if (a10 == null && m.a()) {
            a10 = c(cVar, z10);
        }
        return a10 == null ? d(cVar, z10) : a10;
    }
}
