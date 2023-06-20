package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w0;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class s<AdContent extends j, EventsListener extends InneractiveUnitController.EventsListener> extends l<AdContent, EventsListener> implements com.fyber.inneractive.sdk.interfaces.c {

    /* renamed from: k  reason: collision with root package name */
    public c.a f17282k;

    /* renamed from: l  reason: collision with root package name */
    public Runnable f17283l;

    /* renamed from: m  reason: collision with root package name */
    public w0 f17284m;

    /* renamed from: n  reason: collision with root package name */
    public Runnable f17285n;

    /* renamed from: o  reason: collision with root package name */
    public w0 f17286o;

    /* renamed from: r  reason: collision with root package name */
    public long f17289r;

    /* renamed from: v  reason: collision with root package name */
    public CountDownTimer f17293v;

    /* renamed from: p  reason: collision with root package name */
    public boolean f17287p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17288q = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f17290s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17291t = false;

    /* renamed from: u  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f17292u = new com.fyber.inneractive.sdk.util.a();

    /* loaded from: classes.dex */
    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CountDownTimer countDownTimer = s.this.f17293v;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            s.this.e(false);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            int i10 = ((int) j10) / 1000;
            c.a aVar = s.this.f17282k;
            if (aVar != null) {
                aVar.updateCloseCountdown(i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements w0.b {
        public b() {
        }

        @Override // com.fyber.inneractive.sdk.util.w0.b
        public void a(w0 w0Var) {
            com.fyber.inneractive.sdk.util.n.f20310b.post(s.this.f17283l);
            s sVar = s.this;
            w0 w0Var2 = sVar.f17284m;
            if (w0Var2 != null) {
                w0Var2.f20351e = null;
                sVar.f17284m = null;
            }
            sVar.f17288q = false;
        }
    }

    public abstract boolean E();

    public void F() {
        if (this.f17283l == null) {
            this.f17289r = I();
            AdContent adcontent = this.f17247b;
            boolean b10 = adcontent != null ? b((s<AdContent, EventsListener>) adcontent) : false;
            this.f17283l = new r(this, this.f17289r);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.f17289r));
            if (!b10 || E()) {
                K();
            } else if (b10) {
                c.a aVar = this.f17282k;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                a aVar2 = new a(100 + this.f17289r, 1000L);
                this.f17293v = aVar2;
                aVar2.start();
            }
        }
    }

    public abstract int G();

    public abstract int H();

    public abstract long I();

    public abstract boolean J();

    public void K() {
        if (this.f17288q) {
            return;
        }
        this.f17288q = true;
        w0 w0Var = new w0(TimeUnit.MILLISECONDS, this.f17289r);
        this.f17284m = w0Var;
        w0Var.f20351e = new b();
        w0Var.c();
    }

    public abstract long a(long j10);

    public abstract boolean b(AdContent adcontent);

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void c(boolean z10) {
    }

    public void d(boolean z10) {
        q.a aVar;
        if (this.f17247b == null) {
            com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.MRAID_CUSTOM_CLOSE_DETECTED;
            aVar = new q.a(null);
            aVar.f17683c = pVar;
            aVar.f17681a = null;
            aVar.f17684d = null;
        } else {
            com.fyber.inneractive.sdk.network.p pVar2 = com.fyber.inneractive.sdk.network.p.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.f17247b;
            InneractiveAdRequest inneractiveAdRequest = adcontent.f17239a;
            com.fyber.inneractive.sdk.response.e c10 = adcontent.c();
            JSONArray c11 = this.f17247b.f17241c.c();
            aVar = new q.a(c10);
            aVar.f17683c = pVar2;
            aVar.f17681a = inneractiveAdRequest;
            aVar.f17684d = c11;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z10);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f17686f.put(jSONObject);
        aVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f17283l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
            this.f17283l = null;
        }
        Runnable runnable2 = this.f17285n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable2);
            this.f17285n = null;
        }
        c.a aVar = this.f17282k;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f17282k = null;
        CountDownTimer countDownTimer = this.f17293v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f17293v = null;
        }
        w0 w0Var = this.f17286o;
        if (w0Var != null) {
            w0Var.f20351e = null;
            this.f17286o = null;
        }
        w0 w0Var2 = this.f17284m;
        if (w0Var2 != null) {
            w0Var2.f20351e = null;
            this.f17284m = null;
        }
        super.destroy();
    }

    public void e(boolean z10) {
        q.a aVar;
        this.f17287p = true;
        if (z10) {
            if (this.f17247b == null) {
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.FAIL_SAFE_ACTIVATED;
                aVar = new q.a(null);
                aVar.f17683c = pVar;
                aVar.f17681a = null;
                aVar.f17684d = null;
            } else {
                com.fyber.inneractive.sdk.network.p pVar2 = com.fyber.inneractive.sdk.network.p.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.f17247b;
                InneractiveAdRequest inneractiveAdRequest = adcontent.f17239a;
                com.fyber.inneractive.sdk.response.e c10 = adcontent.c();
                JSONArray c11 = this.f17247b.f17241c.c();
                aVar = new q.a(c10);
                aVar.f17683c = pVar2;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c11;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(J());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f17686f.put(jSONObject);
            aVar.a((String) null);
        }
        c.a aVar2 = this.f17282k;
        if (aVar2 != null) {
            aVar2.showCloseButton(z10, H(), G());
            if (z10) {
                return;
            }
            this.f17292u.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f17246a = inneractiveAdSpot;
        this.f17247b = (AdContent) inneractiveAdSpot.getAdContent();
        this.f17248c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.f17292u.f20225a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        w0 w0Var = this.f17284m;
        if (w0Var != null) {
            w0Var.b();
        }
        w0 w0Var2 = this.f17286o;
        if (w0Var2 != null) {
            w0Var2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void s() {
        w0 w0Var = this.f17284m;
        if (w0Var != null) {
            w0Var.a();
        }
        w0 w0Var2 = this.f17286o;
        if (w0Var2 != null) {
            w0Var2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.l
    public int w() {
        c.a aVar = this.f17282k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f17282k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.l
    public int x() {
        c.a aVar = this.f17282k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f17282k.getLayout().getWidth();
    }

    @Override // com.fyber.inneractive.sdk.flow.l
    public void z() {
        super.z();
    }

    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.f17246a == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.f17282k = aVar;
        } else {
            IAlog.e("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}
