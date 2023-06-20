package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v;
import com.inmobi.media.fq;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e implements v.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f18817a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.fyber.inneractive.sdk.player.exoplayer2.i> f18818b;

    public e(int i10, List<com.fyber.inneractive.sdk.player.exoplayer2.i> list) {
        this.f18817a = i10;
        if (!a(32) && list.isEmpty()) {
            list = Collections.singletonList(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
        }
        this.f18818b = list;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v.c
    public SparseArray<v> a() {
        return new SparseArray<>();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v.c
    public v a(int i10, v.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new o(new m(bVar.f19012a));
            }
            if (i10 == 15) {
                if (a(2)) {
                    return null;
                }
                return new o(new d(false, bVar.f19012a));
            } else if (i10 != 21) {
                if (i10 == 27) {
                    if (a(4)) {
                        return null;
                    }
                    return new o(new j(a(bVar), a(1), a(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 129) {
                                if (i10 != 130) {
                                    if (i10 == 134) {
                                        if (a(16)) {
                                            return null;
                                        }
                                        return new r(new t());
                                    } else if (i10 != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new o(new b(bVar.f19012a));
                        }
                        return new o(new f(bVar.f19012a));
                    }
                    return new o(new g(bVar.f19013b));
                } else {
                    return new o(new k(a(bVar)));
                }
            } else {
                return new o(new l());
            }
        }
        return new o(new i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final s a(v.b bVar) {
        String str;
        int i10;
        if (a(32)) {
            return new s(this.f18818b);
        }
        byte[] bArr = bVar.f19014c;
        int length = bArr.length;
        int i11 = 0;
        ArrayList arrayList = this.f18818b;
        while (length - i11 > 0) {
            int i12 = i11 + 1;
            int i13 = bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int i14 = i12 + 1;
            int i15 = (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + i14;
            boolean z10 = true;
            if (i13 == 134) {
                arrayList = new ArrayList();
                int i16 = i14 + 1;
                int i17 = bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED & 31;
                for (int i18 = 0; i18 < i17; i18++) {
                    String str2 = new String(bArr, i16, 3, Charset.defaultCharset());
                    int i19 = i16 + 3;
                    int i20 = i19 + 1;
                    int i21 = bArr[i19] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                    if ((i21 & 128) != 0) {
                        i10 = i21 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    arrayList.add(com.fyber.inneractive.sdk.player.exoplayer2.i.a(null, str, null, -1, 0, str2, i10, null, Long.MAX_VALUE, Collections.emptyList()));
                    i16 = i20 + 2;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(i16 >= 0 && i16 <= length);
                }
            }
            if (i15 < 0 || i15 > length) {
                z10 = false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10);
            i11 = i15;
            arrayList = arrayList;
        }
        return new s(arrayList);
    }

    public final boolean a(int i10) {
        return (i10 & this.f18817a) != 0;
    }
}
