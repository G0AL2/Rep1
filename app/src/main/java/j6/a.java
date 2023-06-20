package j6;

import ye.e;
import ye.z;

/* compiled from: OkHttpCallUtil.java */
/* loaded from: classes.dex */
public class a {
    public static void a(z zVar, Object obj) {
        for (e eVar : zVar.p().j()) {
            if (obj.equals(eVar.l().j())) {
                eVar.cancel();
                return;
            }
        }
        for (e eVar2 : zVar.p().k()) {
            if (obj.equals(eVar2.l().j())) {
                eVar2.cancel();
                return;
            }
        }
    }
}
