package da;

import java.io.IOException;

/* compiled from: DataSourceUtil.java */
/* loaded from: classes2.dex */
public final class o {
    public static void a(l lVar) {
        if (lVar != null) {
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
