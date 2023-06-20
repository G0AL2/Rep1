package n8;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: MediaDrmCallbackException.java */
/* loaded from: classes2.dex */
public final class u extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final da.p f34719a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f34720b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f34721c;

    /* renamed from: d  reason: collision with root package name */
    public final long f34722d;

    public u(da.p pVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th) {
        super(th);
        this.f34719a = pVar;
        this.f34720b = uri;
        this.f34721c = map;
        this.f34722d = j10;
    }
}
