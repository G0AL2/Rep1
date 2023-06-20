package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements m, j.b, e.b {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f18254a;

    /* renamed from: b  reason: collision with root package name */
    public final d f18255b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18256c;

    /* renamed from: d  reason: collision with root package name */
    public final f.a f18257d;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f18258e;

    /* renamed from: f  reason: collision with root package name */
    public final IdentityHashMap<o, Integer> f18259f = new IdentityHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final k f18260g = new k();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f18261h = new Handler();

    /* renamed from: i  reason: collision with root package name */
    public final long f18262i;

    /* renamed from: j  reason: collision with root package name */
    public m.a f18263j;

    /* renamed from: k  reason: collision with root package name */
    public int f18264k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f18265l;

    /* renamed from: m  reason: collision with root package name */
    public s f18266m;

    /* renamed from: n  reason: collision with root package name */
    public j[] f18267n;

    /* renamed from: o  reason: collision with root package name */
    public j[] f18268o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f18269p;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e eVar, d dVar, int i10, f.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        this.f18254a = eVar;
        this.f18255b = dVar;
        this.f18256c = i10;
        this.f18257d = aVar;
        this.f18258e = bVar;
        this.f18262i = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void a(m.a aVar) {
        this.f18254a.f18375h.add(this);
        this.f18263j = aVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = this.f18254a.f18378k;
        ArrayList arrayList = new ArrayList(aVar2.f18312b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a.C0250a c0250a = (a.C0250a) arrayList.get(i10);
            if (c0250a.f18318b.f19124k <= 0 && !a(c0250a, "avc")) {
                if (a(c0250a, "mp4a")) {
                    arrayList3.add(c0250a);
                }
            } else {
                arrayList2.add(c0250a);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<a.C0250a> list = aVar2.f18313c;
        List<a.C0250a> list2 = aVar2.f18314d;
        int size = list.size() + 1 + list2.size();
        this.f18267n = new j[size];
        this.f18264k = size;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(!arrayList.isEmpty());
        a.C0250a[] c0250aArr = new a.C0250a[arrayList.size()];
        arrayList.toArray(c0250aArr);
        j a10 = a(0, c0250aArr, aVar2.f18315e, aVar2.f18316f);
        this.f18267n[0] = a10;
        a10.f18279c.f18222h = true;
        a10.g();
        int i11 = 0;
        int i12 = 1;
        while (i11 < list.size()) {
            j a11 = a(1, new a.C0250a[]{list.get(i11)}, null, Collections.emptyList());
            this.f18267n[i12] = a11;
            a11.g();
            i11++;
            i12++;
        }
        int i13 = 0;
        while (i13 < list2.size()) {
            a.C0250a c0250a2 = list2.get(i13);
            j a12 = a(3, new a.C0250a[]{c0250a2}, null, Collections.emptyList());
            a12.a(0).a(c0250a2.f18318b);
            a12.f18290n = true;
            a12.i();
            this.f18267n[i12] = a12;
            i13++;
            i12++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public s b() {
        return this.f18266m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e.b
    public void c() {
        g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void c(long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long d() {
        j[] jVarArr;
        long j10;
        LinkedList<f> linkedList;
        long j11 = Long.MAX_VALUE;
        for (j jVar : this.f18268o) {
            if (jVar.f18301y) {
                j10 = Long.MIN_VALUE;
            } else if (jVar.h()) {
                j10 = jVar.f18300x;
            } else {
                long j12 = jVar.f18299w;
                f last = jVar.f18287k.getLast();
                if (!last.F) {
                    last = jVar.f18287k.size() > 1 ? jVar.f18287k.get(linkedList.size() - 2) : null;
                }
                if (last != null) {
                    j12 = Math.max(j12, last.f19249g);
                }
                int size = jVar.f18286j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    j12 = Math.max(j12, jVar.f18286j.valueAt(i10).d());
                }
                j10 = j12;
            }
            if (j10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, j10);
            }
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public void e() throws IOException {
        j[] jVarArr = this.f18267n;
        if (jVarArr != null) {
            for (j jVar : jVarArr) {
                jVar.j();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long f() {
        return -9223372036854775807L;
    }

    public final void g() {
        if (this.f18266m != null) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.f18263j).a((p) this);
            return;
        }
        for (j jVar : this.f18267n) {
            jVar.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long b(long j10) {
        this.f18260g.f18303a.clear();
        for (j jVar : this.f18268o) {
            jVar.d(j10);
        }
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr, boolean[] zArr, o[] oVarArr, boolean[] zArr2, long j10) {
        long j11;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            iArr[i10] = oVarArr[i10] == null ? -1 : this.f18259f.get(oVarArr[i10]).intValue();
            iArr2[i10] = -1;
            if (eVarArr[i10] != null) {
                r b10 = eVarArr[i10].b();
                int i11 = 0;
                while (true) {
                    j[] jVarArr = this.f18267n;
                    if (i11 >= jVarArr.length) {
                        break;
                    } else if (jVarArr[i11].f18296t.a(b10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f18259f.clear();
        int length = eVarArr.length;
        o[] oVarArr2 = new o[length];
        o[] oVarArr3 = new o[eVarArr.length];
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[eVarArr.length];
        ArrayList arrayList = new ArrayList(this.f18267n.length);
        int i12 = 0;
        boolean z10 = false;
        while (i12 < this.f18267n.length) {
            for (int i13 = 0; i13 < eVarArr.length; i13++) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar = null;
                oVarArr3[i13] = iArr[i13] == i12 ? oVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    eVar = eVarArr[i13];
                }
                eVarArr2[i13] = eVar;
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] eVarArr3 = eVarArr2;
            z10 |= this.f18267n[i12].a(eVarArr2, zArr, oVarArr3, zArr2, !this.f18265l);
            boolean z11 = false;
            for (int i15 = 0; i15 < eVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(oVarArr3[i15] != null);
                    oVarArr2[i15] = oVarArr3[i15];
                    this.f18259f.put(oVarArr3[i15], Integer.valueOf(i14));
                    z11 = true;
                } else if (iArr[i15] == i14) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(oVarArr3[i15] == null);
                }
            }
            if (z11) {
                arrayList2.add(this.f18267n[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            eVarArr2 = eVarArr3;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oVarArr2, 0, oVarArr, 0, length);
        j[] jVarArr2 = new j[arrayList3.size()];
        this.f18268o = jVarArr2;
        arrayList3.toArray(jVarArr2);
        j[] jVarArr3 = this.f18268o;
        if (jVarArr3.length > 0) {
            jVarArr3[0].f18279c.f18222h = true;
            int i16 = 1;
            while (true) {
                j[] jVarArr4 = this.f18268o;
                if (i16 >= jVarArr4.length) {
                    break;
                }
                jVarArr4[i16].f18279c.f18222h = false;
                i16++;
            }
        }
        this.f18269p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f18268o);
        if (this.f18265l && z10) {
            j11 = j10;
            b(j11);
            for (int i17 = 0; i17 < eVarArr.length; i17++) {
                if (oVarArr[i17] != null) {
                    zArr2[i17] = true;
                }
            }
        } else {
            j11 = j10;
        }
        this.f18265l = true;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public boolean a(long j10) {
        return this.f18269p.a(j10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.m, com.fyber.inneractive.sdk.player.exoplayer2.source.p
    public long a() {
        return this.f18269p.a();
    }

    public void a(p pVar) {
        if (this.f18266m == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.h) this.f18263j).a((p) this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e.b
    public void a(a.C0250a c0250a, long j10) {
        int c10;
        for (j jVar : this.f18267n) {
            c cVar = jVar.f18279c;
            int a10 = cVar.f18220f.a(c0250a.f18318b);
            if (a10 != -1 && (c10 = cVar.f18230p.c(a10)) != -1) {
                cVar.f18230p.a(c10, j10);
            }
        }
        g();
    }

    public final j a(int i10, a.C0250a[] c0250aArr, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        return new j(i10, this, new c(this.f18254a, c0250aArr, this.f18255b, this.f18260g, list), this.f18258e, this.f18262i, iVar, this.f18256c, this.f18257d);
    }

    public static boolean a(a.C0250a c0250a, String str) {
        String str2 = c0250a.f18318b.f19116c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (str3.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
