package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.api.Api;
import com.inmobi.media.ce;
import com.inmobi.media.eu;
import com.inmobi.media.ff;
import com.inmobi.media.fj;
import com.inmobi.media.n;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: NativeLayoutInflater.java */
/* loaded from: classes3.dex */
public final class fc implements ff.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25343d = "fc";

    /* renamed from: m  reason: collision with root package name */
    private static Handler f25344m = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    fl f25347c;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<Context> f25348e;

    /* renamed from: f  reason: collision with root package name */
    private final bx f25349f;

    /* renamed from: g  reason: collision with root package name */
    private final n f25350g;

    /* renamed from: h  reason: collision with root package name */
    private final fq f25351h;

    /* renamed from: i  reason: collision with root package name */
    private c f25352i;

    /* renamed from: j  reason: collision with root package name */
    private a f25353j;

    /* renamed from: k  reason: collision with root package name */
    private b f25354k;

    /* renamed from: l  reason: collision with root package name */
    private fg f25355l;

    /* renamed from: o  reason: collision with root package name */
    private q f25357o;

    /* renamed from: a  reason: collision with root package name */
    int f25345a = 0;

    /* renamed from: n  reason: collision with root package name */
    private boolean f25356n = false;

    /* renamed from: b  reason: collision with root package name */
    public final eu f25346b = new eu();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeLayoutInflater.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(View view, bt btVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeLayoutInflater.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(cd cdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeLayoutInflater.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(int i10, bt btVar);
    }

    public fc(Context context, fq fqVar, n nVar, bx bxVar, c cVar, a aVar, b bVar) {
        this.f25348e = new WeakReference<>(context);
        this.f25350g = nVar;
        this.f25349f = bxVar;
        this.f25352i = cVar;
        this.f25353j = aVar;
        this.f25354k = bVar;
        this.f25351h = fqVar;
        this.f25347c = fl.a(context);
    }

    private Context c() {
        return this.f25348e.get();
    }

    private int d() {
        if (this.f25345a == 0) {
            return 8388611;
        }
        return this.f25349f.c() - 1 == this.f25345a ? 8388613 : 1;
    }

    public final fe a(fe feVar, ViewGroup viewGroup, q qVar) {
        this.f25357o = qVar;
        fe a10 = a(feVar, viewGroup);
        if (!this.f25356n) {
            b(a10, this.f25349f.f24852d);
        }
        return a10;
    }

    public final fe b(fe feVar, final ViewGroup viewGroup, q qVar) {
        this.f25357o = qVar;
        final fe a10 = a(feVar, viewGroup);
        f25344m.post(new Runnable() { // from class: com.inmobi.media.fc.1
            @Override // java.lang.Runnable
            public final void run() {
                if (fc.this.f25356n) {
                    return;
                }
                fc fcVar = fc.this;
                fcVar.b(a10, fcVar.f25349f.f24852d);
            }
        });
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.inmobi.media.ff$a, com.inmobi.media.fc] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ViewGroup b(android.view.ViewGroup r9, com.inmobi.media.bv r10) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.fc.b(android.view.ViewGroup, com.inmobi.media.bv):android.view.ViewGroup");
    }

    private fe a(fe feVar, ViewGroup viewGroup) {
        fe feVar2 = feVar == null ? (fe) this.f25347c.a(c(), this.f25349f.f24852d, this.f25351h) : feVar;
        if (feVar2 != null && feVar != null) {
            a(feVar2);
            this.f25347c.a((ViewGroup) feVar2);
            fl.a(feVar2, this.f25349f.f24852d.f24811c);
        }
        fl.b(this.f25349f.f24852d.f24811c.f24834a.x);
        feVar2.setLayoutParams(fl.a(this.f25349f.f24852d, viewGroup));
        return feVar2;
    }

    private static void a(fe feVar) {
        ViewParent parent = feVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(feVar);
        }
    }

    public final ViewGroup a(ViewGroup viewGroup, bv bvVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.f25347c.a(c(), bvVar, this.f25351h);
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(fl.a(bvVar, viewGroup));
        }
        return viewGroup2;
    }

    @Override // com.inmobi.media.ff.a
    public final int a(int i10) {
        this.f25345a = i10;
        this.f25352i.a(i10, this.f25349f.a(i10));
        return d();
    }

    private void a(final cd cdVar, ce ceVar) {
        ceVar.setTimerEventsListener(new ce.b() { // from class: com.inmobi.media.fc.2
            @Override // com.inmobi.media.ce.b
            public final void a() {
                if (fc.this.f25354k != null) {
                    fc.this.f25354k.a(cdVar);
                }
            }
        });
    }

    private void a(View view, final bt btVar) {
        boolean z10;
        final List<eu.a> a10 = this.f25346b.a(view, btVar);
        if (a10 == null) {
            Iterator<cf> it = btVar.f24829u.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if ("creativeView".equals(it.next().f24922d)) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return;
            }
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.inmobi.media.fc.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                fc.this.f25346b.a(a10);
                n unused = fc.this.f25350g;
                bt a11 = n.a(fc.this.f25350g.h(), btVar);
                bt btVar2 = btVar;
                n nVar = fc.this.f25350g;
                if (a11 == null) {
                    a11 = btVar;
                }
                btVar2.a("creativeView", nVar.a(a11));
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                eu euVar = fc.this.f25346b;
                List<eu.a> list = a10;
                if (list == null) {
                    return;
                }
                for (eu.a aVar : list) {
                    aVar.f25300a.cancel();
                }
                euVar.f25292a.removeAll(list);
            }
        });
    }

    public final void a() {
        this.f25356n = true;
        this.f25348e.clear();
        this.f25354k = null;
        fg fgVar = this.f25355l;
        if (fgVar != null) {
            fgVar.destroy();
            this.f25355l = null;
        }
    }

    private void a(final bt btVar, View view) {
        if (btVar.f24816h) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.fc.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fc.this.f25353j.a(view2, btVar);
                }
            });
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private void a(final cg cgVar, fj fjVar) {
        bv bvVar = (bv) cgVar.f24828t;
        long currentTimeMillis = System.currentTimeMillis();
        if (bvVar != null) {
            long j10 = bvVar.f24845z;
            if (0 != j10) {
                currentTimeMillis = j10;
            }
        }
        if (bvVar != null) {
            bvVar.f24845z = currentTimeMillis;
        }
        fjVar.setClickable(false);
        fjVar.setId(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        fjVar.a(cgVar);
        bt btVar = cgVar.f24833y;
        if (btVar != null) {
            cgVar.a((cg) btVar);
        }
        fjVar.setQuartileCompletedListener(new fj.c() { // from class: com.inmobi.media.fc.7
            @Override // com.inmobi.media.fj.c
            public final void a(byte b10) {
                if (fc.this.f25350g.f25905j || !(fc.this.f25350g instanceof o)) {
                    return;
                }
                ((o) fc.this.f25350g).a(cgVar, b10);
                if (3 == b10) {
                    try {
                        o oVar = (o) fc.this.f25350g;
                        cg cgVar2 = cgVar;
                        if (!((Boolean) cgVar2.f24830v.get("didSignalVideoCompleted")).booleanValue()) {
                            oVar.o();
                            n.c e10 = oVar.e();
                            if (e10 != null) {
                                e10.h();
                            }
                        }
                        if (1 == oVar.getPlacementType()) {
                            oVar.c((bt) cgVar2);
                        }
                    } catch (Exception unused) {
                        String unused2 = fc.f25343d;
                    }
                }
            }
        });
        fjVar.setPlaybackEventListener(new fj.b() { // from class: com.inmobi.media.fc.8
            @Override // com.inmobi.media.fj.b
            @SuppressLint({"SwitchIntDef"})
            public final void a(byte b10) {
                if (fc.this.f25350g.f25905j || !(fc.this.f25350g instanceof o)) {
                    return;
                }
                try {
                    if (b10 == 0) {
                        ((o) fc.this.f25350g).v();
                    } else if (b10 == 1) {
                        ((o) fc.this.f25350g).b(cgVar);
                    } else if (b10 == 2) {
                        ((o) fc.this.f25350g).c(cgVar);
                    } else if (b10 == 3) {
                        ((o) fc.this.f25350g).d(cgVar);
                    } else if (b10 != 5) {
                    } else {
                        ((o) fc.this.f25350g).g(cgVar);
                    }
                } catch (Exception e10) {
                    String unused = fc.f25343d;
                    gg.a().a(new hg(e10));
                }
            }
        });
        fjVar.setMediaErrorListener(new fj.a() { // from class: com.inmobi.media.fc.9
            @Override // com.inmobi.media.fj.a
            public final void a() {
                if (fc.this.f25350g.f25905j || !(fc.this.f25350g instanceof o)) {
                    return;
                }
                try {
                    ((o) fc.this.f25350g).a(cgVar);
                } catch (Exception unused) {
                    String unused2 = fc.f25343d;
                }
            }
        });
        n nVar = this.f25350g;
        if (nVar.f25905j || !(nVar instanceof o)) {
            return;
        }
        try {
            ((o) nVar).a(fjVar);
        } catch (Exception unused) {
        }
    }
}
