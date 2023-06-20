package o9;

import com.google.android.exoplayer2.offline.StreamKey;
import da.g0;
import java.util.List;

/* compiled from: FilteringHlsPlaylistParserFactory.java */
/* loaded from: classes2.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f35067a;

    /* renamed from: b  reason: collision with root package name */
    private final List<StreamKey> f35068b;

    public e(k kVar, List<StreamKey> list) {
        this.f35067a = kVar;
        this.f35068b = list;
    }

    @Override // o9.k
    public g0.a<i> a() {
        return new com.google.android.exoplayer2.offline.a(this.f35067a.a(), this.f35068b);
    }

    @Override // o9.k
    public g0.a<i> b(h hVar, g gVar) {
        return new com.google.android.exoplayer2.offline.a(this.f35067a.b(hVar, gVar), this.f35068b);
    }
}
