package d9;

import c9.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import ea.z;
import ib.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {
    private static Metadata c(z zVar) {
        zVar.r(12);
        int d10 = (zVar.d() + zVar.h(12)) - 4;
        zVar.r(44);
        zVar.s(zVar.h(12));
        zVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zVar.d() >= d10) {
                break;
            }
            zVar.r(48);
            int h10 = zVar.h(8);
            zVar.r(4);
            int d11 = zVar.d() + zVar.h(12);
            String str2 = null;
            while (zVar.d() < d11) {
                int h11 = zVar.h(8);
                int h12 = zVar.h(8);
                int d12 = zVar.d() + h12;
                if (h11 == 2) {
                    int h13 = zVar.h(16);
                    zVar.r(8);
                    if (h13 != 3) {
                    }
                    while (zVar.d() < d12) {
                        str = zVar.l(zVar.h(8), d.f31903a);
                        int h14 = zVar.h(8);
                        for (int i10 = 0; i10 < h14; i10++) {
                            zVar.s(zVar.h(8));
                        }
                    }
                } else if (h11 == 21) {
                    str2 = zVar.l(h12, d.f31903a);
                }
                zVar.p(d12 * 8);
            }
            zVar.p(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(h10, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // c9.f
    protected Metadata b(c9.d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
