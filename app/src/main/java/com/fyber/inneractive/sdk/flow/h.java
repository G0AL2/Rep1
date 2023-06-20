package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.a;
import com.fyber.inneractive.sdk.web.d;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class h extends c<com.fyber.inneractive.sdk.response.f, u> {

    /* renamed from: h  reason: collision with root package name */
    public IAmraidWebViewController f17234h;

    /* renamed from: i  reason: collision with root package name */
    public a.f f17235i = new a();

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17237a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f17237a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17237a[UnitDisplayType.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.c, com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f17198c != 0 && (iAmraidWebViewController = this.f17234h) != null) {
            iAmraidWebViewController.k();
            this.f17234h.l();
            this.f17234h = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public String b() {
        return "send_failed_display_creatives";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Response extends com.fyber.inneractive.sdk.response.e, T extends com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.flow.c
    public void e() {
        d.EnumC0274d enumC0274d;
        String str;
        String str2;
        u uVar = new u(c(), this.f17201f);
        this.f17198c = uVar;
        ?? r12 = this.f17197b;
        uVar.f17240b = r12;
        uVar.f17244f = this.f17202g;
        UnitDisplayType unitDisplayType = ((com.fyber.inneractive.sdk.response.f) r12).f20173n;
        d.g gVar = d.g.INLINE;
        if (unitDisplayType == null) {
            this.f17235i.a(null, InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i10 = b.f17237a[unitDisplayType.ordinal()];
        boolean z10 = false;
        if (i10 != 1 && i10 != 2) {
            enumC0274d = d.EnumC0274d.ENABLED;
        } else {
            enumC0274d = d.EnumC0274d.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f17196a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                gVar = d.g.INTERSTITIAL;
            }
        }
        d.g gVar2 = gVar;
        d.EnumC0274d enumC0274d2 = enumC0274d;
        boolean z11 = !((com.fyber.inneractive.sdk.response.f) this.f17197b).B.contains("iaNotifyLoadFinished");
        IAConfigManager iAConfigManager = IAConfigManager.J;
        try {
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(com.fyber.inneractive.sdk.util.l.f20301a, com.fyber.inneractive.sdk.util.g.a(unitDisplayType, iAConfigManager.f16886v.f16987b), gVar2, enumC0274d2, d.h.AD_CONTROLLED, z11, ((com.fyber.inneractive.sdk.config.global.features.h) this.f17201f.a(com.fyber.inneractive.sdk.config.global.features.h.class)).c() ? iAConfigManager.I : null);
            this.f17234h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f17198c);
            this.f17234h.setAdRequest(this.f17196a);
            InneractiveAdRequest inneractiveAdRequest2 = this.f17196a;
            if (inneractiveAdRequest2 != null && inneractiveAdRequest2.getSelectedUnitConfig() != null && ((com.fyber.inneractive.sdk.config.y) this.f17196a.getSelectedUnitConfig()).f17074c != null) {
                IAmraidWebViewController iAmraidWebViewController2 = this.f17234h;
                u uVar2 = (u) this.f17198c;
                uVar2.getClass();
                iAmraidWebViewController2.setMuteMraidVideo((iAConfigManager.f16876l || uVar2.f17244f) && ((com.fyber.inneractive.sdk.config.y) this.f17196a.getSelectedUnitConfig()).f17074c.f17018b != UnitDisplayType.REWARDED);
            }
            ((u) this.f17198c).f17297g = this.f17234h;
            Response response = this.f17197b;
            if (response != 0) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) response).f20173n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f17196a;
                z10 = (inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen()) ? true : true;
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z10) {
                    sb2.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String sb3 = sb2.toString();
                str2 = a(unitDisplayType2);
                str = sb3;
            } else {
                str = "";
                str2 = str;
            }
            this.f17234h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            this.f17234h.a(com.fyber.inneractive.sdk.config.a.a(), "" + ((com.fyber.inneractive.sdk.response.f) this.f17197b).B, str, str2, this.f17235i, TimeUnit.SECONDS.toMillis(iAConfigManager.f16887w.f16992a.f16987b.a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    public static String a(UnitDisplayType unitDisplayType) {
        StringBuilder sb2 = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb2.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb2.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb2.toString();
    }

    /* loaded from: classes.dex */
    public class a implements a.f {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.web.a.f
        public void a(com.fyber.inneractive.sdk.web.a aVar) {
            h hVar = h.this;
            hVar.getClass();
            IAlog.a("%sweb view returned onReady!", IAlog.a(hVar));
            Response response = h.this.f17197b;
            UnitDisplayType unitDisplayType = response != 0 ? ((com.fyber.inneractive.sdk.response.f) response).f20173n : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                h hVar2 = h.this;
                hVar2.getClass();
                try {
                    com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = hVar2.f17196a;
                    Content content = hVar2.f17198c;
                    q.a aVar2 = new q.a(content != 0 ? (com.fyber.inneractive.sdk.response.f) ((u) content).f17240b : null);
                    aVar2.f17683c = pVar;
                    aVar2.f17681a = inneractiveAdRequest;
                    aVar2.f17684d = null;
                    aVar2.a((String) null);
                } catch (Exception unused) {
                }
            }
            h.this.d();
        }

        @Override // com.fyber.inneractive.sdk.web.a.f
        public void a(com.fyber.inneractive.sdk.web.a aVar, InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            h.this.a((InneractiveError) inneractiveInfrastructureError);
            h hVar = h.this;
            hVar.getClass();
            IAlog.a("%sweb view returned onFailedLoading!", IAlog.a(hVar));
            h.this.a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.MRAID_ERROR_UNSECURE_CONTENT;
                h hVar2 = h.this;
                InneractiveAdRequest inneractiveAdRequest = hVar2.f17196a;
                Response response = hVar2.f17197b;
                JSONArray c10 = hVar2.f17201f.c();
                q.a aVar2 = new q.a(response);
                aVar2.f17682b = oVar;
                aVar2.f17681a = inneractiveAdRequest;
                aVar2.f17684d = c10;
                aVar2.a((String) null);
            }
        }
    }
}
