package q9;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import ea.l0;
import ea.n0;
import j8.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import w8.p;

/* compiled from: SsManifest.java */
/* loaded from: classes2.dex */
public class a implements h9.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public final int f35995a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35996b;

    /* renamed from: c  reason: collision with root package name */
    public final int f35997c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f35998d;

    /* renamed from: e  reason: collision with root package name */
    public final C0481a f35999e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f36000f;

    /* renamed from: g  reason: collision with root package name */
    public final long f36001g;

    /* renamed from: h  reason: collision with root package name */
    public final long f36002h;

    /* compiled from: SsManifest.java */
    /* renamed from: q9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0481a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f36003a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f36004b;

        /* renamed from: c  reason: collision with root package name */
        public final p[] f36005c;

        public C0481a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f36003a = uuid;
            this.f36004b = bArr;
            this.f36005c = pVarArr;
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, C0481a c0481a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : n0.O0(j11, 1000000L, j10), j12 != 0 ? n0.O0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0481a, bVarArr);
    }

    @Override // h9.a
    /* renamed from: b */
    public final a a(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f36000f[streamKey.f21272b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((p1[]) arrayList3.toArray(new p1[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f36015j[streamKey.f21273c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((p1[]) arrayList3.toArray(new p1[0])));
        }
        return new a(this.f35995a, this.f35996b, this.f36001g, this.f36002h, this.f35997c, this.f35998d, this.f35999e, (b[]) arrayList2.toArray(new b[0]));
    }

    /* compiled from: SsManifest.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f36006a;

        /* renamed from: b  reason: collision with root package name */
        public final String f36007b;

        /* renamed from: c  reason: collision with root package name */
        public final long f36008c;

        /* renamed from: d  reason: collision with root package name */
        public final String f36009d;

        /* renamed from: e  reason: collision with root package name */
        public final int f36010e;

        /* renamed from: f  reason: collision with root package name */
        public final int f36011f;

        /* renamed from: g  reason: collision with root package name */
        public final int f36012g;

        /* renamed from: h  reason: collision with root package name */
        public final int f36013h;

        /* renamed from: i  reason: collision with root package name */
        public final String f36014i;

        /* renamed from: j  reason: collision with root package name */
        public final p1[] f36015j;

        /* renamed from: k  reason: collision with root package name */
        public final int f36016k;

        /* renamed from: l  reason: collision with root package name */
        private final String f36017l;

        /* renamed from: m  reason: collision with root package name */
        private final String f36018m;

        /* renamed from: n  reason: collision with root package name */
        private final List<Long> f36019n;

        /* renamed from: o  reason: collision with root package name */
        private final long[] f36020o;

        /* renamed from: p  reason: collision with root package name */
        private final long f36021p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, Format[] formatArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, formatArr, list, n0.P0(list, 1000000L, j10), n0.O0(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            ea.a.f(this.f36015j != null);
            ea.a.f(this.f36019n != null);
            ea.a.f(i11 < this.f36019n.size());
            String num = Integer.toString(this.f36015j[i10].f32705h);
            String l10 = this.f36019n.get(i11).toString();
            return l0.e(this.f36017l, this.f36018m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        }

        public b b(p1[] p1VarArr) {
            return new b(this.f36017l, this.f36018m, this.f36006a, this.f36007b, this.f36008c, this.f36009d, this.f36010e, this.f36011f, this.f36012g, this.f36013h, this.f36014i, p1VarArr, this.f36019n, this.f36020o, this.f36021p);
        }

        public long c(int i10) {
            if (i10 == this.f36016k - 1) {
                return this.f36021p;
            }
            long[] jArr = this.f36020o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return n0.i(this.f36020o, j10, true, true);
        }

        public long e(int i10) {
            return this.f36020o[i10];
        }

        private b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j11) {
            this.f36017l = str;
            this.f36018m = str2;
            this.f36006a = i10;
            this.f36007b = str3;
            this.f36008c = j10;
            this.f36009d = str4;
            this.f36010e = i11;
            this.f36011f = i12;
            this.f36012g = i13;
            this.f36013h = i14;
            this.f36014i = str5;
            this.f36015j = formatArr;
            this.f36019n = list;
            this.f36020o = jArr;
            this.f36021p = j11;
            this.f36016k = list.size();
        }
    }

    private a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0481a c0481a, b[] bVarArr) {
        this.f35995a = i10;
        this.f35996b = i11;
        this.f36001g = j10;
        this.f36002h = j11;
        this.f35997c = i12;
        this.f35998d = z10;
        this.f35999e = c0481a;
        this.f36000f = bVarArr;
    }
}
