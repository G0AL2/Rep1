package ba;

import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import i9.w0;
import java.util.List;

/* compiled from: FixedTrackSelection.java */
/* loaded from: classes2.dex */
public final class r extends c {

    /* renamed from: g  reason: collision with root package name */
    private final int f5128g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f5129h;

    public r(w0 w0Var, int i10, int i11) {
        this(w0Var, i10, i11, 0, null);
    }

    @Override // ba.q
    public int a() {
        return 0;
    }

    @Override // ba.q
    public Object g() {
        return this.f5129h;
    }

    @Override // ba.q
    public void j(long j10, long j11, long j12, List<? extends k9.n> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    @Override // ba.q
    public int q() {
        return this.f5128g;
    }

    public r(w0 w0Var, int i10, int i11, int i12, Object obj) {
        super(w0Var, new int[]{i10}, i11);
        this.f5128g = i12;
        this.f5129h = obj;
    }
}
