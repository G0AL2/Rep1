package j9;

import android.net.Uri;
import android.os.Bundle;
import ea.n0;
import j8.g;
import j9.c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: AdPlaybackState.java */
/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: g */
    public static final c f32908g = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h */
    private static final a f32909h = new a(0).j(0);

    /* renamed from: i */
    public static final g.a<c> f32910i = new g.a() { // from class: j9.a
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return c.a(bundle);
        }
    };

    /* renamed from: a */
    public final Object f32911a;

    /* renamed from: b */
    public final int f32912b;

    /* renamed from: c */
    public final long f32913c;

    /* renamed from: d */
    public final long f32914d;

    /* renamed from: e */
    public final int f32915e;

    /* renamed from: f */
    private final a[] f32916f;

    /* compiled from: AdPlaybackState.java */
    /* loaded from: classes2.dex */
    public static final class a implements g {

        /* renamed from: h */
        public static final g.a<a> f32917h = new g.a() { // from class: j9.b
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return c.a.a(bundle);
            }
        };

        /* renamed from: a */
        public final long f32918a;

        /* renamed from: b */
        public final int f32919b;

        /* renamed from: c */
        public final Uri[] f32920c;

        /* renamed from: d */
        public final int[] f32921d;

        /* renamed from: e */
        public final long[] f32922e;

        /* renamed from: f */
        public final long f32923f;

        /* renamed from: g */
        public final boolean f32924g;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static /* synthetic */ a a(Bundle bundle) {
            return d(bundle);
        }

        private static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static a d(Bundle bundle) {
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32918a == aVar.f32918a && this.f32919b == aVar.f32919b && Arrays.equals(this.f32920c, aVar.f32920c) && Arrays.equals(this.f32921d, aVar.f32921d) && Arrays.equals(this.f32922e, aVar.f32922e) && this.f32923f == aVar.f32923f && this.f32924g == aVar.f32924g;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.f32921d;
                if (i11 >= iArr.length || this.f32924g || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f32919b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f32919b; i10++) {
                int[] iArr = this.f32921d;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f32918a;
            long j11 = this.f32923f;
            return (((((((((((this.f32919b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f32920c)) * 31) + Arrays.hashCode(this.f32921d)) * 31) + Arrays.hashCode(this.f32922e)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f32924g ? 1 : 0);
        }

        public boolean i() {
            return this.f32919b == -1 || e() < this.f32919b;
        }

        public a j(int i10) {
            int[] c10 = c(this.f32921d, i10);
            long[] b10 = b(this.f32922e, i10);
            return new a(this.f32918a, i10, c10, (Uri[]) Arrays.copyOf(this.f32920c, i10), b10, this.f32923f, this.f32924g);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            ea.a.a(iArr.length == uriArr.length);
            this.f32918a = j10;
            this.f32919b = i10;
            this.f32921d = iArr;
            this.f32920c = uriArr;
            this.f32922e = jArr;
            this.f32923f = j11;
            this.f32924g = z10;
        }
    }

    private c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f32911a = obj;
        this.f32913c = j10;
        this.f32914d = j11;
        this.f32912b = aVarArr.length + i10;
        this.f32916f = aVarArr;
        this.f32915e = i10;
    }

    public static /* synthetic */ c a(Bundle bundle) {
        return b(bundle);
    }

    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.f32917h.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    private boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f32918a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    private static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(int i10) {
        int i11 = this.f32915e;
        if (i10 < i11) {
            return f32909h;
        }
        return this.f32916f[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 != Long.MIN_VALUE) {
            if (j11 == -9223372036854775807L || j10 < j11) {
                int i10 = this.f32915e;
                while (i10 < this.f32912b && ((c(i10).f32918a != Long.MIN_VALUE && c(i10).f32918a <= j10) || !c(i10).i())) {
                    i10++;
                }
                if (i10 < this.f32912b) {
                    return i10;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f32912b - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return n0.c(this.f32911a, cVar.f32911a) && this.f32912b == cVar.f32912b && this.f32913c == cVar.f32913c && this.f32914d == cVar.f32914d && this.f32915e == cVar.f32915e && Arrays.equals(this.f32916f, cVar.f32916f);
    }

    public int hashCode() {
        int i10 = this.f32912b * 31;
        Object obj = this.f32911a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f32913c)) * 31) + ((int) this.f32914d)) * 31) + this.f32915e) * 31) + Arrays.hashCode(this.f32916f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f32911a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f32913c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f32916f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f32916f[i10].f32918a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f32916f[i10].f32921d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f32916f[i10].f32921d[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f32916f[i10].f32922e[i11]);
                sb2.append(')');
                if (i11 < this.f32916f[i10].f32921d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f32916f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
