package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.d;
import com.bytedance.sdk.openadsdk.core.nativeexpress.f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.m;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.inmobi.media.jh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
import r3.c;

/* compiled from: TTBannerExpressAdImpl.java */
/* loaded from: classes.dex */
public class a extends m implements x.a {

    /* renamed from: a  reason: collision with root package name */
    protected BannerExpressView f11952a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f11953b;

    /* renamed from: c  reason: collision with root package name */
    protected n f11954c;

    /* renamed from: d  reason: collision with root package name */
    protected AdSlot f11955d;

    /* renamed from: e  reason: collision with root package name */
    protected TTNativeExpressAd.ExpressAdInteractionListener f11956e;

    /* renamed from: f  reason: collision with root package name */
    TTDislikeDialogAbstract f11957f;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.dislike.b f11958h;

    /* renamed from: i  reason: collision with root package name */
    private c f11959i;

    /* renamed from: j  reason: collision with root package name */
    private x f11960j;

    /* renamed from: k  reason: collision with root package name */
    private int f11961k;

    /* renamed from: m  reason: collision with root package name */
    private TTAdDislike.DislikeInteractionCallback f11963m;

    /* renamed from: n  reason: collision with root package name */
    private Context f11964n;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11966p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11967q;

    /* renamed from: t  reason: collision with root package name */
    private NativeExpressView f11970t;

    /* renamed from: l  reason: collision with root package name */
    private int f11962l = 0;

    /* renamed from: o  reason: collision with root package name */
    private final Queue<Long> f11965o = new LinkedList();

    /* renamed from: r  reason: collision with root package name */
    private Double f11968r = null;

    /* renamed from: s  reason: collision with root package name */
    private String f11969s = "banner_ad";

    /* compiled from: TTBannerExpressAdImpl.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0169a {
        void a();
    }

    /* compiled from: TTBannerExpressAdImpl.java */
    /* loaded from: classes.dex */
    private static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f11984a;

        /* renamed from: b  reason: collision with root package name */
        n f11985b;

        /* renamed from: c  reason: collision with root package name */
        WeakReference<a> f11986c;

        b(boolean z10, n nVar, a aVar) {
            this.f11984a = z10;
            this.f11985b = nVar;
            this.f11986c = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<a> weakReference = this.f11986c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f11986c.get().a(this.f11984a, this.f11985b);
        }
    }

    public a(Context context, n nVar, AdSlot adSlot) {
        this.f11953b = context;
        this.f11954c = nVar;
        this.f11955d = adSlot;
        a(context, nVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void destroy() {
        BannerExpressView bannerExpressView = this.f11952a;
        if (bannerExpressView != null) {
            bannerExpressView.c();
        }
        c();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public String getAdCreativeToken() {
        return this.f11954c.n();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public View getExpressAdView() {
        return this.f11952a;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public List<FilterWord> getFilterWords() {
        n nVar = this.f11954c;
        if (nVar == null) {
            return null;
        }
        return nVar.ae();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getImageMode() {
        n nVar = this.f11954c;
        if (nVar == null) {
            return -1;
        }
        return nVar.ad();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getInteractionType() {
        n nVar = this.f11954c;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f11954c;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.f11967q) {
            return;
        }
        q.a(this.f11954c, d10, str, str2);
        this.f11967q = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void render() {
        this.f11952a.b();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (dislikeInteractionCallback == null || activity == null) {
            return;
        }
        this.f11963m = dislikeInteractionCallback;
        a(activity, dislikeInteractionCallback);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract == null) {
            l.b("dialog is null, please check");
            return;
        }
        this.f11957f = tTDislikeDialogAbstract;
        tTDislikeDialogAbstract.setMaterialMeta(this.f11954c);
        BannerExpressView bannerExpressView = this.f11952a;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.f11952a.getCurView().setOuterDislike(tTDislikeDialogAbstract);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f11956e = expressAdInteractionListener;
        this.f11952a.setExpressInteractionListener(expressAdInteractionListener);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d10) {
        this.f11968r = d10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setSlideIntervalTime(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.f11969s = "slide_banner_ad";
        a(this.f11952a.getCurView(), this.f11954c);
        this.f11952a.setDuration(1000);
        if (i10 < 30000) {
            i10 = 30000;
        } else if (i10 > 120000) {
            i10 = 120000;
        }
        this.f11961k = i10;
        this.f11960j = new x(Looper.getMainLooper(), this);
        this.f11955d.setIsRotateBanner(1);
        this.f11955d.setRotateTime(this.f11961k);
        this.f11955d.setRotateOrder(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        if (this.f11966p) {
            return;
        }
        q.a(this.f11954c, d10);
        this.f11966p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        x xVar = this.f11960j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages(null);
        }
    }

    private void d() {
        d.a(this.f11953b).a(this.f11955d, 1, null, new d.a() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.3
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.d.a
            public void a(List<n> list) {
                if (list == null || list.isEmpty()) {
                    a.this.b();
                    return;
                }
                n nVar = list.get(0);
                a aVar = a.this;
                aVar.f11952a.a(nVar, aVar.f11955d);
                a.this.b(nVar);
                a.this.f11952a.d();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.d.a
            public void a() {
                a.this.b();
            }
        }, jh.DEFAULT_BITMAP_TIMEOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(n nVar) {
        if (this.f11952a.getNextView() == null || !this.f11952a.f()) {
            return;
        }
        b(this.f11952a.getNextView(), nVar);
        a(this.f11952a.getNextView(), nVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f11956e = adInteractionListener;
        this.f11952a.setExpressInteractionListener(adInteractionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(n nVar) {
        Queue<Long> queue = this.f11965o;
        if (queue == null || queue.size() <= 0 || nVar == null) {
            return;
        }
        try {
            long longValue = this.f11965o.poll().longValue();
            if (longValue <= 0 || this.f11970t == null) {
                return;
            }
            e.a((System.currentTimeMillis() - longValue) + "", nVar, this.f11969s, this.f11970t.getAdShowTime());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Context context, n nVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, nVar, adSlot);
        this.f11952a = bannerExpressView;
        a(bannerExpressView.getCurView(), this.f11954c);
    }

    private void b(NativeExpressView nativeExpressView, n nVar) {
        if (nativeExpressView == null || nVar == null) {
            return;
        }
        if (this.f11963m != null) {
            this.f11958h.a(nVar);
            nativeExpressView.setDislike(this.f11958h);
        }
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f11957f;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
            nativeExpressView.setOuterDislike(this.f11957f);
        }
    }

    private void a(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (this.f11958h == null) {
            this.f11958h = new com.bytedance.sdk.openadsdk.dislike.b(activity, this.f11954c);
        }
        this.f11964n = activity;
        this.f11958h.setDislikeInteractionCallback(dislikeInteractionCallback);
        BannerExpressView bannerExpressView = this.f11952a;
        if (bannerExpressView == null || bannerExpressView.getCurView() == null) {
            return;
        }
        this.f11952a.getCurView().setDislike(this.f11958h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        x xVar = this.f11960j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages(null);
            this.f11960j.sendEmptyMessageDelayed(112202, 1000L);
        }
    }

    private c a(n nVar) {
        if (nVar.L() == 4) {
            return r3.d.a(this.f11953b, nVar, this.f11969s);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    public void a(final NativeExpressView nativeExpressView, final n nVar) {
        if (nativeExpressView == null || nVar == null) {
            return;
        }
        this.f11954c = nVar;
        this.f11959i = a(nVar);
        this.f11970t = nativeExpressView;
        final String a10 = com.bytedance.sdk.openadsdk.utils.l.a();
        final InterfaceC0169a a11 = a();
        nativeExpressView.setClosedListenerKey(a10);
        nativeExpressView.setBannerClickClosedListener(a11);
        nativeExpressView.setBackupListener(new com.bytedance.sdk.component.adexpress.b.c() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.1
            @Override // com.bytedance.sdk.component.adexpress.b.c
            public boolean a(ViewGroup viewGroup, int i10) {
                try {
                    nativeExpressView.m();
                    BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                    bannerExpressBackupView.setClosedListenerKey(a10);
                    a aVar = a.this;
                    bannerExpressBackupView.a(aVar.f11954c, nativeExpressView, aVar.f11959i);
                    bannerExpressBackupView.setDislikeInner(a.this.f11958h);
                    bannerExpressBackupView.setDislikeOuter(a.this.f11957f);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        e.a(nVar);
        EmptyView a12 = a(nativeExpressView);
        if (a12 == null) {
            a12 = new EmptyView(this.f11953b, nativeExpressView);
            nativeExpressView.addView(a12);
        }
        final EmptyView emptyView = a12;
        a12.setCallback(new EmptyView.a() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.2
            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void a(boolean z10) {
                if (z10) {
                    a.this.b();
                    l.b("TTBannerExpressAd", "Get focus, start timing");
                } else {
                    a.this.c();
                    l.b("TTBannerExpressAd", "Lose focus, stop timing");
                }
                com.bytedance.sdk.component.f.e.b().execute(new b(z10, nVar, a.this));
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void b() {
                a aVar = a.this;
                BannerExpressView bannerExpressView = aVar.f11952a;
                if (bannerExpressView != null && emptyView == aVar.a(bannerExpressView.getCurView())) {
                    a.this.c();
                }
                a.this.c(nVar);
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void a() {
                a.this.b();
            }

            @Override // com.bytedance.sdk.openadsdk.core.EmptyView.a
            public void a(View view) {
                BannerExpressView bannerExpressView;
                h.d().a(a10, a11);
                l.b("TTBannerExpressAd", "ExpressView SHOW");
                if (a.this.f11965o != null) {
                    a.this.f11965o.offer(Long.valueOf(System.currentTimeMillis()));
                }
                HashMap hashMap = new HashMap();
                NativeExpressView nativeExpressView2 = nativeExpressView;
                if (nativeExpressView2 != null) {
                    hashMap.put("dynamic_show_type", Integer.valueOf(nativeExpressView2.getDynamicShowType()));
                }
                if (view != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("width", view.getWidth());
                        jSONObject.put("height", view.getHeight());
                        jSONObject.put("alpha", view.getAlpha());
                    } catch (Throwable unused) {
                    }
                    hashMap.put("root_view", jSONObject.toString());
                }
                a aVar = a.this;
                e.a(aVar.f11953b, nVar, aVar.f11969s, hashMap, a.this.f11968r);
                TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = a.this.f11956e;
                if (expressAdInteractionListener != null) {
                    expressAdInteractionListener.onAdShow(view, nVar.L());
                }
                if (nVar.ai()) {
                    u.a(nVar, view);
                }
                a.this.b();
                if (!a.this.f12662g.getAndSet(true) && (bannerExpressView = a.this.f11952a) != null && bannerExpressView.getCurView() != null && a.this.f11952a.getCurView().getWebView() != null) {
                    a aVar2 = a.this;
                    v.a(aVar2.f11953b, aVar2.f11954c, aVar2.f11969s, a.this.f11952a.getCurView().getWebView().getWebView());
                }
                BannerExpressView bannerExpressView2 = a.this.f11952a;
                if (bannerExpressView2 == null || bannerExpressView2.getCurView() == null) {
                    return;
                }
                a.this.f11952a.getCurView().k();
                a.this.f11952a.getCurView().i();
            }
        });
        f fVar = new f(this.f11953b, nVar, this.f11969s, 2);
        fVar.a(nativeExpressView);
        fVar.a(this);
        fVar.a(this.f11959i);
        nativeExpressView.setClickListener(fVar);
        com.bytedance.sdk.openadsdk.core.nativeexpress.e eVar = new com.bytedance.sdk.openadsdk.core.nativeexpress.e(this.f11953b, nVar, this.f11969s, 2);
        eVar.a(nativeExpressView);
        eVar.a(this);
        eVar.a(this.f11959i);
        nativeExpressView.setClickCreativeListener(eVar);
        a12.setNeedCheckingShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, n nVar) {
        Long poll;
        try {
            if (z10) {
                this.f11965o.offer(Long.valueOf(System.currentTimeMillis()));
            } else if (this.f11965o.size() > 0 && this.f11970t != null && (poll = this.f11965o.poll()) != null) {
                long longValue = poll.longValue();
                e.a((System.currentTimeMillis() - longValue) + "", nVar, this.f11969s, this.f11970t.getAdShowTime());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EmptyView a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what == 112202) {
            if (com.bytedance.sdk.openadsdk.core.x.a(this.f11952a, 50, 1)) {
                this.f11962l += 1000;
            }
            if (this.f11962l >= this.f11961k) {
                d();
                AdSlot adSlot = this.f11955d;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.f11962l = 0;
                c();
                return;
            }
            b();
        }
    }

    public InterfaceC0169a a() {
        return new InterfaceC0169a() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.4
            @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.a.InterfaceC0169a
            public void a() {
                View inflate;
                int width = a.this.f11970t.getWidth();
                int height = a.this.f11970t.getHeight();
                if (height >= Math.floor((width * 450.0d) / 600.0d)) {
                    inflate = LayoutInflater.from(a.this.f11953b).inflate(t.f(a.this.f11953b, "tt_banner_ad_closed_300_250"), (ViewGroup) null, false);
                } else {
                    inflate = LayoutInflater.from(a.this.f11953b).inflate(t.f(a.this.f11953b, "tt_banner_ad_closed_320_50"), (ViewGroup) null, false);
                }
                a aVar = a.this;
                EmptyView a10 = aVar.a(aVar.f11970t);
                a.this.f11970t.removeAllViews();
                a.this.f11970t.addView(inflate, new ViewGroup.LayoutParams(width, height));
                inflate.findViewById(t.e(a.this.f11953b, "tt_ad_closed_page_logo")).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.4.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        a aVar2 = a.this;
                        TTWebsiteActivity.a(aVar2.f11953b, aVar2.f11954c, aVar2.f11969s);
                    }
                });
                TextView textView = (TextView) inflate.findViewById(t.e(a.this.f11953b, "tt_ad_closed_text"));
                textView.setText(t.a(a.this.f11953b, "tt_ad_is_closed"));
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.a.4.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        a aVar2 = a.this;
                        TTWebsiteActivity.a(aVar2.f11953b, aVar2.f11954c, aVar2.f11969s);
                    }
                });
                a.this.f11970t.setClickCreativeListener(null);
                a.this.f11970t.setClickListener(null);
                if (com.bytedance.sdk.openadsdk.core.m.h().n() == 1) {
                    a.this.c();
                } else if (a.this.f11961k != 0) {
                    a.this.f11970t.addView(a10);
                }
            }
        };
    }
}
