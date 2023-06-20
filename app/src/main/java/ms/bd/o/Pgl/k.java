package ms.bd.o.Pgl;

import java.util.Locale;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class k extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        String str2;
        try {
            Locale locale = pgla.a().b().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(language);
            sb2.append((String) pblk.a(16777217, 0, 0L, "b946b3", new byte[]{76}));
            sb2.append(country);
            str2 = sb2.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return z0.a(str2);
    }
}
