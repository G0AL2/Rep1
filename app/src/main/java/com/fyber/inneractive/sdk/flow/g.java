package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v0;
import com.fyber.inneractive.sdk.web.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f17213a;

    /* renamed from: b  reason: collision with root package name */
    public final InneractiveAdRequest f17214b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f17215c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17216d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.b f17217e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17218f = false;

    /* renamed from: g  reason: collision with root package name */
    public View f17219g = null;

    /* renamed from: h  reason: collision with root package name */
    public Context f17220h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.c f17221i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17222j;

    /* renamed from: k  reason: collision with root package name */
    public j0 f17223k;

    /* renamed from: l  reason: collision with root package name */
    public UnitDisplayType f17224l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f17225m;

    /* renamed from: n  reason: collision with root package name */
    public int f17226n;

    /* renamed from: o  reason: collision with root package name */
    public int f17227o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.z f17228p;

    /* renamed from: q  reason: collision with root package name */
    public int f17229q;

    /* loaded from: classes.dex */
    public class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.model.vast.c f17230a;

        public a(com.fyber.inneractive.sdk.model.vast.c cVar) {
            this.f17230a = cVar;
        }

        @Override // com.fyber.inneractive.sdk.web.a.f
        public void a(com.fyber.inneractive.sdk.web.a aVar) {
            g.this.f17218f = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
        @Override // com.fyber.inneractive.sdk.web.a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.fyber.inneractive.sdk.web.a r7, com.fyber.inneractive.sdk.external.InneractiveErrorCode r8) {
            /*
                r6 = this;
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.fyber.inneractive.sdk.flow.g r8 = com.fyber.inneractive.sdk.flow.g.this
                java.lang.String r8 = com.fyber.inneractive.sdk.util.IAlog.a(r8)
                r7.append(r8)
                java.lang.String r8 = " Fetching companion html failed!"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.util.IAlog.a(r7, r0)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.g.this
                com.fyber.inneractive.sdk.flow.g.a(r7, r8)
                com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.h.Gif
                com.fyber.inneractive.sdk.model.vast.c r0 = r6.f17230a
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f17396b
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 == 0) goto L3e
                com.fyber.inneractive.sdk.model.vast.c r7 = r6.f17230a
                java.lang.String r1 = r7.f17400f
                com.fyber.inneractive.sdk.model.vast.h r7 = r7.f17396b
                boolean r7 = com.fyber.inneractive.sdk.util.v0.a(r1, r7)
                if (r7 == 0) goto L3c
                goto L3e
            L3c:
                r7 = 0
                goto L3f
            L3e:
                r7 = 1
            L3f:
                com.fyber.inneractive.sdk.flow.g r1 = com.fyber.inneractive.sdk.flow.g.this
                int r2 = r1.f17229q
                int r3 = r1.f17213a
                if (r2 > r3) goto L5e
                if (r7 == 0) goto L5e
                java.lang.Object[] r7 = new java.lang.Object[r0]
                java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r6)
                r7[r8] = r0
                java.lang.String r8 = "%sloadHtmlCompanion retry"
                com.fyber.inneractive.sdk.util.IAlog.a(r8, r7)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.g.this
                com.fyber.inneractive.sdk.model.vast.c r8 = r6.f17230a
                r7.a(r8)
                goto Lad
            L5e:
                r2 = 0
                if (r7 != 0) goto L75
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r3 = com.fyber.inneractive.sdk.network.o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r1.f17214b
                com.fyber.inneractive.sdk.response.g r1 = r1.f17215c
                r7.<init>(r1)
                r7.f17682b = r3
                r7.f17681a = r4
                r7.f17684d = r2
                r7.a(r2)
            L75:
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.o.VAST_COMPANION_FAILED_LOADING
                com.fyber.inneractive.sdk.flow.g r3 = com.fyber.inneractive.sdk.flow.g.this
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r3.f17214b
                com.fyber.inneractive.sdk.response.g r5 = r3.f17215c
                com.fyber.inneractive.sdk.config.global.s r3 = r3.f17216d
                org.json.JSONArray r3 = r3.c()
                r7.<init>(r5)
                r7.f17682b = r1
                r7.f17681a = r4
                r7.f17684d = r3
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "companion_data"
                r1[r8] = r3
                com.fyber.inneractive.sdk.model.vast.c r3 = r6.f17230a
                org.json.JSONObject r3 = r3.a()
                r1[r0] = r3
                r7.a(r1)
                r7.a(r2)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.g.this
                com.fyber.inneractive.sdk.flow.g.a(r7, r8)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.g.this
                r7.a()
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.g.a.a(com.fyber.inneractive.sdk.web.a, com.fyber.inneractive.sdk.external.InneractiveErrorCode):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements com.fyber.inneractive.sdk.network.u<j0.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.model.vast.c f17232a;

        public b(com.fyber.inneractive.sdk.model.vast.c cVar) {
            this.f17232a = cVar;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(j0.a aVar, Exception exc, boolean z10) {
            View view;
            j0.a aVar2 = aVar;
            g.this.f17219g = new ImageView(g.this.f17220h);
            g.this.f17219g.setId(R.id.inneractive_vast_endcard_static);
            g.this.f17219g.setContentDescription("inneractive_vast_endcard_static");
            if (exc == null && aVar2 != null && aVar2.f17576b == null) {
                Bitmap bitmap = aVar2.f17575a;
                if (bitmap == null || (view = g.this.f17219g) == null) {
                    return;
                }
                ((ImageView) view).setImageBitmap(bitmap);
                g.this.f17218f = true;
                return;
            }
            IAlog.a("%s Fetching companion image failed!", IAlog.a(g.this));
            com.fyber.inneractive.sdk.model.vast.c cVar = this.f17232a;
            boolean a10 = v0.a(cVar.f17400f, cVar.f17396b);
            if ((aVar2 == null || (aVar2.f17576b != null && ((exc instanceof com.fyber.inneractive.sdk.network.b) || (exc instanceof UnknownHostException)))) && a10) {
                g gVar = g.this;
                if (gVar.f17229q <= gVar.f17213a) {
                    IAlog.a("%sloadStaticCompanion retry", IAlog.a(this));
                    g.this.b(this.f17232a);
                    return;
                }
            }
            if (!a10) {
                g gVar2 = g.this;
                gVar2.getClass();
                new q.a(com.fyber.inneractive.sdk.network.o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE, gVar2.f17214b, gVar2.f17215c, (JSONArray) null).a((String) null);
            }
            com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.VAST_COMPANION_FAILED_LOADING;
            g gVar3 = g.this;
            q.a aVar3 = new q.a(oVar, gVar3.f17214b, gVar3.f17215c, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            JSONObject a11 = this.f17232a.a();
            try {
                jSONObject.put("companion_data", a11);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "companion_data", a11);
            }
            if (aVar2 != null && !TextUtils.isEmpty(aVar2.f17576b)) {
                String str = aVar2.f17576b;
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, str);
                }
            }
            aVar3.f17686f.put(jSONObject);
            aVar3.a((String) null);
            g.this.a();
        }
    }

    public g(Context context, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.s sVar) {
        this.f17213a = 2;
        this.f17217e = gVar.f();
        this.f17220h = context;
        this.f17215c = gVar;
        this.f17214b = inneractiveAdRequest;
        this.f17216d = sVar;
        this.f17213a = IAConfigManager.b().a().a("companion_retry_count", 2, 0);
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.c cVar) {
        String replace;
        String str;
        if (b.a.f17184a.f17183a.containsKey(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML)) {
            b();
            this.f17229q++;
            int i10 = IAlog.f20222a;
            IAlog.a(1, null, "%s: %s", "COMPANION_TYPE", cVar.f17395a.name());
            com.fyber.inneractive.sdk.player.controller.c cVar2 = new com.fyber.inneractive.sdk.player.controller.c(this.f17220h, this.f17224l, this.f17225m, this.f17226n, this.f17227o, this.f17228p, cVar.f17395a);
            this.f17221i = cVar2;
            IAmraidWebViewController iAmraidWebViewController = cVar2.f17864a;
            this.f17219g = iAmraidWebViewController == null ? null : iAmraidWebViewController.f20365b;
            a aVar = new a(cVar);
            String str2 = cVar.f17400f;
            com.fyber.inneractive.sdk.model.vast.g gVar = cVar.f17395a;
            if (gVar == com.fyber.inneractive.sdk.model.vast.g.Iframe) {
                String c10 = com.fyber.inneractive.sdk.util.l.c("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(c10)) {
                    replace = c10.replace("$__IMGSRC__$", cVar.f17400f).replace("$__SrcIframeUrl__$", cVar.f17400f);
                    str = replace;
                }
                str = str2;
            } else {
                if (gVar == com.fyber.inneractive.sdk.model.vast.g.Static && cVar.f17396b == com.fyber.inneractive.sdk.model.vast.h.Gif) {
                    if (iAmraidWebViewController != null) {
                        WebSettings settings = iAmraidWebViewController.f20365b.getSettings();
                        if (Build.VERSION.SDK_INT >= 17) {
                            settings.setMediaPlaybackRequiresUserGesture(false);
                        }
                        settings.setLoadWithOverviewMode(true);
                        settings.setUseWideViewPort(true);
                    }
                    IAmraidWebViewController iAmraidWebViewController2 = this.f17221i.f17864a;
                    if (iAmraidWebViewController2 != null) {
                        iAmraidWebViewController2.Y = false;
                    }
                    String c11 = com.fyber.inneractive.sdk.util.l.c("fyb_static_endcard_tmpl.html");
                    if (!TextUtils.isEmpty(c11)) {
                        str2 = c11.replace("$__IMGSRC__$", cVar.f17400f);
                    }
                    String str3 = cVar.f17401g;
                    if (str3 != null) {
                        replace = str2.replace("$__IMGHREF__$", str3.replace("\"", "\\\""));
                        str = replace;
                    }
                }
                str = str2;
            }
            if (cVar2.f17864a != null && !TextUtils.isEmpty(str)) {
                cVar2.f17864a.setAutoplayMRAIDVideos(cVar2.f17866c.isFullscreenUnit());
                cVar2.f17864a.setCenteringTagsRequired(false);
                IAmraidWebViewController iAmraidWebViewController3 = cVar2.f17864a;
                String a10 = com.fyber.inneractive.sdk.config.a.a();
                UnitDisplayType unitDisplayType = cVar2.f17866c;
                boolean z10 = cVar2.f17868e;
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType != null && unitDisplayType.isFullscreenUnit() && !z10) {
                    sb2.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                iAmraidWebViewController3.a(a10, str, sb2.toString(), h.a(cVar2.f17866c), aVar, 10000L);
                return;
            }
            aVar.a(null, InneractiveErrorCode.UNSPECIFIED);
        }
    }

    public final void b() {
        com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.f17214b;
        com.fyber.inneractive.sdk.response.g gVar = this.f17215c;
        com.fyber.inneractive.sdk.config.global.s sVar = this.f17216d;
        JSONArray c10 = sVar == null ? null : sVar.c();
        q.a aVar = new q.a(gVar);
        aVar.f17683c = pVar;
        aVar.f17681a = inneractiveAdRequest;
        aVar.f17684d = c10;
        aVar.a((String) null);
    }

    public final void b(com.fyber.inneractive.sdk.model.vast.c cVar) {
        b();
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s: %s", "COMPANION_TYPE", cVar.f17395a.name());
        this.f17229q++;
        j0 j0Var = new j0(new b(cVar), cVar.f17400f);
        this.f17223k = j0Var;
        IAConfigManager.J.f16884t.c(j0Var);
    }

    public void a() {
        boolean z10;
        if (this.f17218f) {
            return;
        }
        IAlog.a("%sloadNextVastCompanion called", IAlog.a(this));
        this.f17222j = false;
        this.f17219g = null;
        if (this.f17217e == null) {
            IAlog.a("%svast data is null! Object must have already been destroyed", IAlog.a(this));
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f17217e.f17391f.size() == 0) {
            IAlog.b("%sgetNextIAvastCompanion - No companion ads found", IAlog.a(this));
            z10 = false;
        }
        if (!z10) {
            IAlog.a("%sno more companion ads available.", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f17217e;
        com.fyber.inneractive.sdk.model.vast.c poll = bVar.f17391f.poll();
        bVar.f17392g = poll;
        IAlog.a("%sgetNextIAvastCompanion returning: %s", IAlog.a(this), poll);
        this.f17229q = 0;
        if (poll != null) {
            if (poll.f17395a == com.fyber.inneractive.sdk.model.vast.g.Static && !com.fyber.inneractive.sdk.model.vast.h.Gif.equals(poll.f17396b)) {
                b(poll);
            } else {
                a(poll);
            }
        }
    }
}
