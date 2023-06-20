package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes.dex */
public final class d extends ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayoutManager f4366a;

    /* renamed from: b  reason: collision with root package name */
    private ViewPager2.k f4367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(LinearLayoutManager linearLayoutManager) {
        this.f4366a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i10, float f10, int i11) {
        if (this.f4367b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f4366a.T(); i12++) {
            View S = this.f4366a.S(i12);
            if (S != null) {
                this.f4367b.a(S, (this.f4366a.n0(S) - i10) + f11);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f4366a.T())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPager2.k d() {
        return this.f4367b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ViewPager2.k kVar) {
        this.f4367b = kVar;
    }
}
