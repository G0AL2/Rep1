package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public class a implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f32111a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32112b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32113c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f32114d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f32115e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f32116f;

    /* renamed from: g  reason: collision with root package name */
    private char f32117g;

    /* renamed from: i  reason: collision with root package name */
    private char f32119i;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f32121k;

    /* renamed from: l  reason: collision with root package name */
    private Context f32122l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f32123m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f32124n;

    /* renamed from: h  reason: collision with root package name */
    private int f32118h = 4096;

    /* renamed from: j  reason: collision with root package name */
    private int f32120j = 4096;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f32125o = null;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f32126p = null;

    /* renamed from: q  reason: collision with root package name */
    private boolean f32127q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f32128r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f32129s = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f32122l = context;
        this.f32111a = i11;
        this.f32112b = i10;
        this.f32113c = i13;
        this.f32114d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f32121k;
        if (drawable != null) {
            if (this.f32127q || this.f32128r) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
                this.f32121k = r10;
                Drawable mutate = r10.mutate();
                this.f32121k = mutate;
                if (this.f32127q) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f32125o);
                }
                if (this.f32128r) {
                    androidx.core.graphics.drawable.a.p(this.f32121k, this.f32126p);
                }
            }
        }
    }

    @Override // b0.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // b0.b
    public b0.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // b0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: d */
    public b0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: e */
    public b0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // b0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // b0.b, android.view.MenuItem
    /* renamed from: f */
    public b0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // b0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f32120j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f32119i;
    }

    @Override // b0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f32123m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f32112b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f32121k;
    }

    @Override // b0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f32125o;
    }

    @Override // b0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f32126p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f32116f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f32111a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // b0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f32118h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f32117g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f32113c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f32114d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f32115e;
        return charSequence != null ? charSequence : this.f32114d;
    }

    @Override // b0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f32124n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // b0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f32129s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f32129s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f32129s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f32129s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f32119i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f32129s = (z10 ? 1 : 0) | (this.f32129s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f32129s = (z10 ? 2 : 0) | (this.f32129s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f32129s = (z10 ? 16 : 0) | (this.f32129s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f32121k = drawable;
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f32125o = colorStateList;
        this.f32127q = true;
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f32126p = mode;
        this.f32128r = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f32116f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f32117g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f32117g = c10;
        this.f32119i = Character.toLowerCase(c11);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f32114d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f32115e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f32129s = (this.f32129s & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f32119i = Character.toLowerCase(c10);
        this.f32120j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b0.b setContentDescription(CharSequence charSequence) {
        this.f32123m = charSequence;
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f32117g = c10;
        this.f32118h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f32114d = this.f32122l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b0.b setTooltipText(CharSequence charSequence) {
        this.f32124n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f32121k = androidx.core.content.b.f(this.f32122l, i10);
        c();
        return this;
    }

    @Override // b0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f32117g = c10;
        this.f32118h = KeyEvent.normalizeMetaState(i10);
        this.f32119i = Character.toLowerCase(c11);
        this.f32120j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
