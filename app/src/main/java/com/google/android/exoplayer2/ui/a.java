package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r9.b;

/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: classes2.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f21679a;

    /* renamed from: b  reason: collision with root package name */
    private List<r9.b> f21680b;

    /* renamed from: c  reason: collision with root package name */
    private int f21681c;

    /* renamed from: d  reason: collision with root package name */
    private float f21682d;

    /* renamed from: e  reason: collision with root package name */
    private ca.b f21683e;

    /* renamed from: f  reason: collision with root package name */
    private float f21684f;

    public a(Context context) {
        this(context, null);
    }

    private static r9.b b(r9.b bVar) {
        b.C0490b p10 = bVar.b().k(-3.4028235E38f).l(RecyclerView.UNDEFINED_DURATION).p(null);
        if (bVar.f36488f == 0) {
            p10.h(1.0f - bVar.f36487e, 0);
        } else {
            p10.h((-bVar.f36487e) - 1.0f, 1);
        }
        int i10 = bVar.f36489g;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<r9.b> list, ca.b bVar, float f10, int i10, float f11) {
        this.f21680b = list;
        this.f21683e = bVar;
        this.f21682d = f10;
        this.f21681c = i10;
        this.f21684f = f11;
        while (this.f21679a.size() < list.size()) {
            this.f21679a.add(new h(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<r9.b> list = this.f21680b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float h10 = k.h(this.f21681c, this.f21682d, height, i10);
        if (h10 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            r9.b bVar = list.get(i11);
            if (bVar.f36498p != Integer.MIN_VALUE) {
                bVar = b(bVar);
            }
            r9.b bVar2 = bVar;
            int i12 = paddingBottom;
            this.f21679a.get(i11).b(bVar2, this.f21683e, h10, k.h(bVar2.f36496n, bVar2.f36497o, height, i10), this.f21684f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21679a = new ArrayList();
        this.f21680b = Collections.emptyList();
        this.f21681c = 0;
        this.f21682d = 0.0533f;
        this.f21683e = ca.b.f5334g;
        this.f21684f = 0.08f;
    }
}
