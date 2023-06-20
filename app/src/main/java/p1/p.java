package p1;

import androidx.work.u;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o1.b0;

/* compiled from: RawQueries.kt */
/* loaded from: classes.dex */
public final class p {
    private static final void a(StringBuilder sb2, int i10) {
        String C;
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        C = fe.x.C(arrayList, ",", null, null, 0, null, null, 62, null);
        sb2.append(C);
    }

    public static final z0.j b(androidx.work.w wVar) {
        int p10;
        int p11;
        qe.k.f(wVar, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<u.a> b10 = wVar.b();
        qe.k.e(b10, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!b10.isEmpty()) {
            List<u.a> b11 = wVar.b();
            qe.k.e(b11, "states");
            p11 = fe.q.p(b11, 10);
            ArrayList arrayList2 = new ArrayList(p11);
            for (u.a aVar : b11) {
                qe.k.c(aVar);
                arrayList2.add(Integer.valueOf(b0.j(aVar)));
            }
            sb2.append(" WHERE state IN (");
            a(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> a10 = wVar.a();
        qe.k.e(a10, "ids");
        if (!a10.isEmpty()) {
            List<UUID> a11 = wVar.a();
            qe.k.e(a11, "ids");
            p10 = fe.q.p(a11, 10);
            ArrayList arrayList3 = new ArrayList(p10);
            for (UUID uuid : a11) {
                arrayList3.add(uuid.toString());
            }
            sb2.append(str2 + " id IN (");
            a(sb2, wVar.a().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> c10 = wVar.c();
        qe.k.e(c10, "tags");
        if (!c10.isEmpty()) {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, wVar.c().size());
            sb2.append("))");
            List<String> c11 = wVar.c();
            qe.k.e(c11, "tags");
            arrayList.addAll(c11);
        } else {
            str = str2;
        }
        List<String> d10 = wVar.d();
        qe.k.e(d10, "uniqueWorkNames");
        if (!d10.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, wVar.d().size());
            sb2.append("))");
            List<String> d11 = wVar.d();
            qe.k.e(d11, "uniqueWorkNames");
            arrayList.addAll(d11);
        }
        sb2.append(";");
        String sb3 = sb2.toString();
        qe.k.e(sb3, "builder.toString()");
        Object[] array = arrayList.toArray(new Object[0]);
        qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new z0.a(sb3, array);
    }
}
