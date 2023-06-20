package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
/* loaded from: classes.dex */
public class c extends j.b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final b0.b f32133d;

    /* renamed from: e  reason: collision with root package name */
    private Method f32134e;

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class a extends androidx.core.view.b {

        /* renamed from: c  reason: collision with root package name */
        final ActionProvider f32135c;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f32135c = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f32135c.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View c() {
            return this.f32135c.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f32135c.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f32135c.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: e  reason: collision with root package name */
        private b.InterfaceC0051b f32137e;

        b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f32135c.isVisible();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f32135c.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f32135c.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(b.InterfaceC0051b interfaceC0051b) {
            this.f32137e = interfaceC0051b;
            this.f32135c.setVisibilityListener(interfaceC0051b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            b.InterfaceC0051b interfaceC0051b = this.f32137e;
            if (interfaceC0051b != null) {
                interfaceC0051b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* renamed from: j.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0413c extends FrameLayout implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f32138a;

        C0413c(View view) {
            super(view.getContext());
            this.f32138a = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f32138a;
        }

        @Override // i.c
        public void b() {
            this.f32138a.onActionViewExpanded();
        }

        @Override // i.c
        public void e() {
            this.f32138a.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f32139a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f32139a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f32139a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f32139a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f32141a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f32141a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f32141a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, b0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f32133d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f32133d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f32133d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b a10 = this.f32133d.a();
        if (a10 instanceof a) {
            return ((a) a10).f32135c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f32133d.getActionView();
        return actionView instanceof C0413c ? ((C0413c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f32133d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f32133d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f32133d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f32133d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f32133d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f32133d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f32133d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f32133d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f32133d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f32133d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f32133d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f32133d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f32133d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f32133d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f32133d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f32133d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f32133d.getTooltipText();
    }

    public void h(boolean z10) {
        try {
            if (this.f32134e == null) {
                this.f32134e = this.f32133d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f32134e.invoke(this.f32133d, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f32133d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f32133d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f32133d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f32133d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f32133d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f32133d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        androidx.core.view.b aVar;
        if (Build.VERSION.SDK_INT >= 16) {
            aVar = new b(this, this.f32130a, actionProvider);
        } else {
            aVar = new a(this.f32130a, actionProvider);
        }
        b0.b bVar = this.f32133d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.b(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0413c(view);
        }
        this.f32133d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f32133d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f32133d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f32133d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f32133d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f32133d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f32133d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f32133d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f32133d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f32133d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f32133d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f32133d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f32133d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f32133d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f32133d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f32133d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f32133d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f32133d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f32133d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f32133d.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f32133d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f32133d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f32133d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f32133d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f32133d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f32133d.setActionView(i10);
        View actionView = this.f32133d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f32133d.setActionView(new C0413c(actionView));
        }
        return this;
    }
}
