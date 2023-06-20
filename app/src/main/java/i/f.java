package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i.b;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f31432a;

    /* renamed from: b  reason: collision with root package name */
    final b f31433b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f31434a;

        /* renamed from: b  reason: collision with root package name */
        final Context f31435b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f31436c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final androidx.collection.g<Menu, Menu> f31437d = new androidx.collection.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f31435b = context;
            this.f31434a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f31437d.get(menu);
            if (menu2 == null) {
                j.d dVar = new j.d(this.f31435b, (b0.a) menu);
                this.f31437d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // i.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f31434a.onActionItemClicked(e(bVar), new j.c(this.f31435b, (b0.b) menuItem));
        }

        @Override // i.b.a
        public void b(b bVar) {
            this.f31434a.onDestroyActionMode(e(bVar));
        }

        @Override // i.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f31434a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // i.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f31434a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f31436c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f31436c.get(i10);
                if (fVar != null && fVar.f31433b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f31435b, bVar);
            this.f31436c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f31432a = context;
        this.f31433b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f31433b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f31433b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new j.d(this.f31432a, (b0.a) this.f31433b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f31433b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f31433b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f31433b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f31433b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f31433b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f31433b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f31433b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f31433b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f31433b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f31433b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f31433b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f31433b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f31433b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f31433b.q(i10);
    }
}
