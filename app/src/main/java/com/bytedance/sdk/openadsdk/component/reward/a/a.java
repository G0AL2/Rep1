package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.t;
import org.json.JSONObject;

/* compiled from: RewardFullDownloadManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    r3.c f11411a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f11412b;

    /* renamed from: c  reason: collision with root package name */
    private n f11413c;

    /* renamed from: d  reason: collision with root package name */
    private String f11414d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11415e = false;

    /* compiled from: RewardFullDownloadManager.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0165a {
        void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12);

        void a(String str, JSONObject jSONObject);
    }

    public a(Activity activity) {
        this.f11412b = activity;
    }

    private void d() {
        if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
            n nVar = this.f11413c;
            if (nVar == null || nVar.L() != 4) {
                return;
            }
            this.f11411a = r3.d.a(this.f11412b, this.f11413c, this.f11414d);
            return;
        }
        this.f11411a = t.a().g();
    }

    public void a(n nVar, String str) {
        if (this.f11415e) {
            return;
        }
        this.f11415e = true;
        this.f11413c = nVar;
        this.f11414d = str;
        d();
    }

    public void b() {
        r3.c cVar = this.f11411a;
        if (cVar != null) {
            cVar.d();
        }
    }

    public r3.c c() {
        return this.f11411a;
    }

    public void a() {
        n nVar;
        if (this.f11411a != null || (nVar = this.f11413c) == null) {
            return;
        }
        this.f11411a = r3.d.a(this.f11412b, nVar, this.f11414d);
    }

    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12, InterfaceC0165a interfaceC0165a) {
        if (this.f11411a != null) {
            if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f11412b, "tt_rb_score")) {
                interfaceC0165a.a("click_play_star_level", null);
                return;
            } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f11412b, "tt_comment_vertical")) {
                interfaceC0165a.a("click_play_star_nums", null);
                return;
            } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f11412b, "tt_reward_ad_appname")) {
                interfaceC0165a.a("click_play_source", null);
                return;
            } else if (view.getId() == com.bytedance.sdk.component.utils.t.e(this.f11412b, "tt_reward_ad_icon")) {
                interfaceC0165a.a("click_play_logo", null);
                return;
            } else {
                return;
            }
        }
        interfaceC0165a.a(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
