package j8;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import j8.g;
import j8.x1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import jb.s;

/* compiled from: MediaItem.java */
/* loaded from: classes2.dex */
public final class x1 implements j8.g {

    /* renamed from: f */
    public static final g.a<x1> f32818f;

    /* renamed from: a */
    public final String f32819a;

    /* renamed from: b */
    public final h f32820b;

    /* renamed from: c */
    public final g f32821c;

    /* renamed from: d */
    public final b2 f32822d;

    /* renamed from: e */
    public final d f32823e;

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        private String f32824a;

        /* renamed from: b */
        private Uri f32825b;

        /* renamed from: c */
        private String f32826c;

        /* renamed from: d */
        private d.a f32827d;

        /* renamed from: e */
        private f.a f32828e;

        /* renamed from: f */
        private List<StreamKey> f32829f;

        /* renamed from: g */
        private String f32830g;

        /* renamed from: h */
        private jb.s<k> f32831h;

        /* renamed from: i */
        private b f32832i;

        /* renamed from: j */
        private Object f32833j;

        /* renamed from: k */
        private b2 f32834k;

        /* renamed from: l */
        private g.a f32835l;

        public x1 a() {
            i iVar;
            ea.a.f(this.f32828e.f32857b == null || this.f32828e.f32856a != null);
            Uri uri = this.f32825b;
            if (uri != null) {
                iVar = new i(uri, this.f32826c, this.f32828e.f32856a != null ? this.f32828e.i() : null, this.f32832i, this.f32829f, this.f32830g, this.f32831h, this.f32833j);
            } else {
                iVar = null;
            }
            String str = this.f32824a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g10 = this.f32827d.g();
            g f10 = this.f32835l.f();
            b2 b2Var = this.f32834k;
            if (b2Var == null) {
                b2Var = b2.H;
            }
            return new x1(str2, g10, iVar, f10, b2Var);
        }

        public c b(String str) {
            this.f32830g = str;
            return this;
        }

        public c c(String str) {
            this.f32824a = (String) ea.a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.f32831h = jb.s.p(list);
            return this;
        }

        public c e(Object obj) {
            this.f32833j = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f32825b = uri;
            return this;
        }

        public c() {
            this.f32827d = new d.a();
            this.f32828e = new f.a();
            this.f32829f = Collections.emptyList();
            this.f32831h = jb.s.t();
            this.f32835l = new g.a();
        }

        private c(x1 x1Var) {
            this();
            f.a aVar;
            this.f32827d = x1Var.f32823e.b();
            this.f32824a = x1Var.f32819a;
            this.f32834k = x1Var.f32822d;
            this.f32835l = x1Var.f32821c.b();
            h hVar = x1Var.f32820b;
            if (hVar != null) {
                this.f32830g = hVar.f32881f;
                this.f32826c = hVar.f32877b;
                this.f32825b = hVar.f32876a;
                this.f32829f = hVar.f32880e;
                this.f32831h = hVar.f32882g;
                this.f32833j = hVar.f32883h;
                f fVar = hVar.f32878c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f32828e = aVar;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class d implements j8.g {

        /* renamed from: f */
        public static final g.a<e> f32836f;

        /* renamed from: a */
        public final long f32837a;

        /* renamed from: b */
        public final long f32838b;

        /* renamed from: c */
        public final boolean f32839c;

        /* renamed from: d */
        public final boolean f32840d;

        /* renamed from: e */
        public final boolean f32841e;

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private long f32842a;

            /* renamed from: b */
            private long f32843b;

            /* renamed from: c */
            private boolean f32844c;

            /* renamed from: d */
            private boolean f32845d;

            /* renamed from: e */
            private boolean f32846e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                ea.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f32843b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f32845d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f32844c = z10;
                return this;
            }

            public a k(long j10) {
                ea.a.a(j10 >= 0);
                this.f32842a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f32846e = z10;
                return this;
            }

            public a() {
                this.f32843b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f32842a = dVar.f32837a;
                this.f32843b = dVar.f32838b;
                this.f32844c = dVar.f32839c;
                this.f32845d = dVar.f32840d;
                this.f32846e = dVar.f32841e;
            }
        }

        static {
            new a().f();
            f32836f = new g.a() { // from class: j8.y1
                @Override // j8.g.a
                public final g a(Bundle bundle) {
                    return x1.d.a(bundle);
                }
            };
        }

        public static /* synthetic */ e a(Bundle bundle) {
            return d(bundle);
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ e d(Bundle bundle) {
            return new a().k(bundle.getLong(c(0), 0L)).h(bundle.getLong(c(1), Long.MIN_VALUE)).j(bundle.getBoolean(c(2), false)).i(bundle.getBoolean(c(3), false)).l(bundle.getBoolean(c(4), false)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f32837a == dVar.f32837a && this.f32838b == dVar.f32838b && this.f32839c == dVar.f32839c && this.f32840d == dVar.f32840d && this.f32841e == dVar.f32841e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f32837a;
            long j11 = this.f32838b;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f32839c ? 1 : 0)) * 31) + (this.f32840d ? 1 : 0)) * 31) + (this.f32841e ? 1 : 0);
        }

        private d(a aVar) {
            this.f32837a = aVar.f32842a;
            this.f32838b = aVar.f32843b;
            this.f32839c = aVar.f32844c;
            this.f32840d = aVar.f32845d;
            this.f32841e = aVar.f32846e;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class e extends d {

        /* renamed from: g */
        public static final e f32847g = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a */
        public final UUID f32848a;

        /* renamed from: b */
        public final Uri f32849b;

        /* renamed from: c */
        public final jb.t<String, String> f32850c;

        /* renamed from: d */
        public final boolean f32851d;

        /* renamed from: e */
        public final boolean f32852e;

        /* renamed from: f */
        public final boolean f32853f;

        /* renamed from: g */
        public final jb.s<Integer> f32854g;

        /* renamed from: h */
        private final byte[] f32855h;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f32855h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f32848a.equals(fVar.f32848a) && ea.n0.c(this.f32849b, fVar.f32849b) && ea.n0.c(this.f32850c, fVar.f32850c) && this.f32851d == fVar.f32851d && this.f32853f == fVar.f32853f && this.f32852e == fVar.f32852e && this.f32854g.equals(fVar.f32854g) && Arrays.equals(this.f32855h, fVar.f32855h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f32848a.hashCode() * 31;
            Uri uri = this.f32849b;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f32850c.hashCode()) * 31) + (this.f32851d ? 1 : 0)) * 31) + (this.f32853f ? 1 : 0)) * 31) + (this.f32852e ? 1 : 0)) * 31) + this.f32854g.hashCode()) * 31) + Arrays.hashCode(this.f32855h);
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private UUID f32856a;

            /* renamed from: b */
            private Uri f32857b;

            /* renamed from: c */
            private jb.t<String, String> f32858c;

            /* renamed from: d */
            private boolean f32859d;

            /* renamed from: e */
            private boolean f32860e;

            /* renamed from: f */
            private boolean f32861f;

            /* renamed from: g */
            private jb.s<Integer> f32862g;

            /* renamed from: h */
            private byte[] f32863h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f32858c = jb.t.k();
                this.f32862g = jb.s.t();
            }

            private a(f fVar) {
                this.f32856a = fVar.f32848a;
                this.f32857b = fVar.f32849b;
                this.f32858c = fVar.f32850c;
                this.f32859d = fVar.f32851d;
                this.f32860e = fVar.f32852e;
                this.f32861f = fVar.f32853f;
                this.f32862g = fVar.f32854g;
                this.f32863h = fVar.f32855h;
            }
        }

        private f(a aVar) {
            ea.a.f((aVar.f32861f && aVar.f32857b == null) ? false : true);
            this.f32848a = (UUID) ea.a.e(aVar.f32856a);
            this.f32849b = aVar.f32857b;
            jb.t unused = aVar.f32858c;
            this.f32850c = aVar.f32858c;
            this.f32851d = aVar.f32859d;
            this.f32853f = aVar.f32861f;
            this.f32852e = aVar.f32860e;
            jb.s unused2 = aVar.f32862g;
            this.f32854g = aVar.f32862g;
            this.f32855h = aVar.f32863h != null ? Arrays.copyOf(aVar.f32863h, aVar.f32863h.length) : null;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static final class g implements j8.g {

        /* renamed from: f */
        public static final g f32864f = new a().f();

        /* renamed from: g */
        public static final g.a<g> f32865g = new g.a() { // from class: j8.z1
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return x1.g.a(bundle);
            }
        };

        /* renamed from: a */
        public final long f32866a;

        /* renamed from: b */
        public final long f32867b;

        /* renamed from: c */
        public final long f32868c;

        /* renamed from: d */
        public final float f32869d;

        /* renamed from: e */
        public final float f32870e;

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private long f32871a;

            /* renamed from: b */
            private long f32872b;

            /* renamed from: c */
            private long f32873c;

            /* renamed from: d */
            private float f32874d;

            /* renamed from: e */
            private float f32875e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f32873c = j10;
                return this;
            }

            public a h(float f10) {
                this.f32875e = f10;
                return this;
            }

            public a i(long j10) {
                this.f32872b = j10;
                return this;
            }

            public a j(float f10) {
                this.f32874d = f10;
                return this;
            }

            public a k(long j10) {
                this.f32871a = j10;
                return this;
            }

            public a() {
                this.f32871a = -9223372036854775807L;
                this.f32872b = -9223372036854775807L;
                this.f32873c = -9223372036854775807L;
                this.f32874d = -3.4028235E38f;
                this.f32875e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f32871a = gVar.f32866a;
                this.f32872b = gVar.f32867b;
                this.f32873c = gVar.f32868c;
                this.f32874d = gVar.f32869d;
                this.f32875e = gVar.f32870e;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            return d(bundle);
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f32866a == gVar.f32866a && this.f32867b == gVar.f32867b && this.f32868c == gVar.f32868c && this.f32869d == gVar.f32869d && this.f32870e == gVar.f32870e;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f32866a;
            long j11 = this.f32867b;
            long j12 = this.f32868c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            float f10 = this.f32869d;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f32870e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f32871a, aVar.f32872b, aVar.f32873c, aVar.f32874d, aVar.f32875e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f32866a = j10;
            this.f32867b = j11;
            this.f32868c = j12;
            this.f32869d = f10;
            this.f32870e = f11;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a */
        public final Uri f32876a;

        /* renamed from: b */
        public final String f32877b;

        /* renamed from: c */
        public final f f32878c;

        /* renamed from: d */
        public final b f32879d;

        /* renamed from: e */
        public final List<StreamKey> f32880e;

        /* renamed from: f */
        public final String f32881f;

        /* renamed from: g */
        public final jb.s<k> f32882g;

        /* renamed from: h */
        public final Object f32883h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f32876a.equals(hVar.f32876a) && ea.n0.c(this.f32877b, hVar.f32877b) && ea.n0.c(this.f32878c, hVar.f32878c) && ea.n0.c(this.f32879d, hVar.f32879d) && this.f32880e.equals(hVar.f32880e) && ea.n0.c(this.f32881f, hVar.f32881f) && this.f32882g.equals(hVar.f32882g) && ea.n0.c(this.f32883h, hVar.f32883h);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f32876a.hashCode() * 31;
            String str = this.f32877b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f32878c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f32880e.hashCode()) * 31;
            String str2 = this.f32881f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f32882g.hashCode()) * 31;
            Object obj = this.f32883h;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<StreamKey> list, String str2, jb.s<k> sVar, Object obj) {
            this.f32876a = uri;
            this.f32877b = str;
            this.f32878c = fVar;
            this.f32880e = list;
            this.f32881f = str2;
            this.f32882g = sVar;
            s.a n10 = jb.s.n();
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                n10.a(sVar.get(i10).a().j());
            }
            n10.h();
            this.f32883h = obj;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<StreamKey> list, String str2, jb.s<k> sVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, sVar, obj);
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes2.dex */
    public static class k {

        /* renamed from: a */
        public final Uri f32884a;

        /* renamed from: b */
        public final String f32885b;

        /* renamed from: c */
        public final String f32886c;

        /* renamed from: d */
        public final int f32887d;

        /* renamed from: e */
        public final int f32888e;

        /* renamed from: f */
        public final String f32889f;

        /* renamed from: g */
        public final String f32890g;

        /* compiled from: MediaItem.java */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a */
            private Uri f32891a;

            /* renamed from: b */
            private String f32892b;

            /* renamed from: c */
            private String f32893c;

            /* renamed from: d */
            private int f32894d;

            /* renamed from: e */
            private int f32895e;

            /* renamed from: f */
            private String f32896f;

            /* renamed from: g */
            private String f32897g;

            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.f32896f = str;
                return this;
            }

            public a l(String str) {
                this.f32893c = str;
                return this;
            }

            public a m(String str) {
                this.f32892b = str;
                return this;
            }

            public a n(int i10) {
                this.f32895e = i10;
                return this;
            }

            public a o(int i10) {
                this.f32894d = i10;
                return this;
            }

            public a(Uri uri) {
                this.f32891a = uri;
            }

            private a(k kVar) {
                this.f32891a = kVar.f32884a;
                this.f32892b = kVar.f32885b;
                this.f32893c = kVar.f32886c;
                this.f32894d = kVar.f32887d;
                this.f32895e = kVar.f32888e;
                this.f32896f = kVar.f32889f;
                this.f32897g = kVar.f32890g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.f32884a.equals(kVar.f32884a) && ea.n0.c(this.f32885b, kVar.f32885b) && ea.n0.c(this.f32886c, kVar.f32886c) && this.f32887d == kVar.f32887d && this.f32888e == kVar.f32888e && ea.n0.c(this.f32889f, kVar.f32889f) && ea.n0.c(this.f32890g, kVar.f32890g);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f32884a.hashCode() * 31;
            String str = this.f32885b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f32886c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f32887d) * 31) + this.f32888e) * 31;
            String str3 = this.f32889f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f32890g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f32884a = aVar.f32891a;
            this.f32885b = aVar.f32892b;
            this.f32886c = aVar.f32893c;
            this.f32887d = aVar.f32894d;
            this.f32888e = aVar.f32895e;
            this.f32889f = aVar.f32896f;
            this.f32890g = aVar.f32897g;
        }
    }

    static {
        new c().a();
        f32818f = new g.a() { // from class: j8.w1
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return x1.a(bundle);
            }
        };
    }

    public static /* synthetic */ x1 a(Bundle bundle) {
        return c(bundle);
    }

    public static x1 c(Bundle bundle) {
        g a10;
        b2 a11;
        e a12;
        String str = (String) ea.a.e(bundle.getString(e(0), ""));
        Bundle bundle2 = bundle.getBundle(e(1));
        if (bundle2 == null) {
            a10 = g.f32864f;
        } else {
            a10 = g.f32865g.a(bundle2);
        }
        g gVar = a10;
        Bundle bundle3 = bundle.getBundle(e(2));
        if (bundle3 == null) {
            a11 = b2.H;
        } else {
            a11 = b2.I.a(bundle3);
        }
        b2 b2Var = a11;
        Bundle bundle4 = bundle.getBundle(e(3));
        if (bundle4 == null) {
            a12 = e.f32847g;
        } else {
            a12 = d.f32836f.a(bundle4);
        }
        return new x1(str, a12, null, gVar, b2Var);
    }

    public static x1 d(Uri uri) {
        return new c().f(uri).a();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            return ea.n0.c(this.f32819a, x1Var.f32819a) && this.f32823e.equals(x1Var.f32823e) && ea.n0.c(this.f32820b, x1Var.f32820b) && ea.n0.c(this.f32821c, x1Var.f32821c) && ea.n0.c(this.f32822d, x1Var.f32822d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f32819a.hashCode() * 31;
        h hVar = this.f32820b;
        return ((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f32821c.hashCode()) * 31) + this.f32823e.hashCode()) * 31) + this.f32822d.hashCode();
    }

    private x1(String str, e eVar, i iVar, g gVar, b2 b2Var) {
        this.f32819a = str;
        this.f32820b = iVar;
        this.f32821c = gVar;
        this.f32822d = b2Var;
        this.f32823e = eVar;
    }
}
