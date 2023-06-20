package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.r0;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f16694a;

    public a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f16694a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Drawable d10;
        Drawable d11;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            d10 = l.d(R.drawable.ia_ib_left_arrow);
        } else {
            d10 = l.d(R.drawable.ia_ib_unleft_arrow);
        }
        this.f16694a.f16685e.setImageDrawable(d10);
        if (webView.canGoForward()) {
            d11 = l.d(R.drawable.ia_ib_right_arrow);
        } else {
            d11 = l.d(R.drawable.ia_ib_unright_arrow);
        }
        this.f16694a.f16686f.setImageDrawable(d11);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f16694a.f16686f.setImageDrawable(l.d(R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.e("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        r.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        this.f16694a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (r0.a(str)) {
            this.f16694a.f16684d.loadUrl("chrome://crash");
            return true;
        }
        d0.a a10 = d0.a(this.f16694a.getApplicationContext(), str, true, d0.d.DO_NOT_OPEN_IN_INTERNAL_BROWSER, this.f16694a.f16682b);
        if (a10.f20243a != d0.c.FAILED) {
            InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = InneractiveInternalBrowserActivity.f16680j;
            if (internalBrowserListener != null) {
                internalBrowserListener.onApplicationInBackground();
            }
            InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f16694a;
            if (!inneractiveInternalBrowserActivity.f16689i) {
                inneractiveInternalBrowserActivity.f16689i = true;
                p pVar = p.FYBER_SUCCESS_CLICK;
                j jVar = this.f16694a.f16681a;
                InneractiveAdRequest inneractiveAdRequest = jVar != null ? jVar.f17239a : null;
                q.a aVar = new q.a(jVar != null ? jVar.c() : null);
                aVar.f17683c = pVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ImagesContract.URL, str);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", ImagesContract.URL, str);
                }
                String str2 = a10.f20243a.toString();
                try {
                    jSONObject.put("opened_from", str2);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "opened_from", str2);
                }
                try {
                    jSONObject.put("opened_by", "internal_browser");
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "opened_by", "internal_browser");
                }
                aVar.f17686f.put(jSONObject);
                aVar.a((String) null);
            }
            this.f16694a.finish();
            return true;
        }
        return !str.startsWith("http");
    }
}
