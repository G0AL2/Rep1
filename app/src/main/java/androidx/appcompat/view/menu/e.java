package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class e implements b0.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    private final Context f1068a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f1069b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1070c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1071d;

    /* renamed from: e  reason: collision with root package name */
    private a f1072e;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f1080m;

    /* renamed from: n  reason: collision with root package name */
    CharSequence f1081n;

    /* renamed from: o  reason: collision with root package name */
    Drawable f1082o;

    /* renamed from: p  reason: collision with root package name */
    View f1083p;

    /* renamed from: x  reason: collision with root package name */
    private g f1091x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1093z;

    /* renamed from: l  reason: collision with root package name */
    private int f1079l = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1084q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1085r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1086s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1087t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1088u = false;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<g> f1089v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f1090w = new CopyOnWriteArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private boolean f1092y = false;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<g> f1073f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<g> f1074g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1075h = true;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g> f1076i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<g> f1077j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private boolean f1078k = true;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean d(g gVar);
    }

    public e(Context context) {
        this.f1068a = context;
        this.f1069b = context.getResources();
        b0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f1073f.size()) {
            return;
        }
        this.f1073f.remove(i10);
        if (z10) {
            K(true);
        }
    }

    private void W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f1083p = view;
            this.f1081n = null;
            this.f1082o = null;
        } else {
            if (i10 > 0) {
                this.f1081n = C.getText(i10);
            } else if (charSequence != null) {
                this.f1081n = charSequence;
            }
            if (i11 > 0) {
                this.f1082o = androidx.core.content.b.f(u(), i11);
            } else if (drawable != null) {
                this.f1082o = drawable;
            }
            this.f1083p = null;
        }
        K(false);
    }

    private void b0(boolean z10) {
        boolean z11 = true;
        this.f1071d = (z10 && this.f1069b.getConfiguration().keyboard != 1 && b0.e(ViewConfiguration.get(this.f1068a), this.f1068a)) ? false : false;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f1090w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f1090w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1090w.remove(next);
            } else {
                jVar.f(z10);
            }
        }
        c0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f1090w.isEmpty()) {
            return false;
        }
        boolean e10 = jVar != null ? jVar.e(mVar) : false;
        Iterator<WeakReference<j>> it = this.f1090w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f1090w.remove(next);
            } else if (!e10) {
                e10 = jVar2.e(mVar);
            }
        }
        return e10;
    }

    private static int n(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f1087t;
    }

    Resources C() {
        return this.f1069b;
    }

    public e D() {
        return this;
    }

    public ArrayList<g> E() {
        if (this.f1075h) {
            this.f1074g.clear();
            int size = this.f1073f.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = this.f1073f.get(i10);
                if (gVar.isVisible()) {
                    this.f1074g.add(gVar);
                }
            }
            this.f1075h = false;
            this.f1078k = true;
            return this.f1074g;
        }
        return this.f1074g;
    }

    public boolean F() {
        return this.f1092y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f1070c;
    }

    public boolean H() {
        return this.f1071d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(g gVar) {
        this.f1078k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(g gVar) {
        this.f1075h = true;
        K(true);
    }

    public void K(boolean z10) {
        if (!this.f1084q) {
            if (z10) {
                this.f1075h = true;
                this.f1078k = true;
            }
            i(z10);
            return;
        }
        this.f1085r = true;
        if (z10) {
            this.f1086s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i10) {
        return M(menuItem, null, i10);
    }

    public boolean M(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean k10 = gVar.k();
        androidx.core.view.b a10 = gVar.a();
        boolean z10 = a10 != null && a10.a();
        if (gVar.j()) {
            k10 |= gVar.expandActionView();
            if (k10) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                a10.f(mVar);
            }
            k10 |= j(mVar, jVar);
            if (!k10) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return k10;
    }

    public void O(j jVar) {
        Iterator<WeakReference<j>> it = this.f1090w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f1090w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f1072e = aVar;
    }

    public e S(int i10) {
        this.f1079l = i10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1073f.size();
        d0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f1073f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e U(int i10) {
        W(0, null, i10, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e X(int i10) {
        W(i10, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int B = B(i12);
        g g10 = g(i10, i11, i12, B, charSequence, this.f1079l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1080m;
        if (contextMenuInfo != null) {
            g10.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f1073f;
        arrayList.add(n(arrayList, B), g10);
        K(true);
        return g10;
    }

    public void a0(boolean z10) {
        this.f1093z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f1068a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f1068a);
    }

    public void c(j jVar, Context context) {
        this.f1090w.add(new WeakReference<>(jVar));
        jVar.i(context, this);
        this.f1078k = true;
    }

    public void c0() {
        this.f1084q = false;
        if (this.f1085r) {
            this.f1085r = false;
            K(this.f1086s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f1091x;
        if (gVar != null) {
            f(gVar);
        }
        this.f1073f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f1082o = null;
        this.f1081n = null;
        this.f1083p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f1072e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f1084q) {
            return;
        }
        this.f1084q = true;
        this.f1085r = false;
        this.f1086s = false;
    }

    public final void e(boolean z10) {
        if (this.f1088u) {
            return;
        }
        this.f1088u = true;
        Iterator<WeakReference<j>> it = this.f1090w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1090w.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f1088u = false;
    }

    public boolean f(g gVar) {
        boolean z10 = false;
        if (!this.f1090w.isEmpty() && this.f1091x == gVar) {
            d0();
            Iterator<WeakReference<j>> it = this.f1090w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f1090w.remove(next);
                } else {
                    z10 = jVar.h(this, gVar);
                    if (z10) {
                        break;
                    }
                }
            }
            c0();
            if (z10) {
                this.f1091x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1073f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f1073f.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f1072e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1093z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f1073f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean z10 = false;
        if (this.f1090w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<j>> it = this.f1090w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f1090w.remove(next);
            } else {
                z10 = jVar.c(this, gVar);
                if (z10) {
                    break;
                }
            }
        }
        c0();
        if (z10) {
            this.f1091x = gVar;
        }
        return z10;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f1073f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f1073f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<g> arrayList = this.f1089v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (G) {
                numericShortcut = gVar.getAlphabeticShortcut();
            } else {
                numericShortcut = gVar.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (G && numericShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g p10 = p(i10, keyEvent);
        boolean L = p10 != null ? L(p10, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List<g> list, int i10, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f1073f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f1073f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = G ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<g> E = E();
        if (this.f1078k) {
            Iterator<WeakReference<j>> it = this.f1090w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f1090w.remove(next);
                } else {
                    z10 |= jVar.g();
                }
            }
            if (z10) {
                this.f1076i.clear();
                this.f1077j.clear();
                int size = E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = E.get(i10);
                    if (gVar.l()) {
                        this.f1076i.add(gVar);
                    } else {
                        this.f1077j.add(gVar);
                    }
                }
            } else {
                this.f1076i.clear();
                this.f1077j.clear();
                this.f1077j.addAll(E());
            }
            this.f1078k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int l10 = l(i10);
        if (l10 >= 0) {
            int size = this.f1073f.size() - l10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f1073f.get(l10).getGroupId() != i10) {
                    break;
                }
                N(l10, false);
                i11 = i12;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        N(o(i10), true);
    }

    public ArrayList<g> s() {
        r();
        return this.f1076i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f1073f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1073f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1092y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f1073f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1073f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f1073f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f1073f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1070c = z10;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1073f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f1068a;
    }

    public g v() {
        return this.f1091x;
    }

    public Drawable w() {
        return this.f1082o;
    }

    public CharSequence x() {
        return this.f1081n;
    }

    public View y() {
        return this.f1083p;
    }

    public ArrayList<g> z() {
        r();
        return this.f1077j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f1069b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f1069b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f1068a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f1069b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f1069b.getString(i13));
    }
}
