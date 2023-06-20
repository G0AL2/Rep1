package ms.bd.o.Pgl;

import android.content.Context;
import java.io.File;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
public final class pblj {
    public static void a() {
        pblb.a(65537, new pblc());
        pblb.a(65538, new pbld());
        pblb.a(65539, new pble());
        pblb.a(65540, new pblf());
        pblb.a(65541, new pblg());
        pblb.a(65542, new pblh());
        pblb.a(65543, new pbli());
        pblb.pgla pblaVar = pbly.b() ? new pbla() : new pblp();
        pblb.a(196609, pblaVar);
        pblb.a(196610, pblaVar);
        pblb.a(196611, pblaVar);
        pblm pblnVar = pbly.a() ? new pbln() : new pbll();
        pblm.a(pblnVar);
        pblb.a(131073, pblnVar);
        pblb.a(131074, pblnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append((String) pblk.a(16777217, 0, 0L, "706181", new byte[]{105}));
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append((String) pblk.a(16777217, 0, 0L, "f9c19e", new byte[]{56}));
                    sb4.append(str3);
                    b(context, sb3, sb4.toString());
                }
                return true;
            }
            throw null;
        } catch (Exception unused) {
            String str4 = (String) pblk.a(16777217, 0, 0L, "ab003d", new byte[]{115, 97, 69});
            return false;
        }
    }
}
