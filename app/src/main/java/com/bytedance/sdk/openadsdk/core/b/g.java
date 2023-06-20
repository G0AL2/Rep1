package com.bytedance.sdk.openadsdk.core.b;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.c;

/* compiled from: VastClickListenerWrapper.java */
/* loaded from: classes.dex */
public abstract class g extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f11923a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.j.a f11924b;

    /* renamed from: c  reason: collision with root package name */
    private c f11925c;

    public g(String str, com.bytedance.sdk.openadsdk.core.j.a aVar) {
        this(str, aVar, null);
    }

    public abstract void a();

    public void a(c cVar) {
        this.f11925c = cVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.b.c, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public g(String str, com.bytedance.sdk.openadsdk.core.j.a aVar, c cVar) {
        this.f11923a = str;
        this.f11924b = aVar;
        this.f11925c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.b.c
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.j.a aVar = this.f11924b;
        if (aVar != null) {
            aVar.e(this.f11923a);
        }
        if (view != null) {
            if (view.getId() == t.e(view.getContext(), "tt_reward_ad_appname")) {
                view.setTag("VAST_TITLE");
            } else if (view.getId() == t.e(view.getContext(), "tt_reward_ad_description")) {
                view.setTag("VAST_DESCRIPTION");
            } else {
                view.setTag(this.f11923a);
            }
        }
        c cVar = this.f11925c;
        if (cVar != null) {
            cVar.f11896w = this.f11896w;
            cVar.f11897x = this.f11897x;
            cVar.f11898y = this.f11898y;
            int i10 = this.f11898y;
            cVar.f11899z = i10;
            cVar.A = i10;
            cVar.a(view, f10, f11, f12, f13, sparseArray, z10);
        }
        a();
    }
}
