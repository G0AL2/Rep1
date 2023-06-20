package d6;

/* compiled from: SimpleImageTranscoderFactory.java */
/* loaded from: classes.dex */
public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f29094a;

    public h(int i10) {
        this.f29094a = i10;
    }

    @Override // d6.d
    public c createImageTranscoder(com.facebook.imageformat.c cVar, boolean z10) {
        return new g(z10, this.f29094a);
    }
}
