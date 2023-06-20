package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;

/* compiled from: H5AdInteractionManager.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12304a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.e.n f12305b;

    /* renamed from: c  reason: collision with root package name */
    private r3.c f12306c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.nativeexpress.f f12307d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.nativeexpress.e f12308e;

    /* renamed from: f  reason: collision with root package name */
    private View f12309f;

    /* renamed from: g  reason: collision with root package name */
    private String f12310g;

    public i(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, View view) {
        this.f12310g = "rewarded_video";
        this.f12305b = nVar;
        this.f12304a = context;
        this.f12309f = view;
        this.f12310g = com.bytedance.sdk.openadsdk.utils.u.b(com.bytedance.sdk.openadsdk.utils.u.e(nVar));
        if (nVar.L() == 4) {
            this.f12306c = r3.d.a(context, nVar, this.f12310g);
        }
        String str = this.f12310g;
        com.bytedance.sdk.openadsdk.core.nativeexpress.f fVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.f(context, nVar, str, com.bytedance.sdk.openadsdk.utils.u.a(str));
        this.f12307d = fVar;
        fVar.a(this.f12309f);
        this.f12307d.a(this.f12306c);
        String str2 = this.f12310g;
        com.bytedance.sdk.openadsdk.core.nativeexpress.e eVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.e(context, nVar, str2, com.bytedance.sdk.openadsdk.utils.u.a(str2));
        this.f12308e = eVar;
        eVar.a(this.f12309f);
        this.f12308e.a(this.f12306c);
    }

    public void a(int i10, com.bytedance.sdk.openadsdk.core.e.j jVar) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.e eVar;
        if (i10 == -1 || jVar == null) {
            return;
        }
        float f10 = jVar.f12082a;
        float f11 = jVar.f12083b;
        float f12 = jVar.f12084c;
        float f13 = jVar.f12085d;
        SparseArray<c.a> sparseArray = jVar.f12095n;
        if (i10 != 1) {
            if (i10 == 2 && (eVar = this.f12308e) != null) {
                eVar.a(jVar);
                this.f12308e.a(this.f12309f, f10, f11, f12, f13, sparseArray, true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.nativeexpress.f fVar = this.f12307d;
        if (fVar != null) {
            fVar.a(jVar);
            this.f12307d.a(this.f12309f, f10, f11, f12, f13, sparseArray, true);
        }
    }
}
