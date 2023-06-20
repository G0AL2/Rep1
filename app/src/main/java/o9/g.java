package o9;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jb.s;
import jb.t;
import jb.v;

/* compiled from: HlsMediaPlaylist.java */
/* loaded from: classes2.dex */
public final class g extends i {

    /* renamed from: d  reason: collision with root package name */
    public final int f35069d;

    /* renamed from: e  reason: collision with root package name */
    public final long f35070e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f35071f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f35072g;

    /* renamed from: h  reason: collision with root package name */
    public final long f35073h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f35074i;

    /* renamed from: j  reason: collision with root package name */
    public final int f35075j;

    /* renamed from: k  reason: collision with root package name */
    public final long f35076k;

    /* renamed from: l  reason: collision with root package name */
    public final int f35077l;

    /* renamed from: m  reason: collision with root package name */
    public final long f35078m;

    /* renamed from: n  reason: collision with root package name */
    public final long f35079n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f35080o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f35081p;

    /* renamed from: q  reason: collision with root package name */
    public final DrmInitData f35082q;

    /* renamed from: r  reason: collision with root package name */
    public final List<d> f35083r;

    /* renamed from: s  reason: collision with root package name */
    public final List<b> f35084s;

    /* renamed from: t  reason: collision with root package name */
    public final Map<Uri, c> f35085t;

    /* renamed from: u  reason: collision with root package name */
    public final long f35086u;

    /* renamed from: v  reason: collision with root package name */
    public final f f35087v;

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class b extends e {

        /* renamed from: l  reason: collision with root package name */
        public final boolean f35088l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f35089m;

        public b(String str, d dVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, dVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f35088l = z11;
            this.f35089m = z12;
        }

        public b b(long j10, int i10) {
            return new b(this.f35095a, this.f35096b, this.f35097c, i10, j10, this.f35100f, this.f35101g, this.f35102h, this.f35103i, this.f35104j, this.f35105k, this.f35088l, this.f35089m);
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f35090a;

        /* renamed from: b  reason: collision with root package name */
        public final long f35091b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35092c;

        public c(Uri uri, long j10, int i10) {
            this.f35090a = uri;
            this.f35091b = j10;
            this.f35092c = i10;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static class e implements Comparable<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final String f35095a;

        /* renamed from: b  reason: collision with root package name */
        public final d f35096b;

        /* renamed from: c  reason: collision with root package name */
        public final long f35097c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35098d;

        /* renamed from: e  reason: collision with root package name */
        public final long f35099e;

        /* renamed from: f  reason: collision with root package name */
        public final DrmInitData f35100f;

        /* renamed from: g  reason: collision with root package name */
        public final String f35101g;

        /* renamed from: h  reason: collision with root package name */
        public final String f35102h;

        /* renamed from: i  reason: collision with root package name */
        public final long f35103i;

        /* renamed from: j  reason: collision with root package name */
        public final long f35104j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f35105k;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l10) {
            if (this.f35099e > l10.longValue()) {
                return 1;
            }
            return this.f35099e < l10.longValue() ? -1 : 0;
        }

        private e(String str, d dVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f35095a = str;
            this.f35096b = dVar;
            this.f35097c = j10;
            this.f35098d = i10;
            this.f35099e = j11;
            this.f35100f = drmInitData;
            this.f35101g = str2;
            this.f35102h = str3;
            this.f35103i = j12;
            this.f35104j = j13;
            this.f35105k = z10;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f35106a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f35107b;

        /* renamed from: c  reason: collision with root package name */
        public final long f35108c;

        /* renamed from: d  reason: collision with root package name */
        public final long f35109d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f35110e;

        public f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f35106a = j10;
            this.f35107b = z10;
            this.f35108c = j11;
            this.f35109d = j12;
            this.f35110e = z11;
        }
    }

    public g(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z12);
        this.f35069d = i10;
        this.f35073h = j11;
        this.f35072g = z10;
        this.f35074i = z11;
        this.f35075j = i11;
        this.f35076k = j12;
        this.f35077l = i12;
        this.f35078m = j13;
        this.f35079n = j14;
        this.f35080o = z13;
        this.f35081p = z14;
        this.f35082q = drmInitData;
        this.f35083r = s.p(list2);
        this.f35084s = s.p(list3);
        this.f35085t = t.d(map);
        if (!list3.isEmpty()) {
            b bVar = (b) v.c(list3);
            this.f35086u = bVar.f35099e + bVar.f35097c;
        } else if (!list2.isEmpty()) {
            d dVar = (d) v.c(list2);
            this.f35086u = dVar.f35099e + dVar.f35097c;
        } else {
            this.f35086u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f35086u, j10);
            } else {
                j15 = Math.max(0L, this.f35086u + j10);
            }
        }
        this.f35070e = j15;
        this.f35071f = j10 >= 0;
        this.f35087v = fVar;
    }

    @Override // h9.a
    /* renamed from: b */
    public g a(List<StreamKey> list) {
        return this;
    }

    public g c(long j10, int i10) {
        return new g(this.f35069d, this.f35131a, this.f35132b, this.f35070e, this.f35072g, j10, true, i10, this.f35076k, this.f35077l, this.f35078m, this.f35079n, this.f35133c, this.f35080o, this.f35081p, this.f35082q, this.f35083r, this.f35084s, this.f35087v, this.f35085t);
    }

    public g d() {
        return this.f35080o ? this : new g(this.f35069d, this.f35131a, this.f35132b, this.f35070e, this.f35072g, this.f35073h, this.f35074i, this.f35075j, this.f35076k, this.f35077l, this.f35078m, this.f35079n, this.f35133c, true, this.f35081p, this.f35082q, this.f35083r, this.f35084s, this.f35087v, this.f35085t);
    }

    public long e() {
        return this.f35073h + this.f35086u;
    }

    public boolean f(g gVar) {
        if (gVar != null) {
            long j10 = this.f35076k;
            long j11 = gVar.f35076k;
            if (j10 > j11) {
                return true;
            }
            if (j10 < j11) {
                return false;
            }
            int size = this.f35083r.size() - gVar.f35083r.size();
            if (size != 0) {
                return size > 0;
            }
            int size2 = this.f35084s.size();
            int size3 = gVar.f35084s.size();
            if (size2 <= size3) {
                return size2 == size3 && this.f35080o && !gVar.f35080o;
            }
            return true;
        }
        return true;
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes2.dex */
    public static final class d extends e {

        /* renamed from: l  reason: collision with root package name */
        public final String f35093l;

        /* renamed from: m  reason: collision with root package name */
        public final List<b> f35094m;

        public d(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, s.t());
        }

        public d b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f35094m.size(); i11++) {
                b bVar = this.f35094m.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f35097c;
            }
            return new d(this.f35095a, this.f35096b, this.f35093l, this.f35097c, i10, j10, this.f35100f, this.f35101g, this.f35102h, this.f35103i, this.f35104j, this.f35105k, arrayList);
        }

        public d(String str, d dVar, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, dVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f35093l = str2;
            this.f35094m = s.p(list);
        }
    }
}
