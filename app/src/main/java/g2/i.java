package g2;

import b2.b;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import h2.c;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public class i implements n0<b2.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f30482a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30483b = c.a.a("t", InneractiveMediationDefs.GENDER_FEMALE, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private i() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public b2.b a(h2.c cVar, float f10) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.d();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        int i10 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        float f14 = 0.0f;
        boolean z10 = true;
        while (cVar.l()) {
            switch (cVar.T(f30483b)) {
                case 0:
                    str = cVar.A();
                    break;
                case 1:
                    str2 = cVar.A();
                    break;
                case 2:
                    f11 = (float) cVar.w();
                    break;
                case 3:
                    int y10 = cVar.y();
                    aVar2 = b.a.CENTER;
                    if (y10 <= aVar2.ordinal() && y10 >= 0) {
                        aVar2 = b.a.values()[y10];
                        break;
                    }
                    break;
                case 4:
                    i10 = cVar.y();
                    break;
                case 5:
                    f12 = (float) cVar.w();
                    break;
                case 6:
                    f13 = (float) cVar.w();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.w();
                    break;
                case 10:
                    z10 = cVar.q();
                    break;
                default:
                    cVar.U();
                    cVar.Z();
                    break;
            }
        }
        cVar.h();
        return new b2.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10);
    }
}
