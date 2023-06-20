package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class g implements b0.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f1098a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1099b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1100c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1101d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1102e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1103f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f1104g;

    /* renamed from: h  reason: collision with root package name */
    private char f1105h;

    /* renamed from: j  reason: collision with root package name */
    private char f1107j;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f1109l;

    /* renamed from: n  reason: collision with root package name */
    e f1111n;

    /* renamed from: o  reason: collision with root package name */
    private m f1112o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f1113p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1114q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f1115r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f1116s;

    /* renamed from: z  reason: collision with root package name */
    private int f1123z;

    /* renamed from: i  reason: collision with root package name */
    private int f1106i = 4096;

    /* renamed from: k  reason: collision with root package name */
    private int f1108k = 4096;

    /* renamed from: m  reason: collision with root package name */
    private int f1110m = 0;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f1117t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f1118u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1119v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1120w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1121x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f1122y = 16;
    private boolean D = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    class a implements b.InterfaceC0051b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0051b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f1111n.J(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1123z = 0;
        this.f1111n = eVar;
        this.f1098a = i11;
        this.f1099b = i10;
        this.f1100c = i12;
        this.f1101d = i13;
        this.f1102e = charSequence;
        this.f1123z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1121x && (this.f1119v || this.f1120w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f1119v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f1117t);
            }
            if (this.f1120w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f1118u);
            }
            this.f1121x = false;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f1111n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f1123z & 4) == 4;
    }

    @Override // b0.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // b0.b
    public b0.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f1111n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f1111n.I(this);
    }

    @Override // b0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1123z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1111n.f(this);
        }
        return false;
    }

    @Override // b0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (j()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f1111n.k(this);
            }
            return false;
        }
        return false;
    }

    public int f() {
        return this.f1101d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public char g() {
        return this.f1111n.G() ? this.f1107j : this.f1105h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // b0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.A = d10;
            return d10;
        }
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1108k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1107j;
    }

    @Override // b0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1115r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1099b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1109l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1110m != 0) {
            Drawable b10 = e.a.b(this.f1111n.u(), this.f1110m);
            this.f1110m = 0;
            this.f1109l = b10;
            return e(b10);
        }
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1117t;
    }

    @Override // b0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1118u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1104g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1098a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // b0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1106i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1105h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1100c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1112o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1102e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1103f;
        if (charSequence == null) {
            charSequence = this.f1102e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // b0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1116s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h() {
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f1111n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1111n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(d.h.f28789m));
        }
        int i10 = this.f1111n.G() ? this.f1108k : this.f1106i;
        d(sb2, i10, Constants.MIN_PROGRESS_STEP, resources.getString(d.h.f28785i));
        d(sb2, i10, 4096, resources.getString(d.h.f28781e));
        d(sb2, i10, 2, resources.getString(d.h.f28780d));
        d(sb2, i10, 1, resources.getString(d.h.f28786j));
        d(sb2, i10, 4, resources.getString(d.h.f28788l));
        d(sb2, i10, 8, resources.getString(d.h.f28784h));
        if (g10 == '\b') {
            sb2.append(resources.getString(d.h.f28782f));
        } else if (g10 == '\n') {
            sb2.append(resources.getString(d.h.f28783g));
        } else if (g10 != ' ') {
            sb2.append(g10);
        } else {
            sb2.append(resources.getString(d.h.f28787k));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1112o != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        if (aVar != null && aVar.f()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // b0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1122y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1122y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1122y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f1122y & 8) == 0 : (this.f1122y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f1123z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            return this.A != null;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1114q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            e eVar = this.f1111n;
            if (eVar.h(eVar, this)) {
                return true;
            }
            Runnable runnable = this.f1113p;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            if (this.f1104g != null) {
                try {
                    this.f1111n.u().startActivity(this.f1104g);
                    return true;
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            androidx.core.view.b bVar = this.B;
            return bVar != null && bVar.e();
        }
        return true;
    }

    public boolean l() {
        return (this.f1122y & 32) == 32;
    }

    public boolean m() {
        return (this.f1122y & 4) != 0;
    }

    public boolean n() {
        return (this.f1123z & 1) == 1;
    }

    public boolean o() {
        return (this.f1123z & 2) == 2;
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: p */
    public b0.b setActionView(int i10) {
        Context u10 = this.f1111n.u();
        setActionView(LayoutInflater.from(u10).inflate(i10, (ViewGroup) new LinearLayout(u10), false));
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: q */
    public b0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1098a) > 0) {
            view.setId(i10);
        }
        this.f1111n.I(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1111n.K(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        int i10 = this.f1122y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1122y = i11;
        if (i10 != i11) {
            this.f1111n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1107j == c10) {
            return this;
        }
        this.f1107j = Character.toLowerCase(c10);
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1122y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1122y = i11;
        if (i10 != i11) {
            this.f1111n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1122y & 4) != 0) {
            this.f1111n.T(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1122y |= 16;
        } else {
            this.f1122y &= -17;
        }
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1110m = 0;
        this.f1109l = drawable;
        this.f1121x = true;
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1117t = colorStateList;
        this.f1119v = true;
        this.f1121x = true;
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1118u = mode;
        this.f1120w = true;
        this.f1121x = true;
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1104g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1105h == c10) {
            return this;
        }
        this.f1105h = c10;
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1114q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1105h = c10;
        this.f1107j = Character.toLowerCase(c11);
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1123z = i10;
        this.f1111n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1102e = charSequence;
        this.f1111n.K(false);
        m mVar = this.f1112o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1103f = charSequence;
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1111n.J(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1122y = (z10 ? 4 : 0) | (this.f1122y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1102e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1122y |= 32;
        } else {
            this.f1122y &= -33;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: w */
    public b0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f1112o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y(boolean z10) {
        int i10 = this.f1122y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1122y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1111n.A();
    }

    @Override // android.view.MenuItem
    public b0.b setContentDescription(CharSequence charSequence) {
        this.f1115r = charSequence;
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public b0.b setTooltipText(CharSequence charSequence) {
        this.f1116s = charSequence;
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1107j == c10 && this.f1108k == i10) {
            return this;
        }
        this.f1107j = Character.toLowerCase(c10);
        this.f1108k = KeyEvent.normalizeMetaState(i10);
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1105h == c10 && this.f1106i == i10) {
            return this;
        }
        this.f1105h = c10;
        this.f1106i = KeyEvent.normalizeMetaState(i10);
        this.f1111n.K(false);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1105h = c10;
        this.f1106i = KeyEvent.normalizeMetaState(i10);
        this.f1107j = Character.toLowerCase(c11);
        this.f1108k = KeyEvent.normalizeMetaState(i11);
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1109l = null;
        this.f1110m = i10;
        this.f1121x = true;
        this.f1111n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1111n.u().getString(i10));
    }
}
