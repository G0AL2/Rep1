package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.b.c;
import com.iab.omid.library.fyber.b.f;
import com.iab.omid.library.fyber.d.e;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a extends AdSession {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f24022a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b  reason: collision with root package name */
    private final AdSessionContext f24023b;

    /* renamed from: c  reason: collision with root package name */
    private final AdSessionConfiguration f24024c;

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.fyber.e.a f24026e;

    /* renamed from: f  reason: collision with root package name */
    private AdSessionStatePublisher f24027f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f24031j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24032k;

    /* renamed from: l  reason: collision with root package name */
    private PossibleObstructionListener f24033l;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f24025d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f24028g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f24029h = false;

    /* renamed from: i  reason: collision with root package name */
    private final String f24030i = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f24024c = adSessionConfiguration;
        this.f24023b = adSessionContext;
        c(null);
        this.f24027f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24027f.a();
        com.iab.omid.library.fyber.b.a.a().a(this);
        this.f24027f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f24025d) {
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
            if (!f24022a.matcher(str).matches()) {
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
        this.f24026e = new com.iab.omid.library.fyber.e.a(view);
    }

    private void d(View view) {
        Collection<a> b10 = com.iab.omid.library.fyber.b.a.a().b();
        if (b10 == null || b10.isEmpty()) {
            return;
        }
        for (a aVar : b10) {
            if (aVar != this && aVar.e() == view) {
                aVar.f24026e.clear();
            }
        }
    }

    private void k() {
        if (this.f24031j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.f24032k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public List<c> a() {
        return this.f24025d;
    }

    public void a(List<com.iab.omid.library.fyber.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            for (com.iab.omid.library.fyber.e.a aVar : list) {
                View view = aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24033l.onPossibleObstructionsDetected(this.f24030i, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24032k = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24029h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f24025d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public boolean b() {
        return this.f24033l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.f24031j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.f24032k = true;
    }

    public View e() {
        return this.f24026e.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24029h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24028g && !this.f24029h;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f24029h) {
            return;
        }
        this.f24026e.clear();
        removeAllFriendlyObstructions();
        this.f24029h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.fyber.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f24027f = null;
        this.f24033l = null;
    }

    public boolean g() {
        return this.f24028g;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public String getAdSessionId() {
        return this.f24030i;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24027f;
    }

    public boolean h() {
        return this.f24029h;
    }

    public boolean i() {
        return this.f24024c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f24024c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24029h) {
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

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24029h) {
            return;
        }
        this.f24025d.clear();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24029h) {
            return;
        }
        b(view);
        c a10 = a(view);
        if (a10 != null) {
            this.f24025d.remove(a10);
        }
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24033l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f24028g) {
            return;
        }
        this.f24028g = true;
        com.iab.omid.library.fyber.b.a.a().b(this);
        this.f24027f.a(f.a().d());
        this.f24027f.a(this, this.f24023b);
    }
}
