package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.z;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f22258a;

    /* loaded from: classes2.dex */
    class a extends androidx.core.view.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter2().h());
        } else if (i10 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l10, Long l11, Long l12, Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public i getAdapter2() {
        return (i) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a10;
        int c10;
        int a11;
        int c11;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        i adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f22344b;
        b bVar = adapter2.f22345c;
        Long item = adapter2.getItem(adapter2.b());
        Long item2 = adapter2.getItem(adapter2.h());
        for (h0.d<Long, Long> dVar : dateSelector.s0()) {
            Long l10 = dVar.f31049a;
            if (l10 != null) {
                if (dVar.f31050b == null) {
                    continue;
                } else {
                    long longValue = l10.longValue();
                    long longValue2 = dVar.f31050b.longValue();
                    if (d(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        a10 = adapter2.b();
                        c10 = adapter2.f(a10) ? 0 : materialCalendarGridView.getChildAt(a10 - 1).getRight();
                    } else {
                        materialCalendarGridView.f22258a.setTimeInMillis(longValue);
                        a10 = adapter2.a(materialCalendarGridView.f22258a.get(5));
                        c10 = c(materialCalendarGridView.getChildAt(a10));
                    }
                    if (longValue2 > item2.longValue()) {
                        a11 = adapter2.h();
                        if (adapter2.g(a11)) {
                            c11 = getWidth();
                        } else {
                            c11 = materialCalendarGridView.getChildAt(a11).getRight();
                        }
                    } else {
                        materialCalendarGridView.f22258a.setTimeInMillis(longValue2);
                        a11 = adapter2.a(materialCalendarGridView.f22258a.get(5));
                        c11 = c(materialCalendarGridView.getChildAt(a11));
                    }
                    int itemId = (int) adapter2.getItemId(a10);
                    int itemId2 = (int) adapter2.getItemId(a11);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > a10 ? 0 : c10, childAt.getTop() + bVar.f22272a.c(), a11 > numColumns2 ? getWidth() : c11, childAt.getBottom() - bVar.f22272a.b(), bVar.f22279h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            a(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (super.onKeyDown(i10, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i10) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22258a = n.k();
        if (f.q(getContext())) {
            setNextFocusLeftId(ha.f.f31194a);
            setNextFocusRightId(ha.f.f31195b);
        }
        z.q0(this, new a(this));
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof i) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), i.class.getCanonicalName()));
    }
}
