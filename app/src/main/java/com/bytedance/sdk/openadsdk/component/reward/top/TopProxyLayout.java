package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.n;

/* loaded from: classes.dex */
public class TopProxyLayout extends View implements a<TopProxyLayout> {

    /* renamed from: a  reason: collision with root package name */
    private a f11716a;

    public TopProxyLayout(Context context) {
        this(context, null);
    }

    public TopProxyLayout a(boolean z10, n nVar) {
        TopLayoutDislike2 a10 = new TopLayoutDislike2(getContext()).a(z10, nVar);
        if (a10 instanceof a) {
            this.f11716a = a10;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                a(a10, (ViewGroup) parent);
            }
            return this;
        }
        l.e("TopProxyLayout", "view not implements ITopLayout interface");
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void b() {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void c() {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public View getITopLayout() {
        a aVar = this.f11716a;
        if (aVar instanceof View) {
            return (View) aVar;
        }
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setListener(b bVar) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setListener(bVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowDislike(boolean z10) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowSkip(boolean z10) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowSound(boolean z10) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setSkipEnable(boolean z10) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setSoundMute(boolean z10) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.setSoundMute(z10);
        }
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void a(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void a(CharSequence charSequence, CharSequence charSequence2) {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.a(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void a() {
        a aVar = this.f11716a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
