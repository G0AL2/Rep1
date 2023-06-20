package com.chartboost.sdk.impl;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.n0;
import com.chartboost.sdk.impl.n3;
import com.inmobi.media.au;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w0 extends WebChromeClient implements n3.a {

    /* renamed from: a  reason: collision with root package name */
    private final View f14382a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f14383b;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f14385d;

    /* renamed from: e  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f14386e;

    /* renamed from: f  reason: collision with root package name */
    private a f14387f;

    /* renamed from: g  reason: collision with root package name */
    private final com.chartboost.sdk.d f14388g;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f14389h;

    /* renamed from: j  reason: collision with root package name */
    private final v1 f14391j;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14384c = false;

    /* renamed from: i  reason: collision with root package name */
    private final n3 f14390i = new n3();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public w0(View view, ViewGroup viewGroup, com.chartboost.sdk.d dVar, Handler handler) {
        this.f14382a = view;
        this.f14383b = viewGroup;
        this.f14388g = dVar;
        this.f14389h = handler;
        this.f14391j = new v1(this, dVar);
    }

    private void a(String str) {
        n3 n3Var = this.f14390i;
        if (n3Var != null) {
            n3Var.a(str, this);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String simpleName = w0.class.getSimpleName();
        Log.d(simpleName, "Chartboost Webview:" + message + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        a(message);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        if (this.f14384c) {
            this.f14383b.setVisibility(4);
            this.f14383b.removeView(this.f14385d);
            this.f14382a.setVisibility(0);
            WebChromeClient.CustomViewCallback customViewCallback = this.f14386e;
            if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                this.f14386e.onCustomViewHidden();
            }
            this.f14384c = false;
            this.f14385d = null;
            this.f14386e = null;
            a aVar = this.f14387f;
            if (aVar != null) {
                aVar.a(false);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jsPromptResult.confirm(a(jSONObject.getJSONObject("eventArgs"), jSONObject.getString("eventType")));
            return true;
        } catch (JSONException unused) {
            CBLogging.b("CBWebChromeClient", "Exception caught parsing the function name from js to native");
            return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (view instanceof FrameLayout) {
            this.f14384c = true;
            this.f14385d = (FrameLayout) view;
            this.f14386e = customViewCallback;
            this.f14382a.setVisibility(4);
            this.f14383b.addView(this.f14385d, new ViewGroup.LayoutParams(-1, -1));
            this.f14383b.setVisibility(0);
            a aVar = this.f14387f;
            if (aVar != null) {
                aVar.a(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String a(JSONObject jSONObject, String str) {
        char c10;
        com.chartboost.sdk.Model.a aVar;
        this.f14391j.a(jSONObject);
        str.hashCode();
        switch (str.hashCode()) {
            case -2070199965:
                if (str.equals("closeVideo")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -2012425132:
                if (str.equals("getDefaultPosition")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1886160473:
                if (str.equals("playVideo")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1554056650:
                if (str.equals("currentVideoDuration")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1263203643:
                if (str.equals("openUrl")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1086137328:
                if (str.equals("videoCompleted")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -840405966:
                if (str.equals("unmute")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -715147645:
                if (str.equals("getScreenSize")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -640720077:
                if (str.equals("videoPlaying")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -55818203:
                if (str.equals("pauseVideo")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 3529469:
                if (str.equals("show")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 94750088:
                if (str.equals(au.CLICK_BEACON)) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 133423073:
                if (str.equals("setOrientationProperties")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 160987616:
                if (str.equals("getParameters")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 550290366:
                if (str.equals("rewardedVideoCompleted")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 937504109:
                if (str.equals("getOrientationProperties")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 939594121:
                if (str.equals("videoPaused")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1000390722:
                if (str.equals("videoReplay")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1082777163:
                if (str.equals("totalVideoDuration")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 1124446108:
                if (str.equals("warning")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 1270488759:
                if (str.equals("tracking")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 1880941391:
                if (str.equals("getMaxSize")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                this.f14389h.post(this.f14391j.f14346w);
                break;
            case 1:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.f14388g.k();
            case 2:
                this.f14389h.post(this.f14391j.f14344u);
                break;
            case 3:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.f14388g.j();
            case 4:
                this.f14389h.post(this.f14391j.f14329f);
                break;
            case 5:
                this.f14389h.post(this.f14391j.f14332i);
                break;
            case 6:
                this.f14389h.post(this.f14391j.f14336m);
                break;
            case 7:
                this.f14389h.post(this.f14391j.f14343t);
                break;
            case '\b':
                this.f14389h.post(this.f14391j.f14348y);
                break;
            case '\t':
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.f14388g.q();
            case '\n':
                this.f14389h.post(this.f14391j.f14338o);
                break;
            case 11:
                this.f14389h.post(this.f14391j.f14345v);
                break;
            case '\f':
                this.f14389h.post(this.f14391j.f14347x);
                break;
            case '\r':
                this.f14389h.post(this.f14391j.f14333j);
                break;
            case 14:
                this.f14389h.post(this.f14391j.f14327d);
                break;
            case 15:
                this.f14389h.post(this.f14391j.f14328e);
                break;
            case 16:
                this.f14389h.post(this.f14391j.f14330g);
                break;
            case 17:
                Log.d(y0.class.getName(), "Javascript Error occured");
                this.f14389h.post(this.f14391j.f14331h);
                break;
            case 18:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                this.f14389h.post(this.f14391j.f14341r);
                break;
            case 19:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                com.chartboost.sdk.Model.c cVar = this.f14388g.C;
                if (cVar == null || (aVar = cVar.f13699p) == null) {
                    return JsonUtils.EMPTY_JSON;
                }
                JSONObject a10 = n0.a(new n0.a[0]);
                for (Map.Entry<String, String> entry : aVar.f13661b.entrySet()) {
                    n0.a(a10, entry.getKey(), entry.getValue());
                }
                for (Map.Entry<String, com.chartboost.sdk.Model.b> entry2 : aVar.f13660a.entrySet()) {
                    com.chartboost.sdk.Model.b value = entry2.getValue();
                    n0.a(a10, entry2.getKey(), value.f13681a + "/" + value.f13682b);
                }
                return a10.toString();
            case 20:
                this.f14389h.post(this.f14391j.f14342s);
                break;
            case 21:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.f14388g.p();
            case 22:
                this.f14389h.post(this.f14391j.f14337n);
                break;
            case 23:
                this.f14389h.post(this.f14391j.f14339p);
                break;
            case 24:
                this.f14389h.post(this.f14391j.f14334k);
                break;
            case 25:
                Log.d(y0.class.getName(), "Javascript warning occurred");
                this.f14389h.post(this.f14391j.f14340q);
                break;
            case 26:
                this.f14389h.post(this.f14391j.f14335l);
                break;
            case 27:
                Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
                return this.f14388g.o();
            default:
                Log.e("CBWebChromeClient", "JavaScript to native " + str + " callback not recognized.");
                return "Function name not recognized.";
        }
        Log.d("CBWebChromeClient", "JavaScript to native " + str + " callback triggered.");
        return "Native function successfully called.";
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // com.chartboost.sdk.impl.n3.a
    public void a(JSONObject jSONObject) {
        a(jSONObject, "error");
    }
}
