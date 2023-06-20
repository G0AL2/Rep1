package r1;

import android.os.Build;
import androidx.work.l;
import java.util.List;
import o1.i;
import o1.j;
import o1.o;
import o1.u;
import o1.x;
import o1.z;
import qe.k;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f36123a;

    static {
        String i10 = l.i("DiagnosticsWrkr");
        k.e(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f36123a = i10;
    }

    private static final String c(u uVar, String str, Integer num, String str2) {
        return '\n' + uVar.f34905a + "\t " + uVar.f34907c + "\t " + num + "\t " + uVar.f34906b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, z zVar, j jVar, List<u> list) {
        String C;
        String C2;
        StringBuilder sb2 = new StringBuilder();
        String str = Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id";
        sb2.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        for (u uVar : list) {
            i g10 = jVar.g(x.a(uVar));
            Integer valueOf = g10 != null ? Integer.valueOf(g10.f34886c) : null;
            C = fe.x.C(oVar.b(uVar.f34905a), ",", null, null, 0, null, null, 62, null);
            C2 = fe.x.C(zVar.b(uVar.f34905a), ",", null, null, 0, null, null, 62, null);
            sb2.append(c(uVar, C, valueOf, C2));
        }
        String sb3 = sb2.toString();
        k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
