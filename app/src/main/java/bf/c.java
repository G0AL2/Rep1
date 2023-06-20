package bf;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import qe.g;
import qe.k;
import ve.p;
import ye.b0;
import ye.d0;
import ye.t;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5222c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final b0 f5223a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f5224b;

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(d0 d0Var, b0 b0Var) {
            k.f(d0Var, "response");
            k.f(b0Var, "request");
            int h10 = d0Var.h();
            if (h10 != 200 && h10 != 410 && h10 != 414 && h10 != 501 && h10 != 203 && h10 != 204) {
                if (h10 != 307) {
                    if (h10 != 308 && h10 != 404 && h10 != 405) {
                        switch (h10) {
                            case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
                            case 301:
                                break;
                            case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.z(d0Var, "Expires", null, 2, null) == null && d0Var.b().c() == -1 && !d0Var.b().b() && !d0Var.b().a()) {
                    return false;
                }
            }
            return (d0Var.b().h() || b0Var.b().h()) ? false : true;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Date f5225a;

        /* renamed from: b  reason: collision with root package name */
        private String f5226b;

        /* renamed from: c  reason: collision with root package name */
        private Date f5227c;

        /* renamed from: d  reason: collision with root package name */
        private String f5228d;

        /* renamed from: e  reason: collision with root package name */
        private Date f5229e;

        /* renamed from: f  reason: collision with root package name */
        private long f5230f;

        /* renamed from: g  reason: collision with root package name */
        private long f5231g;

        /* renamed from: h  reason: collision with root package name */
        private String f5232h;

        /* renamed from: i  reason: collision with root package name */
        private int f5233i;

        /* renamed from: j  reason: collision with root package name */
        private final long f5234j;

        /* renamed from: k  reason: collision with root package name */
        private final b0 f5235k;

        /* renamed from: l  reason: collision with root package name */
        private final d0 f5236l;

        public b(long j10, b0 b0Var, d0 d0Var) {
            boolean l10;
            boolean l11;
            boolean l12;
            boolean l13;
            boolean l14;
            k.f(b0Var, "request");
            this.f5234j = j10;
            this.f5235k = b0Var;
            this.f5236l = d0Var;
            this.f5233i = -1;
            if (d0Var != null) {
                this.f5230f = d0Var.g0();
                this.f5231g = d0Var.Z();
                t A = d0Var.A();
                int size = A.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String c10 = A.c(i10);
                    String h10 = A.h(i10);
                    l10 = p.l(c10, "Date", true);
                    if (l10) {
                        this.f5225a = ef.c.a(h10);
                        this.f5226b = h10;
                    } else {
                        l11 = p.l(c10, "Expires", true);
                        if (l11) {
                            this.f5229e = ef.c.a(h10);
                        } else {
                            l12 = p.l(c10, "Last-Modified", true);
                            if (l12) {
                                this.f5227c = ef.c.a(h10);
                                this.f5228d = h10;
                            } else {
                                l13 = p.l(c10, "ETag", true);
                                if (l13) {
                                    this.f5232h = h10;
                                } else {
                                    l14 = p.l(c10, "Age", true);
                                    if (l14) {
                                        this.f5233i = ze.c.U(h10, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f5225a;
            long max = date != null ? Math.max(0L, this.f5231g - date.getTime()) : 0L;
            int i10 = this.f5233i;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f5231g;
            return max + (j10 - this.f5230f) + (this.f5234j - j10);
        }

        private final c c() {
            if (this.f5236l == null) {
                return new c(this.f5235k, null);
            }
            if (this.f5235k.g() && this.f5236l.q() == null) {
                return new c(this.f5235k, null);
            }
            if (!c.f5222c.a(this.f5236l, this.f5235k)) {
                return new c(this.f5235k, null);
            }
            ye.d b10 = this.f5235k.b();
            if (!b10.g() && !e(this.f5235k)) {
                ye.d b11 = this.f5236l.b();
                long a10 = a();
                long d10 = d();
                if (b10.c() != -1) {
                    d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.c()));
                }
                long j10 = 0;
                long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis(b10.e()) : 0L;
                if (!b11.f() && b10.d() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.d());
                }
                if (!b11.g()) {
                    long j11 = millis + a10;
                    if (j11 < j10 + d10) {
                        d0.a O = this.f5236l.O();
                        if (j11 >= d10) {
                            O.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a10 > 86400000 && f()) {
                            O.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, O.c());
                    }
                }
                String str = this.f5232h;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f5227c != null) {
                    str = this.f5228d;
                } else if (this.f5225a != null) {
                    str = this.f5226b;
                } else {
                    return new c(this.f5235k, null);
                }
                t.a e10 = this.f5235k.f().e();
                k.c(str);
                e10.c(str2, str);
                return new c(this.f5235k.i().f(e10.d()).b(), this.f5236l);
            }
            return new c(this.f5235k, null);
        }

        private final long d() {
            d0 d0Var = this.f5236l;
            k.c(d0Var);
            ye.d b10 = d0Var.b();
            if (b10.c() != -1) {
                return TimeUnit.SECONDS.toMillis(b10.c());
            }
            Date date = this.f5229e;
            if (date != null) {
                Date date2 = this.f5225a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f5231g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f5227c == null || this.f5236l.d0().l().n() != null) {
                return 0L;
            } else {
                Date date3 = this.f5225a;
                long time2 = date3 != null ? date3.getTime() : this.f5230f;
                Date date4 = this.f5227c;
                k.c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        private final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            d0 d0Var = this.f5236l;
            k.c(d0Var);
            return d0Var.b().c() == -1 && this.f5229e == null;
        }

        public final c b() {
            c c10 = c();
            return (c10.b() == null || !this.f5235k.b().i()) ? c10 : new c(null, null);
        }
    }

    public c(b0 b0Var, d0 d0Var) {
        this.f5223a = b0Var;
        this.f5224b = d0Var;
    }

    public final d0 a() {
        return this.f5224b;
    }

    public final b0 b() {
        return this.f5223a;
    }
}
