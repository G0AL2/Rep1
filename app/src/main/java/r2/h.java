package r2;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f36147a;

    /* renamed from: b  reason: collision with root package name */
    private final List<q2.g> f36148b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36149c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f36150d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f36151e;

    public h(int i10, List<q2.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f36150d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f36151e != null) {
            return new ByteArrayInputStream(this.f36151e);
        }
        return null;
    }

    public final int b() {
        return this.f36149c;
    }

    public final List<q2.g> c() {
        return Collections.unmodifiableList(this.f36148b);
    }

    public final int d() {
        return this.f36147a;
    }

    public h(int i10, List<q2.g> list, int i11, InputStream inputStream) {
        this.f36147a = i10;
        this.f36148b = list;
        this.f36149c = i11;
        this.f36150d = inputStream;
        this.f36151e = null;
    }
}
