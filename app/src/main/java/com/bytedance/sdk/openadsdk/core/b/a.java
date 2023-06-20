package com.bytedance.sdk.openadsdk.core.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.u;

/* compiled from: ClickCreativeListener.java */
/* loaded from: classes.dex */
public class a extends b {
    private boolean F;
    private boolean G;
    private int H;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11864a;

    public a(Context context, n nVar, String str, int i10) {
        super(context, nVar, str, i10);
        this.f11864a = true;
        this.F = false;
        this.G = false;
    }

    private boolean d(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof NativeVideoTsView) {
            l.c("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        } else if (view.getId() != t.e(this.f11868b, "tt_video_ad_cover_center_layout") && view.getId() != t.e(this.f11868b, "tt_video_ad_logo_image") && view.getId() != t.e(this.f11868b, "tt_video_btn_ad_image_tv") && view.getId() != t.e(this.f11868b, "tt_video_ad_name") && view.getId() != t.e(this.f11868b, "tt_video_ad_button")) {
            if (view.getId() != t.e(this.f11868b, "tt_root_view") && view.getId() != t.e(this.f11868b, "tt_video_play")) {
                if (!(view instanceof ViewGroup)) {
                    return false;
                }
                int i10 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i10 >= viewGroup.getChildCount()) {
                        return false;
                    }
                    if (d(viewGroup.getChildAt(i10))) {
                        return true;
                    }
                    i10++;
                }
            } else {
                l.c("ClickCreativeListener", "tt_root_view....");
                return true;
            }
        } else {
            l.c("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        }
    }

    private boolean g() {
        return n.c(this.f11870d) && this.f11870d.p() == 1;
    }

    private boolean h() {
        return this instanceof com.bytedance.sdk.openadsdk.core.nativeexpress.e;
    }

    private boolean i() {
        if (this.f11870d == null || h()) {
            return false;
        }
        if (this.f11870d.ad() == 5 || this.f11870d.ad() == 15) {
            if (this.H == 0) {
                this.H = u.e(this.f11870d);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("!isViewVisibility()=");
            sb2.append(!b());
            sb2.append(",isAutoPlay()=");
            sb2.append(a());
            sb2.append(",!isCoverPageVisibility()=");
            sb2.append(!c());
            l.b("ClickCreativeListener", sb2.toString());
            if (this.H == 5 && g() && a() && !b() && !c()) {
                return false;
            }
            int i10 = this.H;
            return i10 == 1 || i10 == 2 || i10 == 5;
        }
        return false;
    }

    public void a(boolean z10) {
        this.f11864a = z10;
    }

    public void b(boolean z10) {
        this.F = z10;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z10) {
        this.G = z10;
    }

    public boolean c() {
        return false;
    }

    private String b(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 1;
                    break;
                }
                break;
            case -712491894:
                if (str.equals("embeded_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1912999166:
                if (str.equals("draw_ad")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091589896:
                if (str.equals("slide_banner_ad")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "banner_call";
            case 1:
                return "open_ad";
            case 2:
            case 4:
                return "feed_call";
            case 3:
                return "interaction_call";
            case 5:
                return "banner_call";
            default:
                return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
        if ((r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0212, code lost:
        if (((java.lang.Boolean) r2.getTag(com.bytedance.sdk.component.utils.t.e(com.bytedance.sdk.openadsdk.core.m.a(), "tt_id_is_video_picture"))).booleanValue() != false) goto L100;
     */
    @Override // com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r24, float r25, float r26, float r27, float r28, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c.a> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.a.a(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    protected boolean a() {
        n nVar = this.f11870d;
        if (nVar == null) {
            return true;
        }
        int c10 = m.h().c(u.f(nVar));
        int c11 = o.c(m.a());
        if (c10 != 1) {
            if (c10 == 2) {
                return u.f(c11) || u.e(c11) || u.g(c11);
            } else if (c10 != 3) {
                return c10 != 5 || u.e(c11) || u.g(c11);
            } else {
                return false;
            }
        }
        return u.e(c11);
    }
}
