package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubMenuWrapperICS.java */
/* loaded from: classes.dex */
public class f extends d implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final b0.c f32144e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context, b0.c cVar) {
        super(context, cVar);
        this.f32144e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f32144e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f32144e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f32144e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f32144e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f32144e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f32144e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f32144e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f32144e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f32144e.setIcon(drawable);
        return this;
    }
}
