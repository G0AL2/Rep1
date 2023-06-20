package o4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ForwardingImageOriginListener.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f34957a;

    public a(b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        this.f34957a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    @Override // o4.b
    public synchronized void a(String str, int i10, boolean z10, String str2) {
        int size = this.f34957a.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f34957a.get(i11);
            if (bVar != null) {
                try {
                    bVar.a(str, i10, z10, str2);
                } catch (Exception e10) {
                    z3.a.k("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e10);
                }
            }
        }
    }

    public synchronized void b(b bVar) {
        this.f34957a.add(bVar);
    }

    public synchronized void c(b bVar) {
        this.f34957a.remove(bVar);
    }
}
