package i9;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicLong f31714b = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f31715a;

    public n(long j10, da.p pVar, long j11) {
        this(j10, pVar, pVar.f29227a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f31714b.getAndIncrement();
    }

    public n(long j10, da.p pVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f31715a = map;
    }
}
