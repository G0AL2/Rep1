package da;

import android.net.Uri;
import com.ironsource.mediationsdk.config.VersionInfo;
import j8.m1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29227a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29228b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29229c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f29230d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f29231e;

    /* renamed from: f  reason: collision with root package name */
    public final long f29232f;

    /* renamed from: g  reason: collision with root package name */
    public final long f29233g;

    /* renamed from: h  reason: collision with root package name */
    public final String f29234h;

    /* renamed from: i  reason: collision with root package name */
    public final int f29235i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f29236j;

    /* compiled from: DataSpec.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f29237a;

        /* renamed from: b  reason: collision with root package name */
        private long f29238b;

        /* renamed from: c  reason: collision with root package name */
        private int f29239c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f29240d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f29241e;

        /* renamed from: f  reason: collision with root package name */
        private long f29242f;

        /* renamed from: g  reason: collision with root package name */
        private long f29243g;

        /* renamed from: h  reason: collision with root package name */
        private String f29244h;

        /* renamed from: i  reason: collision with root package name */
        private int f29245i;

        /* renamed from: j  reason: collision with root package name */
        private Object f29246j;

        public p a() {
            ea.a.i(this.f29237a, "The uri must be set.");
            return new p(this.f29237a, this.f29238b, this.f29239c, this.f29240d, this.f29241e, this.f29242f, this.f29243g, this.f29244h, this.f29245i, this.f29246j);
        }

        public b b(int i10) {
            this.f29245i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f29240d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f29239c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f29241e = map;
            return this;
        }

        public b f(String str) {
            this.f29244h = str;
            return this;
        }

        public b g(long j10) {
            this.f29243g = j10;
            return this;
        }

        public b h(long j10) {
            this.f29242f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f29237a = uri;
            return this;
        }

        public b j(String str) {
            this.f29237a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f29239c = 1;
            this.f29241e = Collections.emptyMap();
            this.f29243g = -1L;
        }

        private b(p pVar) {
            this.f29237a = pVar.f29227a;
            this.f29238b = pVar.f29228b;
            this.f29239c = pVar.f29229c;
            this.f29240d = pVar.f29230d;
            this.f29241e = pVar.f29231e;
            this.f29242f = pVar.f29232f;
            this.f29243g = pVar.f29233g;
            this.f29244h = pVar.f29234h;
            this.f29245i = pVar.f29235i;
            this.f29246j = pVar.f29236j;
        }
    }

    static {
        m1.a("goog.exo.datasource");
    }

    public static String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return VersionInfo.GIT_BRANCH;
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f29229c);
    }

    public boolean d(int i10) {
        return (this.f29235i & i10) == i10;
    }

    public p e(long j10) {
        long j11 = this.f29233g;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public p f(long j10, long j11) {
        return (j10 == 0 && this.f29233g == j11) ? this : new p(this.f29227a, this.f29228b, this.f29229c, this.f29230d, this.f29231e, this.f29232f + j10, j11, this.f29234h, this.f29235i, this.f29236j);
    }

    public String toString() {
        String b10 = b();
        String valueOf = String.valueOf(this.f29227a);
        long j10 = this.f29232f;
        long j11 = this.f29233g;
        String str = this.f29234h;
        int i10 = this.f29235i;
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 70 + valueOf.length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(b10);
        sb2.append(" ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    public p(Uri uri) {
        this(uri, 0L, -1L);
    }

    public p(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    @Deprecated
    public p(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public p(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public p(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    @Deprecated
    public p(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.emptyMap());
    }

    @Deprecated
    public p(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    private p(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        ea.a.a(j10 + j11 >= 0);
        ea.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        ea.a.a(z10);
        this.f29227a = uri;
        this.f29228b = j10;
        this.f29229c = i10;
        this.f29230d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f29231e = Collections.unmodifiableMap(new HashMap(map));
        this.f29232f = j11;
        this.f29233g = j12;
        this.f29234h = str;
        this.f29235i = i11;
        this.f29236j = obj;
    }
}
