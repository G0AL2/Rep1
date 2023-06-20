package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f32130a;

    /* renamed from: b  reason: collision with root package name */
    private g<b0.b, MenuItem> f32131b;

    /* renamed from: c  reason: collision with root package name */
    private g<b0.c, SubMenu> f32132c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f32130a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof b0.b) {
            b0.b bVar = (b0.b) menuItem;
            if (this.f32131b == null) {
                this.f32131b = new g<>();
            }
            MenuItem menuItem2 = this.f32131b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f32130a, bVar);
                this.f32131b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof b0.c) {
            b0.c cVar = (b0.c) subMenu;
            if (this.f32132c == null) {
                this.f32132c = new g<>();
            }
            SubMenu subMenu2 = this.f32132c.get(cVar);
            if (subMenu2 == null) {
                f fVar = new f(this.f32130a, cVar);
                this.f32132c.put(cVar, fVar);
                return fVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        g<b0.b, MenuItem> gVar = this.f32131b;
        if (gVar != null) {
            gVar.clear();
        }
        g<b0.c, SubMenu> gVar2 = this.f32132c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f32131b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f32131b.size()) {
            if (this.f32131b.j(i11).getGroupId() == i10) {
                this.f32131b.l(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f32131b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f32131b.size(); i11++) {
            if (this.f32131b.j(i11).getItemId() == i10) {
                this.f32131b.l(i11);
                return;
            }
        }
    }
}
