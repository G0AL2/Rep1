package l1;

import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.c;
import m1.g;
import m1.h;
import n1.o;
import o1.u;
import qe.k;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class e implements d, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f33653a;

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintController<?>[] f33654b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f33655c;

    public e(c cVar, ConstraintController<?>[] constraintControllerArr) {
        k.f(constraintControllerArr, "constraintControllers");
        this.f33653a = cVar;
        this.f33654b = constraintControllerArr;
        this.f33655c = new Object();
    }

    @Override // l1.d
    public void a(Iterable<u> iterable) {
        k.f(iterable, "workSpecs");
        synchronized (this.f33655c) {
            for (m1.c cVar : this.f33654b) {
                cVar.g(null);
            }
            for (m1.c cVar2 : this.f33654b) {
                cVar2.e(iterable);
            }
            for (m1.c cVar3 : this.f33654b) {
                cVar3.g(this);
            }
            ee.u uVar = ee.u.f29813a;
        }
    }

    @Override // m1.c.a
    public void b(List<u> list) {
        String str;
        k.f(list, "workSpecs");
        synchronized (this.f33655c) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (d(((u) obj).f34905a)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l e10 = l.e();
                str = f.f33656a;
                e10.a(str, "Constraints met for " + ((u) it.next()));
            }
            c cVar = this.f33653a;
            if (cVar != null) {
                cVar.f(arrayList);
                ee.u uVar = ee.u.f29813a;
            }
        }
    }

    @Override // m1.c.a
    public void c(List<u> list) {
        k.f(list, "workSpecs");
        synchronized (this.f33655c) {
            c cVar = this.f33653a;
            if (cVar != null) {
                cVar.b(list);
                ee.u uVar = ee.u.f29813a;
            }
        }
    }

    public final boolean d(String str) {
        m1.c cVar;
        boolean z10;
        String str2;
        k.f(str, "workSpecId");
        synchronized (this.f33655c) {
            m1.c[] cVarArr = this.f33654b;
            int length = cVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArr[i10];
                if (cVar.d(str)) {
                    break;
                }
                i10++;
            }
            if (cVar != null) {
                l e10 = l.e();
                str2 = f.f33656a;
                e10.a(str2, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
            }
            z10 = cVar == null;
        }
        return z10;
    }

    @Override // l1.d
    public void reset() {
        synchronized (this.f33655c) {
            for (m1.c cVar : this.f33654b) {
                cVar.f();
            }
            ee.u uVar = ee.u.f29813a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(o oVar, c cVar) {
        this(cVar, (ConstraintController<?>[]) new m1.c[]{new m1.a(oVar.a()), new m1.b(oVar.b()), new h(oVar.d()), new m1.d(oVar.c()), new g(oVar.c()), new m1.f(oVar.c()), new m1.e(oVar.c())});
        k.f(oVar, "trackers");
    }
}
