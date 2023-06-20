package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.dynamic.b.e;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.d;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.c, com.bytedance.sdk.component.adexpress.theme.a {

    /* renamed from: a  reason: collision with root package name */
    protected final m f9717a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9718b;

    /* renamed from: c  reason: collision with root package name */
    private j f9719c;

    /* renamed from: d  reason: collision with root package name */
    private DynamicBaseWidget f9720d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.d.a f9721e;

    /* renamed from: f  reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f9722f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.a f9723g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f9724h;

    /* renamed from: i  reason: collision with root package name */
    private int f9725i;

    /* renamed from: j  reason: collision with root package name */
    private List<com.bytedance.sdk.component.adexpress.dynamic.b> f9726j;

    /* renamed from: k  reason: collision with root package name */
    private d f9727k;

    /* renamed from: l  reason: collision with root package name */
    private int f9728l;

    /* renamed from: m  reason: collision with root package name */
    private int f9729m;

    /* renamed from: n  reason: collision with root package name */
    private l f9730n;

    /* renamed from: o  reason: collision with root package name */
    private Context f9731o;

    /* renamed from: p  reason: collision with root package name */
    private String f9732p;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, l lVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        super(context);
        this.f9724h = null;
        this.f9725i = 0;
        this.f9726j = new ArrayList();
        this.f9728l = 0;
        this.f9729m = 0;
        this.f9731o = context;
        m mVar = new m();
        this.f9717a = mVar;
        mVar.a(2);
        this.f9721e = aVar;
        aVar.a(this);
        this.f9722f = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.a(this);
        this.f9718b = z10;
        this.f9730n = lVar;
    }

    public void a(h hVar, int i10) {
        this.f9720d = a(hVar, this, i10);
        this.f9717a.a(true);
        this.f9717a.a(this.f9720d.f9687e);
        this.f9717a.b(this.f9720d.f9688f);
        this.f9719c.a(this.f9717a);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.a
    public void b(int i10) {
        DynamicBaseWidget dynamicBaseWidget = this.f9720d;
        if (dynamicBaseWidget == null) {
            return;
        }
        dynamicBaseWidget.a(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void f() {
        this.f9727k.a();
    }

    public String getBgColor() {
        return this.f9732p;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.d.a getDynamicClickListener() {
        return this.f9721e;
    }

    public int getLogoUnionHeight() {
        return this.f9728l;
    }

    public j getRenderListener() {
        return this.f9719c;
    }

    public l getRenderRequest() {
        return this.f9730n;
    }

    public int getScoreCountWithIcon() {
        return this.f9729m;
    }

    public ViewGroup getTimeOut() {
        return this.f9724h;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.b> getTimeOutListener() {
        return this.f9726j;
    }

    public int getTimedown() {
        return this.f9725i;
    }

    public void setBgColor(String str) {
        this.f9732p = str;
    }

    public void setDislikeView(View view) {
        this.f9721e.b(view);
    }

    public void setLogoUnionHeight(int i10) {
        this.f9728l = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.a aVar) {
        this.f9723g = aVar;
    }

    public void setRenderListener(j jVar) {
        this.f9719c = jVar;
        this.f9721e.a(jVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.f9729m = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void setSoundMute(boolean z10) {
        com.bytedance.sdk.component.adexpress.dynamic.a aVar = this.f9723g;
        if (aVar != null) {
            aVar.setSoundMute(z10);
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f9724h = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.b bVar) {
        this.f9726j.add(bVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void setTimeUpdate(int i10) {
        this.f9727k.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.f9725i = i10;
    }

    public void setVideoListener(d dVar) {
        this.f9727k = dVar;
    }

    public DynamicBaseWidget a(h hVar, ViewGroup viewGroup, int i10) {
        if (hVar == null) {
            return null;
        }
        DynamicBaseWidget a10 = com.bytedance.sdk.component.adexpress.dynamic.a.b.a(this.f9731o, this, hVar);
        if (a10 instanceof DynamicUnKnowView) {
            a(i10 == 3 ? 128 : 118);
            return null;
        }
        a(hVar);
        a10.c();
        if (viewGroup != null) {
            viewGroup.addView(a10);
            a(viewGroup, hVar);
        }
        List<h> j10 = hVar.j();
        if (j10 == null || j10.size() <= 0) {
            return null;
        }
        for (h hVar2 : j10) {
            a(hVar2, a10, i10);
        }
        return a10;
    }

    private void a(h hVar) {
        f e10;
        e i10 = hVar.i();
        if (i10 == null || (e10 = i10.e()) == null) {
            return;
        }
        this.f9717a.b(e10.ak());
    }

    private void a(ViewGroup viewGroup, h hVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !hVar.t()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void a(double d10, double d11, double d12, double d13, float f10) {
        this.f9717a.c(d10);
        this.f9717a.d(d11);
        this.f9717a.e(d12);
        this.f9717a.f(d13);
        this.f9717a.a(f10);
        this.f9717a.b(f10);
        this.f9717a.c(f10);
        this.f9717a.d(f10);
    }

    public void a(int i10) {
        this.f9717a.a(false);
        this.f9717a.b(i10);
        this.f9719c.a(this.f9717a);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c
    public void a(CharSequence charSequence, int i10, int i11) {
        for (int i12 = 0; i12 < this.f9726j.size(); i12++) {
            if (this.f9726j.get(i12) != null) {
                this.f9726j.get(i12).a(charSequence, i10 == 1, i11);
            }
        }
    }
}
