package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.c;

/* compiled from: TTAdDislikeImpl.java */
/* loaded from: classes.dex */
public class b implements TTAdDislike {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13212a;

    /* renamed from: b  reason: collision with root package name */
    private n f13213b;

    /* renamed from: c  reason: collision with root package name */
    private c f13214c;

    /* renamed from: d  reason: collision with root package name */
    private TTAdDislike.DislikeInteractionCallback f13215d;

    public b(Context context, n nVar) {
        if (!(context instanceof Activity)) {
            l.b("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f13212a = context;
        this.f13213b = nVar;
        a();
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f13215d = dislikeInteractionCallback;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdDislike
    public void showDislikeDialog() {
        Context context = this.f13212a;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.f13214c.isShowing()) {
            return;
        }
        this.f13214c.show();
    }

    private void a() {
        c cVar = new c(this.f13212a, this.f13213b);
        this.f13214c = cVar;
        cVar.a(new c.a() { // from class: com.bytedance.sdk.openadsdk.dislike.b.1
            @Override // com.bytedance.sdk.openadsdk.dislike.c.a
            public void a() {
                l.b("TTAdDislikeImpl", "onDislikeShow: ");
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.c.a
            public void b() {
                l.e("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (b.this.f13215d != null) {
                        b.this.f13215d.onCancel();
                    }
                } catch (Throwable th) {
                    l.c("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.c.a
            public void c() {
                l.e("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }

            @Override // com.bytedance.sdk.openadsdk.dislike.c.a
            public void a(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && b.this.f13215d != null) {
                        b.this.f13215d.onSelected(i10, filterWord.getName());
                    }
                    l.e("TTAdDislikeImpl", "onDislikeSelected: " + i10 + ", " + String.valueOf(filterWord.getName()));
                } catch (Throwable th) {
                    l.c("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }
        });
    }

    public void a(n nVar) {
        this.f13214c.a(nVar);
    }

    public void a(String str) {
        c cVar = this.f13214c;
        if (cVar != null) {
            cVar.a(str);
        }
    }
}
