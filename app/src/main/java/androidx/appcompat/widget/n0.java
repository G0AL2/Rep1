package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public class n0 extends l0 implements m0 {
    private static Method J;
    private m0 I;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a extends h0 {

        /* renamed from: o  reason: collision with root package name */
        final int f1626o;

        /* renamed from: p  reason: collision with root package name */
        final int f1627p;

        /* renamed from: q  reason: collision with root package name */
        private m0 f1628q;

        /* renamed from: r  reason: collision with root package name */
        private MenuItem f1629r;

        public a(Context context, boolean z10) {
            super(context, z10);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.f1626o = 21;
                this.f1627p = 22;
                return;
            }
            this.f1626o = 22;
            this.f1627p = 21;
        }

        @Override // androidx.appcompat.widget.h0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            androidx.appcompat.view.menu.d dVar;
            int pointToPosition;
            int i11;
            if (this.f1628q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    gVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f1629r;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e b10 = dVar.b();
                    if (menuItem != null) {
                        this.f1628q.n(b10, menuItem);
                    }
                    this.f1629r = gVar;
                    if (gVar != null) {
                        this.f1628q.d(b10, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1626o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i10 == this.f1627p) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                dVar.b().e(false);
                return true;
            } else {
                return super.onKeyDown(i10, keyEvent);
            }
        }

        public void setHoverListener(m0 m0Var) {
            this.f1628q = m0Var;
        }

        @Override // androidx.appcompat.widget.h0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.E.setEnterTransition((Transition) obj);
        }
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.E.setExitTransition((Transition) obj);
        }
    }

    public void O(m0 m0Var) {
        this.I = m0Var;
    }

    public void P(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = J;
            if (method != null) {
                try {
                    method.invoke(this.E, Boolean.valueOf(z10));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.E.setTouchModal(z10);
    }

    @Override // androidx.appcompat.widget.m0
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.m0
    public void n(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.n(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.l0
    h0 r(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }
}
