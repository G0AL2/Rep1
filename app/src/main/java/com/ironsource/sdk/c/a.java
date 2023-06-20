package com.ironsource.sdk.c;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public c f27635a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27636b;

    /* renamed from: com.ironsource.sdk.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    final class RunnableC0344a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27637a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27638b;

        RunnableC0344a(String str, String str2) {
            this.f27637a = str;
            this.f27638b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.removeView(aVar.f27635a.f27644c);
            a.this.f27635a.a(this.f27637a, this.f27638b);
            a.b(a.this, null);
        }
    }

    public a(c cVar, Context context) {
        super(context);
        this.f27636b = false;
        com.ironsource.sdk.a aVar = cVar.f27646e;
        setLayoutParams(new FrameLayout.LayoutParams(aVar.f27572a, aVar.f27573b));
        this.f27635a = cVar;
        addView(cVar.f27644c);
    }

    static /* synthetic */ c b(a aVar, c cVar) {
        aVar.f27635a = null;
        return null;
    }

    public void a() {
        JSONObject jSONObject;
        try {
            jSONObject = this.f27635a.f27645d.a().getJSONObject("configs").getJSONObject("visibilityParams");
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f27635a.f27642a).put("isBNAutoRemove", false).put("isBannerDisplay", this.f27636b);
        this.f27635a.f27645d.a("destroyBanner", jSONObject);
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        com.ironsource.sdk.b.b bVar;
        c cVar = this.f27635a;
        if (cVar != null && (bVar = cVar.f27645d) != null && cVar.f27644c != null) {
            if (bVar.f27614a != null && bVar.f27615b != null) {
                bVar.a("containerWasRemoved", bVar.a());
            }
            com.ironsource.environment.e.a.f26152a.a(new RunnableC0344a(str, str2));
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        c cVar = this.f27635a;
        if (cVar == null) {
            return;
        }
        cVar.a(str, str2, str3);
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        this.f27635a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView b() {
        return this.f27635a.f27644c;
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        this.f27635a.b(jSONObject, str, str2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("IronSourceAdContainer", "onAttachedToWindow:");
        this.f27636b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        String str;
        com.ironsource.sdk.b.b bVar;
        JSONObject jSONObject;
        super.onDetachedFromWindow();
        Logger.i("IronSourceAdContainer", "onDetachedFromWindow:");
        c cVar = this.f27635a;
        if (cVar == null || (bVar = cVar.f27645d) == null) {
            str = "in onDetachedFromWindow mAdPresenter or mAdPresenter.getLogic() are null";
        } else {
            this.f27636b = false;
            try {
                try {
                    jSONObject = bVar.a().getJSONObject("configs").getJSONObject("visibilityParams");
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("adViewId", this.f27635a.f27642a).put("isBNAutoRemove", true).put("isBannerDisplay", this.f27636b);
                this.f27635a.f27645d.a("destroyBanner", jSONObject);
                return;
            } catch (Exception e10) {
                str = e10.toString();
            }
        }
        Logger.i("IronSourceAdContainer", str);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i10) {
        Logger.i("IronSourceAdContainer", "onVisibilityChanged: " + i10);
        c cVar = this.f27635a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.f27645d.a("isVisible", i10, isShown());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        Logger.i("IronSourceAdContainer", "onWindowVisibilityChanged: " + i10);
        c cVar = this.f27635a;
        if (cVar == null) {
            return;
        }
        try {
            cVar.f27645d.a("isWindowVisible", i10, isShown());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
