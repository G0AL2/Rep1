package ye;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f39599n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f39600o = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39601a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39602b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39603c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39604d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f39605e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f39606f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39607g;

    /* renamed from: h  reason: collision with root package name */
    private final int f39608h;

    /* renamed from: i  reason: collision with root package name */
    private final int f39609i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f39610j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f39611k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f39612l;

    /* renamed from: m  reason: collision with root package name */
    private String f39613m;

    /* compiled from: CacheControl.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f39614a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f39615b;

        /* renamed from: c  reason: collision with root package name */
        private int f39616c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f39617d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f39618e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39619f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f39620g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f39621h;

        private final int b(long j10) {
            return j10 > ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j10;
        }

        public final d a() {
            return new d(this.f39614a, this.f39615b, this.f39616c, -1, false, false, false, this.f39617d, this.f39618e, this.f39619f, this.f39620g, this.f39621h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f39617d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f39614a = true;
            return this;
        }

        public final a e() {
            this.f39615b = true;
            return this;
        }

        public final a f() {
            this.f39619f = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i10) {
            boolean C;
            int length = str.length();
            while (i10 < length) {
                C = ve.q.C(str2, str.charAt(i10), false, 2, null);
                if (C) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ye.d b(ye.t r32) {
            /*
                Method dump skipped, instructions count: 401
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.d.b.b(ye.t):ye.d");
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    static {
        new a().d().a();
        f39599n = new a().f().c(Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f39601a = z10;
        this.f39602b = z11;
        this.f39603c = i10;
        this.f39604d = i11;
        this.f39605e = z12;
        this.f39606f = z13;
        this.f39607g = z14;
        this.f39608h = i12;
        this.f39609i = i13;
        this.f39610j = z15;
        this.f39611k = z16;
        this.f39612l = z17;
        this.f39613m = str;
    }

    public final boolean a() {
        return this.f39605e;
    }

    public final boolean b() {
        return this.f39606f;
    }

    public final int c() {
        return this.f39603c;
    }

    public final int d() {
        return this.f39608h;
    }

    public final int e() {
        return this.f39609i;
    }

    public final boolean f() {
        return this.f39607g;
    }

    public final boolean g() {
        return this.f39601a;
    }

    public final boolean h() {
        return this.f39602b;
    }

    public final boolean i() {
        return this.f39610j;
    }

    public String toString() {
        String str = this.f39613m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f39601a) {
                sb2.append("no-cache, ");
            }
            if (this.f39602b) {
                sb2.append("no-store, ");
            }
            if (this.f39603c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f39603c);
                sb2.append(", ");
            }
            if (this.f39604d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f39604d);
                sb2.append(", ");
            }
            if (this.f39605e) {
                sb2.append("private, ");
            }
            if (this.f39606f) {
                sb2.append("public, ");
            }
            if (this.f39607g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f39608h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f39608h);
                sb2.append(", ");
            }
            if (this.f39609i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f39609i);
                sb2.append(", ");
            }
            if (this.f39610j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f39611k) {
                sb2.append("no-transform, ");
            }
            if (this.f39612l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f39613m = sb3;
            return sb3;
        }
        return str;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, qe.g gVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }
}
