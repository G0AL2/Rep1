package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.z0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f988c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private e f989a;

    /* renamed from: b  reason: collision with root package name */
    private int f990b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(e eVar) {
        this.f989a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(g gVar) {
        return this.f989a.L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f990b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d((g) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z0 v10 = z0.v(context, attributeSet, f988c, i10, 0);
        if (v10.s(0)) {
            setBackgroundDrawable(v10.g(0));
        }
        if (v10.s(1)) {
            setDivider(v10.g(1));
        }
        v10.w();
    }
}
