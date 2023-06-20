package m8;

import ea.n0;

/* compiled from: DecoderCounters.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f34277a;

    /* renamed from: b  reason: collision with root package name */
    public int f34278b;

    /* renamed from: c  reason: collision with root package name */
    public int f34279c;

    /* renamed from: d  reason: collision with root package name */
    public int f34280d;

    /* renamed from: e  reason: collision with root package name */
    public int f34281e;

    /* renamed from: f  reason: collision with root package name */
    public int f34282f;

    /* renamed from: g  reason: collision with root package name */
    public int f34283g;

    /* renamed from: h  reason: collision with root package name */
    public int f34284h;

    /* renamed from: i  reason: collision with root package name */
    public int f34285i;

    /* renamed from: j  reason: collision with root package name */
    public int f34286j;

    /* renamed from: k  reason: collision with root package name */
    public long f34287k;

    /* renamed from: l  reason: collision with root package name */
    public int f34288l;

    private void b(long j10, int i10) {
        this.f34287k += j10;
        this.f34288l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return n0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f34277a), Integer.valueOf(this.f34278b), Integer.valueOf(this.f34279c), Integer.valueOf(this.f34280d), Integer.valueOf(this.f34281e), Integer.valueOf(this.f34282f), Integer.valueOf(this.f34283g), Integer.valueOf(this.f34284h), Integer.valueOf(this.f34285i), Integer.valueOf(this.f34286j), Long.valueOf(this.f34287k), Integer.valueOf(this.f34288l));
    }
}
