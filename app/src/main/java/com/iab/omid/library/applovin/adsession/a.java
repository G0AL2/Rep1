package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.b.c;
import com.iab.omid.library.applovin.b.f;
import com.iab.omid.library.applovin.d.e;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f23904a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f23905b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f23906c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.applovin.e.a f23908e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f23909f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f23913j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23914k;

    /* renamed from: l  reason: collision with root package name */
    private PossibleObstructionListener f23915l;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f23907d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f23910g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23911h = false;

    /* renamed from: i  reason: collision with root package name */
    private final String f23912i = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f23906c = adSessionConfiguration;
        this.f23905b = adSessionContext;
        c(null);
        this.f23909f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23909f.a();
        com.iab.omid.library.applovin.b.a.a().a(this);
        this.f23909f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f23907d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f23904a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f23908e = new com.iab.omid.library.applovin.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.applovin.b.a.a().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.e() == view) {
                aVar.f23908e.clear();
            }
        }
    }

    private void k() {
        if (this.f23913j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.f23914k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f23907d;
    }

    public void a(List<com.iab.omid.library.applovin.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.applovin.e.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23915l.onPossibleObstructionsDetected(this.f23912i, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.f23914k = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23911h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f23907d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public boolean b() {
        return this.f23915l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.f23913j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.f23914k = true;
    }

    public View e() {
        return this.f23908e.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23911h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f23910g && !this.f23911h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f23911h) {
            return;
        }
        this.f23908e.clear();
        removeAllFriendlyObstructions();
        this.f23911h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.applovin.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f23909f = null;
        this.f23915l = null;
    }

    public boolean g() {
        return this.f23910g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f23912i;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f23909f;
    }

    public boolean h() {
        return this.f23911h;
    }

    public boolean i() {
        return this.f23906c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f23906c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23911h) {
            return;
        }
        e.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23911h) {
            return;
        }
        this.f23907d.clear();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23911h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f23907d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23915l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f23910g) {
            return;
        }
        this.f23910g = true;
        com.iab.omid.library.applovin.b.a.a().b(this);
        this.f23909f.a(f.a().d());
        this.f23909f.a(this, this.f23905b);
    }
}
