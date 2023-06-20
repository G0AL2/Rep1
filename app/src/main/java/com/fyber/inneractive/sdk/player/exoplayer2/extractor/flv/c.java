package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public long f18203b;

    public c(n nVar) {
        super(null);
        this.f18203b = -9223372036854775807L;
    }

    public static Object a(k kVar, int i10) {
        if (i10 == 8) {
            return b(kVar);
        }
        if (i10 == 10) {
            int o10 = kVar.o();
            ArrayList arrayList = new ArrayList(o10);
            for (int i11 = 0; i11 < o10; i11++) {
                arrayList.add(a(kVar, kVar.l()));
            }
            return arrayList;
        } else if (i10 == 11) {
            Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(kVar.i())).doubleValue());
            kVar.f(2);
            return date;
        } else if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(kVar.i()));
        } else {
            if (i10 == 1) {
                return Boolean.valueOf(kVar.l() == 1);
            } else if (i10 == 2) {
                int q10 = kVar.q();
                int i12 = kVar.f19580b;
                kVar.f(q10);
                return new String(kVar.f19579a, i12, q10);
            } else if (i10 != 3) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    int q11 = kVar.q();
                    int i13 = kVar.f19580b;
                    kVar.f(q11);
                    String str = new String(kVar.f19579a, i13, q11);
                    int l10 = kVar.l();
                    if (l10 == 9) {
                        return hashMap;
                    }
                    hashMap.put(str, a(kVar, l10));
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public boolean a(k kVar) {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.d
    public void b(k kVar, long j10) throws l {
        if (kVar.l() == 2) {
            int q10 = kVar.q();
            int i10 = kVar.f19580b;
            kVar.f(q10);
            if ("onMetaData".equals(new String(kVar.f19579a, i10, q10)) && kVar.l() == 8) {
                HashMap<String, Object> b10 = b(kVar);
                if (b10.containsKey("duration")) {
                    double doubleValue = ((Double) b10.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.f18203b = (long) (doubleValue * 1000000.0d);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new l();
    }

    public static HashMap<String, Object> b(k kVar) {
        int o10 = kVar.o();
        HashMap<String, Object> hashMap = new HashMap<>(o10);
        for (int i10 = 0; i10 < o10; i10++) {
            int q10 = kVar.q();
            int i11 = kVar.f19580b;
            kVar.f(q10);
            hashMap.put(new String(kVar.f19579a, i11, q10), a(kVar, kVar.l()));
        }
        return hashMap;
    }
}
