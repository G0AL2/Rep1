package ms.bd.o.Pgl;

import java.util.TimeZone;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class i0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        String str2;
        int i11;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
            try {
                i11 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
            } catch (Throwable unused) {
                i11 = 0;
                return str2 + ((String) pblk.a(16777217, 0, 0L, "329840", new byte[]{110})) + i11;
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        return str2 + ((String) pblk.a(16777217, 0, 0L, "329840", new byte[]{110})) + i11;
    }
}
